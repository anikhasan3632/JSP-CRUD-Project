package com.idb.jsp_crud.student;

import com.idb.jsp_crud.config.DbConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {

    public static void createData(Student student) {
        String sql = "insert into student (name, roll, subject, gpa) values(?, ?, ?, ?)";
        Connection conn = DbConfig.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getRoll());
            stmt.setString(3, student.getSubject());
            stmt.setString(4, student.getGpa());

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConfig.closeStatement(stmt, null);
        }
    }

    public static String updateData(Student student) {
        String sql = "update student set name = ?, roll = ?, subject = ?, gpa = ? where id = ?";
        Connection conn = DbConfig.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getRoll());
            stmt.setString(3, student.getSubject());
            stmt.setString(4, student.getGpa());
            stmt.setInt(5, student.getId());

            int rowCount = stmt.executeUpdate();
            if (rowCount > 0) {
                return "Data updated successfully";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConfig.closeStatement(stmt, null);
        }
        return "Couldn't update data for given ID";
    }

    public static String deleteData(int id) {
        String sql = "delete from student where id = ?";
        Connection conn = DbConfig.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            int deletedRowCount = stmt.executeUpdate();
            if (deletedRowCount > 0) {
                return "Data deleted successfully";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConfig.closeStatement(stmt, null);
        }
        return "Failed to delete student data with id " + id;
    }

    public static List<Student> readDataAsList() {
        List<Student> students = new ArrayList<>();
        Connection connection = DbConfig.getConnection();
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            stmt = connection.createStatement();
            boolean isExecuted = stmt.execute("select * from student");
            if (isExecuted) {
                resultSet = stmt.getResultSet();

                while (resultSet.next()) {
                    Student student = new Student();
                    student.setId(resultSet.getInt(1));
                    student.setName(resultSet.getString(2));
                    student.setRoll(resultSet.getString(3));
                    student.setSubject(resultSet.getString(4));
                    student.setGpa(resultSet.getString(5));

                    students.add(student);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConfig.closeStatement(stmt, resultSet);
        }
        return students;
    }

    public static Student findStudentById(int id) {
        Student student = new Student();
        Connection connection = DbConfig.getConnection();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            stmt = connection.prepareStatement("select * from student where id = ?");
            stmt.setInt(1, id);
            boolean isExecuted = stmt.execute();
            if (isExecuted) {
                resultSet = stmt.getResultSet();
                if (resultSet.next()) {
                    student.setId(resultSet.getInt(1));
                    student.setName(resultSet.getString(2));
                    student.setRoll(resultSet.getString(3));
                    student.setSubject(resultSet.getString(4));
                    student.setGpa(resultSet.getString(5));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbConfig.closeStatement(stmt, resultSet);
        }
        return student;
    }

}

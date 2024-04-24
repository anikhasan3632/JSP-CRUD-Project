package com.idb.jsp_crud.student;

public class Student {
    private int id;
    private String name;
    private String roll;
    private String subject;
    private String gpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "{" + "id:" + id + ", name:\"" + name + "\", roll:\"" + roll + "\", subject:\"" + subject + "\", gpa:\"" + gpa + "\"}";
    }
    
    
}

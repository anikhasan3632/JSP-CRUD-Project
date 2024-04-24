<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <%@include file="head-frag.jsp" %>
    <style>
        .background {
            background-image: url('https://getwallpapers.com/wallpaper/full/f/a/5/263510.jpg');
        }
    </style>
    <body class="background">
        
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4">
                    
                </div>
                <div class="col-md-4">
                    <br> 
                    <br> 
                    <h1 class="text-center">Student Form</h1>
                    <form action="${pageContext.request.contextPath}/student" method="post">
                        <input type="hidden" name="id" value="${student.id}" />
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" class="form-control" name="name" value="${student.name}" />
                        </div>
                        <div class="form-group">
                            <label>Roll</label>
                            <input type="text" class="form-control" name="roll" value="${student.roll}" />
                        </div>
                        <div class="form-group">
                            <label>Subject</label>
                            <input type="text" class="form-control" name="subject" value="${student.subject}" />
                        </div>
                        <div class="form-group">
                            <label>GPA</label>
                            <input type="text" class="form-control" name="gpa" value="${student.gpa}" />
                        </div>
                        <div class="form-group">
                            <button class="btn btn-primary btn-sm text-bold" type="submit"><svg xmlns="http://www.w3.org/2000/svg" width="13" height="13" fill="currentColor" class="bi bi-send-fill" viewBox="0 0 16 16">
                               <path d="M15.964.686a.5.5 0 0 0-.65-.65L.767 5.855H.766l-.452.18a.5.5 0 0 0-.082.887l.41.26.001.002 4.995 3.178 3.178 4.995.002.002.26.41a.5.5 0 0 0 .886-.083zm-1.833 1.89L6.637 10.07l-.215-.338a.5.5 0 0 0-.154-.154l-.338-.215 7.494-7.494 1.178-.471z"/>
                                 </svg> Submit</button>
                            <button class="btn btn-danger btn-sm text-bold" type="reset"><svg xmlns="http://www.w3.org/2000/svg" width="13" height="13" fill="currentColor" class="bi bi-x-square-fill" viewBox="0 0 16 16">
                          <path d="M2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2zm3.354 4.646L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 1 1 .708-.708"/>
                        </svg> Reset</button>
                            <a href="${pageContext.request.contextPath}/student">
                                <button class="btn btn-sm text-bold" type="button"><svg xmlns="http://www.w3.org/2000/svg" width="13" height="13" fill="currentColor" class="bi bi-view-list" viewBox="0 0 16 16">
                                  <path d="M3 4.5h10a2 2 0 0 1 2 2v3a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2v-3a2 2 0 0 1 2-2m0 1a1 1 0 0 0-1 1v3a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1v-3a1 1 0 0 0-1-1zM1 2a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13A.5.5 0 0 1 1 2m0 12a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13A.5.5 0 0 1 1 14"/>
                            </svg> View List</button>
                            </a>
                        </div>
                    </form>
                </div>
                                <div class="col-md-4">
                                    
                                </div>
            </div>
        </div>

    </body>
</html>

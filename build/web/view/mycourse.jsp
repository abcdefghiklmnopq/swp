<%-- 
    Document   : mycourse
    Created on : May 28, 2022, 1:47:26 AM
    Author     : thand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Course</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://kit.fontawesome.com/98df298cac.js" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/98df298cac.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/home.css"/>


        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
        <!-- Header side -->
        <jsp:include page="../view/base/header.jsp" /> 
        <!-- footer side -->
        <div >
            <c:forEach var = "j" begin = "1" end = "${requestScope.Courses.size()}">
                <c:if test = "${ j % 4 == 1}">
                    <div class="row">
                </c:if> 
                        
                    <div class="cards col-md-3 col-xs-6">
                        <div class="course-card">
                            <div class="card-infor"><a href="#">
                                <div class="card-img">
                                    <img src="images/courses/anh_course_temp.jpg" alt="">
                                </div>
                                <div class="card-title">
                                    <h4>${requestScope.Courses.get(j-1).title}</h4>
                                </div>
                                <p class="card-subject">${requestScope.Courses.get(j-1).tagline}</p>
                                
                                <p class="card-price">$99</p>
                                </a>
                            </div>
                        </div>
                    </div>
                    <c:set var = "i" scope = "request" value = "${j+1}"/>
                <c:if test = "${ i % 4 == 1}">
                    </div>
                </c:if> 
            </c:forEach>

        </div>

        
    </body>
    <jsp:include page="../view/base/footer.jsp" />  
</html>

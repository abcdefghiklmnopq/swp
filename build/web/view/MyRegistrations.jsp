<%-- 
    Document   : MyRegistrations
    Created on : May 30, 2022, 3:35:20 PM
    Author     : thand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Registion</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://kit.fontawesome.com/98df298cac.js" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/98df298cac.js" crossorigin="anonymous"></script>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <jsp:include page="../view/base/header.jsp" /> 
        <link href="css/courseDetail.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="row text-center content-detail">
            <div class="col-lg-2 col-sm-12">
                <h4 style="text-align: center; margin: 5%;">All Subject Category</h4>
                <div class="scroll">
                    <c:forEach items="${requestScope.Categorys}" var="Category">
                        <div class="subject">
                            <a href="#">${Category.value}</a>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <div class="col-lg-10 col-sm-12" >
                <table border="1" style="width: 90%">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>subject</th>
                            <th>registration time</th>
                            <th>package</th>
                            <th>total cost</th>
                            <th>status</th>
                            <th>valid from</th>
                            <th>valid to</th>
                            <th>Edit</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>abcd</td>
                            <td>abcd</td>
                            <td>abcd</td>
                            <td>abcd</td>
                            <td>abcd</td>
                            <td>abcd</td>
                            <td>abcd</td>
                            <td>abcd</td>
                            <td>abcd</td>
                        </tr>

                    </tbody>
                </table>
            </div>   

        </div>


    </body>
    <jsp:include page="../view/base/footer.jsp" />
</html>

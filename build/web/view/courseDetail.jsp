<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Detail|Edu-FCourse</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://kit.fontawesome.com/98df298cac.js" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/98df298cac.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="../css/home.css"/>
        <Style>

            #featuredsubjects{
                background-color: blanchedalmond;

            }
            .content-detail{
                margin-top:  3%;
            }
        </Style>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <link href="../css/courseDetail.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <!-- Header side -->
        <jsp:include page="../view/base/header.jsp" /> 
        <!-- Slider side -->

        <!--Content course detail-->
        <div class="row text-center content-detail">
            <div class="col-lg-2 col-sm-12">
                <h4 style="text-align: center; margin: 5%;">All Subject Category</h4>
                <div class="Categorys">
                    <c:forEach items="${requestScope.Categorys}" var="Category">
                        <div class="subject">
                            <a href="#">${Category.value}</a>
                        </div>
                    </c:forEach>
                </div>
            </div>
            <div class="col-lg-7 col-sm-12">
                <a href="#">
                    <div id="carouselExampleControls" class="carousel" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img class="d-block w-100" src="../images/courses/anh_course_temp.jpg" alt="First slide">
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100" src="../images/courses/anh_course_temp.jpg" alt="Second slide">
                            </div>
                            <div class="carousel-item">
                                <img class="d-block w-100" src="../images/courses/anh_course_temp.jpg" alt="Third slide">
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </a>
                <div class="ttr-post-title ">
                    <h1 class="post-title">${requestScope.Course.title}</h1>
                </div>
                <div>
                    <p>

                    <h4> About this Specialization</h4>
                    ${requestScope.Course.briefinfo}
                    </p>
                </div>
            </div>
            <div class="col-lg-3 col-sm-12  " id="featuredsubjects">
                <div class="course-price text-center"><br><br>
                    original price <del>$${requestScope.PricePackes.get(0).listPrice} </del>
                    <h4 class="price"> $${requestScope.PricePackes.get(0).salePrice} 
                        per month</h4><br><br>
                    <h6>When you subscribe you'll get access to:</h6>
                    <br>
                    <h7>Practice material,graded assignments, discussion forums and more.
                        Certificates to share on your resume, Linkedin, or CV. 
                        24/7 customer support 
                        and Easy cancellation</h7>
                </div><br>
                <div class="course-buy-now text-center">
                    <input type="button" value="Register This Courses">
                    <p><br>Start ${requestScope.now}</p>    
                </div>
            </div>
        </div>
        <div class="row text-center topic">
            
            <c:forEach items="${requestScope.Topics}" var="t">
                <div class="description">
                    
                </div>
                <div class="description">
                    <h6>${t.description}</h6>
                </div>
            </c:forEach>
        </div>


        <h1 class="text-center content-detail">featured subjects</h1> 
        <div class="row ">

            <div class="cards col-md-4 col-xs-6">
                <div class="course-card">
                    <div class="card-infor">
                        <div class="card-img">
                            <img src="../images/courses/anh_course_temp.jpg" alt="">

                        </div>

                        <div class="card-title">
                            <a href="#">SWP</a>
                        </div>
                        <p class="card-subject">Soft Ware</p>
                        <p class="card-price">$99</p>
                    </div>
                </div>
            </div>
            <div class="cards col-md-4 col-xs-6">
                <div class="course-card">
                    <div class="card-infor">
                        <div class="card-img">
                            <img src="../images/courses/anh_course_temp.jpg" alt="">
                        </div>
                        <div class="card-title">
                            <a href="#">SWP</a>
                        </div>
                        <p class="card-subject">Soft Ware</p>
                        <p class="card-price">$99</p>
                    </div>
                </div>
            </div>
            <div class="cards col-md-4 col-xs-6">
                <div class="course-card ">
                    <div class="card-infor">
                        <div class="card-img">
                            <img src="../images/courses/anh_course_temp.jpg" alt="">
                        </div>
                        <div class="card-title">
                            <a href="#">SWP</a>
                        </div>
                        <p class="card-subject">Soft Ware</p>
                        <p class="card-price">$99</p>
                    </div>
                </div>
            </div>
        </div>


        <!-- footer side -->
        <jsp:include page="../view/base/footer.jsp" />    
    </body>

</html>
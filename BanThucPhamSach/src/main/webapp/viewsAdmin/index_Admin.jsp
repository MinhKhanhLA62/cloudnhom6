<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<!-- <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png"> -->
	<!-- <link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png"> -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Admin</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="${pageContext.request.contextPath}/css/2.bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="${pageContext.request.contextPath}/css/animate.min.css" rel="stylesheet"/> 

    <!--  Paper Dashboard core CSS    -->
    <link href="${pageContext.request.contextPath}/css/paper-dashboard.css" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="${pageContext.request.contextPath}/css/demo.css" rel="stylesheet" /> 


    <!--  Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
    <link href="${pageContext.request.contextPath}/css/themify-icons.css" rel="stylesheet">



    <link rel="stylesheet" href="<c:url value="/css/style.css"/>" type="text/css">
</head>
<body>

<div class="wrapper">
 <!-- header -->
 <%@ include file="/views/header_admin.jsp" %>
 <!-- end header -->

        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-warning text-center">
                                            <i class="ti-server"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Số lượng loại sản phẩm</p>
                                            <c:set var="total" value="${0}"/>
                                            <c:forEach items="${allLoaiSanPham}" var="sp">
                                            	<c:set var="total" value="${total+1}"/>
                                            </c:forEach>
                                            ${total}
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr />
                                    <div class="stats">
                                        <i class="ti-reload"></i> Cập nhật
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-success text-center">
                                            <i class="ti-wallet"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Số lượng sản phẩm</p>
                                            <c:set var="total" value="${0}"/>
                                            <c:forEach items="${allSanPham}" var="sp">
                                            	<c:set var="total" value="${total+1}"/>
                                            </c:forEach>
                                            ${total}
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr />
                                    <div class="stats">
                                        <i class="ti-reload"></i> Cập nhật
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-danger text-center">
                                            <i class="ti-pulse"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Số lượng tài khoản KH</p>
                                            <c:set var="total" value="${0}"/>
                                            <c:forEach items="${allTaiKhoan}" var="sp">
                                            	<c:set var="total" value="${total+1}"/>
                                            </c:forEach>
                                            ${total}
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr />
                                    <div class="stats">
                                        <i class="ti-reload"></i> Cập nhật
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-info text-center">
                                            <i class="ti-twitter-alt"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Số lượng đơn hàng</p>
                                            <c:set var="total" value="${0}"/>
                                            <c:forEach items="${allDonHang}" var="sp">
                                            	<c:set var="total" value="${total+1}"/>
                                            </c:forEach>
                                            ${total}
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr />
                                    <div class="stats">
                                        <i class="ti-reload"></i> Cập nhật
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">

                    <div class="col-md-9">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Biểu đồ tình trạng sản phẩm</h4>
                                <p class="category">24 giờ qua</p>
                            </div>
                            <div class="content">
                                <div id="chartHours" class="ct-chart"></div>
                                <div class="footer">
                                    <div class="chart-legend">
                                        <i class="fa fa-circle text-info"></i> Số lượng xem thông tin chi tiết SP
                                        <i class="fa fa-circle text-danger"></i> Số lượng sản phẩm đã bán
                                        <i class="fa fa-circle text-warning"></i> Số lượng sản phẩm bị hủy mua
                                    </div>
                                    <hr>
                                    <div class="stats">
                                        <i class="ti-reload"></i> Cập nhật 10 phút trước
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="blog__sidebar__item">
                            <h4>Tin mới nhất</h4>
                            <div class="blog__sidebar__recent">
                                <a href="https://ducladeyeuthuongkhongphaideghet.blogspot.com/2022/11/10-loai-rau-bao-ve-gan.html" class="blog__sidebar__recent__item" target="_blank">
                                    <div class="blog__sidebar__recent__item__pic">
                                        <img src="img/blog/sidebar/sr-1.jpg" alt="">
                                    </div>
                                    <div class="blog__sidebar__recent__item__text">
                                        <h6>10 Loại Rau Bảo Vệ Gan</h6>
                                        <span> 30-11-2023 11:31 AM</span>
                                    </div>
                                </a>
                                <a href="https://ducladeyeuthuongkhongphaideghet.blogspot.com/2022/11/mach-ban-can-bang-dinh-duong-bua-trong.html" class="blog__sidebar__recent__item" target="_blank">
                                    <div class="blog__sidebar__recent__item__pic">
                                        <img src="img/blog/sidebar/sr-2.jpg" alt="">
                                    </div>
                                    <div class="blog__sidebar__recent__item__text">
                                        <h6>Mách Bạn Cân Bằng Dinh Dưỡng <br> Bữa Ăn Trong Ngày</h6>
                                        <span>3-11-2023 11:31 PM</span>
                                    </div>
                                </a>
                                <a href="https://ducladeyeuthuongkhongphaideghet.blogspot.com/2022/11/4-nguyen-tac-giup-ban-giam-can-bang-rau.html" class="blog__sidebar__recent__item" target="_blank">
                                    <div class="blog__sidebar__recent__item__pic">
                                        <img src="img/blog/sidebar/sr-3.jpg" alt="">
                                    </div>
                                    <div class="blog__sidebar__recent__item__text">
                                        <h6>4 Nguyên Tắc Giúp Bạn Giảm Cân Bằng Rau Quả</h6>
                                        <span>3-10-2023 10:01 PM</span>
                                    </div>
                                </a>
                            </div>
                        </div>
                            </div>
                        </div>
                    </div>
                    
                </div>
                <!-- <div class="row">
                    <div class="col-md-6">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Email Statistics</h4>
                                <p class="category">Last Campaign Performance</p>
                            </div>
                            <div class="content">
                                <div id="chartPreferences" class="ct-chart ct-perfect-fourth"></div>

                                <div class="footer">
                                    <div class="chart-legend">
                                        <i class="fa fa-circle text-info"></i> Open
                                        <i class="fa fa-circle text-danger"></i> Bounce
                                        <i class="fa fa-circle text-warning"></i> Unsubscribe
                                    </div>
                                    <hr>
                                    <div class="stats">
                                        <i class="ti-timer"></i> Campaign sent 2 days ago
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card ">
                            <div class="header">
                                <h4 class="title">2015 Sales</h4>
                                <p class="category">All products including Taxes</p>
                            </div>
                            <div class="content">
                                <div id="chartActivity" class="ct-chart"></div>

                                <div class="footer">
                                    <div class="chart-legend">
                                        <i class="fa fa-circle text-info"></i> Tesla Model S
                                        <i class="fa fa-circle text-warning"></i> BMW 5 Series
                                    </div>
                                    <hr>
                                    <div class="stats">
                                        <i class="ti-check"></i> Data information certified
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> -->
            </div>
        </div>

<!-- footer -->  
  <%@ include file="/views/footer_admin.jsp" %>
<!-- end footer -->  
        

    </div>
</div>


</body>

    <!--   Core JS Files   -->
    <script src="${pageContext.request.contextPath}/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/js/2.bootstrap.min.js" type="text/javascript"></script>

	<!--  Checkbox, Radio & Switch Plugins -->
	<script src="${pageContext.request.contextPath}/js/bootstrap-checkbox-radio.js"></script>

	<!--  Charts Plugin -->
	<script src="${pageContext.request.contextPath}/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="${pageContext.request.contextPath}/js/bootstrap-notify.js"></script>

    <!--  Google Maps Plugin    -->
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>

    <!-- Paper Dashboard Core javascript and methods for Demo purpose -->
	<script src="${pageContext.request.contextPath}/js/paper-dashboard.js"></script>

	<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
	<script src="${pageContext.request.contextPath}/js/2.demo.js"></script>

	<script type="text/javascript">
    	$(document).ready(function(){

        	demo.initChartist();

        	$.notify({
            	icon: 'ti-gift',
            	message: "Welcome admin to <b>DQB Shop</b>."

            },{
                type: 'success',
                timer: 4000
            });

    	});
	</script>

</html>


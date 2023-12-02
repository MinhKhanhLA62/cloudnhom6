<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- Thư viên để kết nối đúng trong java bằng JSTL-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>DBQ Shop</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/css/font-awesome.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/css/elegant-icons.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/css/nice-select.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/css/jquery-ui.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/css/owl.carousel.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/css/slicknav.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>" type="text/css">
</head>

<body>
 <!-- header -->
 <%@ include file="/views/header.jsp" %>
 <!-- end header -->
    <!-- Breadcrumb Section Begin -->
    <section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="breadcrumb__text">
                        <h2>Thanh toán</h2>
                        <div class="breadcrumb__option">
                            <a href="trang-chu">Home</a>
                            <span>Thanh toán</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

    <!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h6><span class="icon_tag_alt"></span>Bạn đã có tài khoản?<a href="dang-nhap">Ấn vào đây để đăng nhập</a>
                    </h6>
                </div>
            </div>
            <div class="checkout__form">
                <h4>Thông tin thanh toán</h4>
                <form action="dat-hang" method="post">
                    <div class="row">
                        <div class="col-lg-8 col-md-6">
                            <div class="checkout__input">
                                <p>Họ và tên<span>*</span></p>
                                <input type="text" name="hoten" placeholder="Họ tên của bạn">
                            </div>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Số điện thoại<span>*</span></p>
                                        <input type="text" name="sdt" placeholder="Số điện thoại của bạn">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Địa chỉ email<span>*</span></p>
                                        <input type="text" name="email" placeholder="nhom09@student.hcmute.edu.vn">
                                    </div>
                                </div>
                            </div>
                            <div class="checkout__input">
                                <p>Địa chỉ<span>*</span></p>
                                <input type="text" name="diachi" placeholder="VD:1 Đ. Võ Văn Ngân, Linh Chiểu, Thành Phố Thủ Đức, Thành phố Hồ Chí Minh, Việt Nam">
                            </div>
                            <!-- <div class="checkout__input">
                                <p>Address<span>*</span></p>
                                <input type="text" placeholder="Street Address" class="checkout__input__add">
                                <input type="text" placeholder="Apartment, suite, unite ect (optinal)">
                            </div>
                            <div class="checkout__input">
                                <p>Town/City<span>*</span></p>
                                <input type="text">
                            </div>
                            <div class="checkout__input">
                                <p>Country/State<span>*</span></p>
                                <input type="text">
                            </div>
                            <div class="checkout__input">
                                <p>Postcode / ZIP<span>*</span></p>
                                <input type="text">
                            </div>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Phone<span>*</span></p>
                                        <input type="text">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Email<span>*</span></p>
                                        <input type="text">
                                    </div>
                                </div>
                            </div>
                            <div class="checkout__input__checkbox">
                                <label for="acc">
                                    Create an account?
                                    <input type="checkbox" id="acc">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                            <p>Create an account by entering the information below. If you are a returning customer
                                please login at the top of the page</p>
                            <div class="checkout__input">
                                <p>Account Password<span>*</span></p>
                                <input type="text">
                            </div>
                            <div class="checkout__input__checkbox">
                                <label for="diff-acc">
                                    Ship to a different address?
                                    <input type="checkbox" id="diff-acc">
                                    <span class="checkmark"></span>
                                </label>
                            </div> -->
                            <div class="checkout__input">
                                <p>Ghi chú đơn hàng (tuỳ chọn)<span></span></p>
                                <input type="text" name="ghichu"
                                    placeholder="Ghi chú về đơn hàng, ví dụ: thời gian hay chỉ dẫn địa điểm giao hàng chi tiết hơn.">
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="checkout__order">
                                <h4>Đơn Hàng của bạn</h4>
                                <div class="checkout__order__products">Sản phẩm<span>Tạm tính</span></div>
                                <ul>
                                	<c:forEach items="${sessionScope.cart}" var="map">
                                    	<li>${map.value.getMaSP().getTenSP()}<span> ${map.value.getMaSP().getGiaDaGiam()}</span></li>
                                   
                                    </c:forEach>
                                    <c:set var="total" value="${0}"/>
                            		<c:forEach items="${sessionScope.cart}" var="map">
                            			<c:set var="total" value="${total + map.value.getMaSP().getGiaDaGiam() * map.value.getSoLuong()}"/>
                            		</c:forEach>
	                            
                                    	<c:set var="vat" value="${total*10/100}"/>
                           			 	<li>VAT<span>${vat}</span></li>
                                </ul>
                                <div class="checkout__order__subtotal">Tạm tính<span>${total}</span></div>
                                <div class="checkout__order__total">Tổng tiền<span>${total+vat}</span></div>
                                <!-- <div class="checkout__input__checkbox">
                                    <label for="acc-or">
                                        Create an account?
                                        <input type="checkbox" id="acc-or">
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                                <p>Lorem ipsum dolor sit amet, consectetur adip elit, sed do eiusmod tempor incididunt
                                    ut labore et dolore magna aliqua.</p> -->
                                <div class="checkout__input__checkbox">
                                    <label for="payment">
                                        Trả tiền mặt khi nhận hàng
                                        <input type="checkbox" id="payment">
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                                <div class="checkout__input__checkbox">
                                    <label for="paypal">
                                        Thanh toán qua bằng thẻ
                                        <input type="checkbox" id="paypal">
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                                <c:choose>
                            		<c:when test="${sessionScope.account != null }">
                                		<button type="submit" class="site-btn">Đặt hàng</button>
                                	</c:when>
	                            	<c:otherwise>
		                            	<h6><span class="icon_tag_alt"></span><a href="dang-nhap">Ấn vào đây để đăng nhập</a></h6>	 
	                            	</c:otherwise>
							</c:choose>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->
<!-- footer -->  
  <%@ include file="/views/footer.jsp" %>
<!-- end footer -->  

    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>



</body>
</html>

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
                        <h2>Giỏ hàng</h2>
                        <div class="breadcrumb__option">
                            <a href="trang-chu">Home</a>
                            <span>Giỏ hàng</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

    <!-- Shoping Cart Section Begin -->
    <section class="shoping-cart spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__table">
                        <table>
                            <thead>
                                <tr>
                                    <th class="shoping__product">Sản phẩm</th>
                                    <th>Giá</th>
                                    <th>Số lượng</th>
                                    <th>Tạm tính</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                            
                            	<c:forEach items="${sessionScope.cart}" var="map">
	                                <tr>
	                                    <td class="shoping__cart__item">
	                                        <img src="${pageContext.request.contextPath}/img/ImageSP/${map.value.getMaSP().getHinhAnh()}" alt="" style="height: 160px;width: 260px">
	                                        <h5> ${map.value.getMaSP().getTenSP()}</h5>
	                                    </td>
	                                    <td class="shoping__cart__price">
	                                        ${map.value.getMaSP().getGiaDaGiam()}
	                                    </td>
	                                    <td class="shoping__cart__quantity">
	                                       <div class="quantity">
	                                           <!--  <div class="pro-qty"> -->
	                                            	<b>${map.value.getSoLuong()}</b>
	                                                <%-- <input type="label" value="${map.value.getSoLuong()}"> --%>
	                                           <!-- </div> --> 
	                                        </div> 
	                                    </td>
	                                    <td class="shoping__cart__total">
	                                        ${map.value.getMaSP().getGiaDaGiam() * map.value.getSoLuong()}
	                                    </td>
	                                    <td class="shoping__cart__item__close">
	                                        <a href="${pageContext.request.contextPath}/xoa-san-pham?maSP=${map.value.getMaSP().getMaSP()}"><span class="icon_close"></span></a>
	                                    </td>
	                                </tr>
                                </c:forEach>
                                
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__btns">
                        <a href="cua-hang?phanLoai=all" class="primary-btn cart-btn">Tiếp tục xem sản phẩm</a>
                        <a href="thanh-toan" class="primary-btn cart-btn cart-btn-right"><span class="icon_loading"></span>
                            Cập nhật giỏ hàng</a>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="shoping__continue">
                        <div class="shoping__discount">
                            <h5>Mã giảm giá</h5>
                            <form action>
                                <input type="text" name="maGiamGia" placeholder="Nhập mã phiếu giảm giá">
                                <button type="submit" class="site-btn">ÁP DỤNG </button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="shoping__checkout">
                        <h5>Cộng giỏ hàng</h5>
                        <ul>
                            <li>Tạm tính
	                            <span>
	                            	<c:set var="total" value="${0}"/>
	                            		<c:forEach items="${sessionScope.cart}" var="map">
	                            			<c:set var="total" value="${total + map.value.getMaSP().getGiaDaGiam() * map.value.getSoLuong()}"/>
	                            		</c:forEach>
	                            ${total}
	                            </span>
	                            
                            </li>
                            <c:set var="vat" value="${total*10/100}"/>
                            <li>VAT<span>${vat}</span></li>
                            
                            <li>Tổng tiền<span> ${total + vat}</span></li>
                        </ul>
                        <a href="xac-nhan-dat-hang" class="primary-btn">Tiến hành thanh toán</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Shoping Cart Section End -->
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

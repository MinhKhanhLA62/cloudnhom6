<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <!-- Page Preloder -->
    <!-- <div id="preloder">
        <div class="loader"></div>
    </div> -->

    <!-- Humberger Begin -->
    <!-- <div class="humberger__menu__overlay"></div>
    <div class="humberger__menu__wrapper">
        <div class="humberger__menu__logo">
            <a href="#"><img src="img/logo.png" alt=""></a>
        </div>
        <div class="humberger__menu__cart">
            <ul>
                <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
            </ul>
            <div class="header__cart__price">item: <span>$150.00</span></div>
        </div>
        <div class="humberger__menu__widget">
            <div class="header__top__right__language">
                <img src="img/language.png" alt="">
                <div>English</div>
                <span class="arrow_carrot-down"></span>
                <ul>
                    <li><a href="#">Spanis</a></li>
                    <li><a href="#">English</a></li>
                </ul>
            </div>
            <div class="header__top__right__auth">
                <a href="#"><i class="fa fa-user"></i> Login</a>
            </div>
        </div>
        <nav class="humberger__menu__nav mobile-menu">
            <ul>
                <li class="active"><a href="./index.jsp">Home</a></li>
                <li><a href="./shop-grid.jsp">Shop</a></li>
                <li><a href="#">Pages</a>
                    <ul class="header__menu__dropdown">
                        <li><a href="./shop-details.jsp">Shop Details</a></li>
                        <li><a href="./shoping-cart.jsp">Shoping Cart</a></li>
                        <li><a href="./checkout.jsp">Check Out</a></li>
                        <li><a href="./blog-details.jsp">Blog Details</a></li>
                    </ul>
                </li>
                <li><a href="./blog.jsp">Tin Tức</a></li>
                <li><a href="./contact.jsp">Contact</a></li>
            </ul>
        </nav>
        <div id="mobile-menu-wrap"></div>
        <div class="header__top__right__social">
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-linkedin"></i></a>
            <a href="#"><i class="fa fa-pinterest-p"></i></a>
        </div>
        <div class="humberger__menu__contact">
            <ul>
                <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                <li>Free Shipping for all Order of $99</li>
            </ul>
        </div>
    </div> -->
    <!-- Humberger End -->

    <!-- Header Section Begin -->
    <header class="header">
        <!-- Trang thông tin  trên cùng -->
        <div class="header__top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="header__top__left">
                            <ul>
                                <li><i class="fa fa-envelope"></i> nhom09@gmail.com</li>
                                <li>Rau xanh nâng tầm sẻ chia</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="header__top__right">

                            <!-- Thông tin liên hệ -->
                            <div class="header__top__right__social">
                                <a href="https://www.facebook.com/nmkla62"><i class="fa fa-facebook"></i></a>
                                <!-- <a href="#"><i class="fa fa-twitter"></i></a> -->
                                <a href="https://instagram.com/nguyenminh3625?igshid=OGQ5ZDc2ODk2ZA=="><i class="fa fa-linkedin"></i></a>
                                <!-- <a href="#"><i class="fa fa-pinterest-p"></i></a> -->
                            </div>

                            <!-- Chọn ngôn ngữ -->
                            <div class="header__top__right__language">
                                <img src="img/co_VN.png" alt="" class="img_co_VN">
                                <div>Việt Nam</div>
                                <span class="arrow_carrot-down"></span>
                                <ul>
                                    <li><a href="#">China</a></li>
                                    <li><a href="#">English</a></li>
                                </ul>
                            </div>
                            <!-- Chỗ để đăng nhập  -->
                            <c:choose>
                            	<c:when test="${sessionScope.account == null }">
		                            <div class="header__top__right__auth  ">
		                                <a href="dang-nhap"><i class="fa fa-user"></i>Đăng nhập</a>
		                            </div>
		                            <div class="header__top__right__auth  can_chinh_DK">
		                                <a href="dang-nhap"><i class="fa fa-user"></i>Đăng kí</a>
		                            </div>
	                            </c:when>
	                            <c:otherwise>
	                            	<div class="header__top__right__auth  ">
		                                <a href="dang-nhap"><i class="fa fa-user"></i>${sessionScope.account.ten}</a>
		                            </div>
		                            <div class="header__top__right__auth  can_chinh_DK">
		                                <a href="login.jsp"><i class="fa fa-user"></i>Đăng xuất</a>
		                            </div>
	                            </c:otherwise>
							</c:choose>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <!-- logo  -->
                <div class="col-lg-3">
                    <div class="header__logo">
                        <a href="trang-chu" class="img_logoshop"><img src="img/DBQ Shop.png" alt="" ></a>
                    </div>
                </div>
                <!-- Lựa chọn chuyển trang -->
                <div class="col-lg-6">
                    <nav class="header__menu">
                        <ul>
                            <li><a href="trang-chu">Trang chủ</a></li>
                            <li><a href="cua-hang?phanLoai=all">Cửa hàng</a></li>
                           <!--  <li><a href="#">a</a>
                                <ul class="header__menu__dropdown">
                                    <li><a href="./shop-details.jsp">Shop Details</a></li>
                                </ul>
                            </li> -->
                            <li><a href="tin-tuc">Tin Tức</a></li>
                            <li><a href="lien-he">Liên hệ</a></li>
                        </ul>
                    </nav>
                </div>
                <!-- Túi hàng -->
                <div class="col-lg-3">
                    <div class="header__cart">
                        <ul>
                        <c:set var="count" value="${0}"/>
                        <c:forEach items="${sessionScope.cart}" var="map">
                        	<c:set var="count" value="${count + map.value.getSoLuong()}"/>
                        </c:forEach>
                        
                            <!-- <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li> -->
                            <li><a href="thanh-toan"><i class="fa fa-shopping-bag"></i><span>${count}</span></a></li>
                            <li><b>Túi hàng</b></li>
                        </ul>
                        <!-- <div class="header__cart__price">item: <span>$150.00</span></div> -->
                    </div>
                </div>
            </div>
            <div class="humberger__open">
                <i class="fa fa-bars"></i>
            </div>
        </div>
    </header>
    <!-- Header Section End -->

        <!-- Hero Section Begin -->
        <section class="hero hero-normal">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>Danh sách hàng</span>
                            </div>
                            <ul>
	                            <c:forEach items="${allLoaiSanPham}" var="sp">
	                                <li><a href="cua-hang?phanLoai=${sp.getMaLoai()}">${sp.getTenLoai()}</a></li>
	                            </c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="hero__search">
                            <!-- tìm kiếm dựa nào tên sản phẩm -->
                            <div class="hero__search__form">
                                <form action="tim-kiem">
                                <!-- <div class="hero__search__categories">
                                    All Categories
                                    <span class="arrow_carrot-down"></span>
                                </div> -->
                                <input type="text" name="thongTinSP" value="${value_thongTinSP}" placeholder="Bạn cần gì?">
                                <button type="submit" class="site-btn">TÌM KIẾM</button>
                            </form>
                            </div>
                            <!-- Thông tin liên lạc -->
                            <div class="hero__search__phone">
                                <div class="hero__search__phone__icon">
                                    <i class="fa fa-phone"></i>
                                </div>
                                <div class="hero__search__phone__text">
                                    <span>Mọi thắc mắc liên hệ</span>
                                    <h5>+84 18.04.2002</h5>       
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Hero Section End -->   
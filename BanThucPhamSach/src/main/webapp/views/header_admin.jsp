<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="sidebar" data-background-color="white" data-active-color="danger">

    <!--
		Tip 1: you can change the color of the sidebar's background using: data-background-color="white | black"
		Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
	-->

    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="trang-chu-admin" class="simple-text">
                   ADMIN : Nhóm 09
                </a>
            </div>

            <ul class="nav">
                <li >
                    <a href="trang-chu-admin">
                        <i class="ti-panel"></i>
                        <p>Trang chính</p>
                    </a>
                </li>
                <li>
                    <a href="thong-tin-khach-hang">
                        <i class="ti-user"></i>
                        <p>Thông tin khách hàng</p>
                    </a>
                </li>
                <li>
                    <a href="danh-sach-san-pham-admin?phanLoai=all">
                        <i class="ti-view-list-alt"></i>
                        <p>Sản phẩm</p>
                    </a>
                </li>
                <li>
                    <a href="loai-san-pham-admin">
                        <i class="ti-text"></i>
                        <p>Loại sản phẩm</p>
                    </a>
                </li>
                <li>
                    <a href="danh-sach-gop-y-admin">
                        <i class="ti-pencil-alt2"></i>
                        <p>Thông tin đánh giá</p>
                    </a>
                </li>
                <li>
                    <a href="danh-sach-hoa-don-admin">
                        <i class="ti-map"></i>
                        <p>Danh sách hóa đơn</p>
                    </a>
                </li>
                <li>
                    <a href="doanh-thu-admin">
                        <i class="ti-money"></i>
                        <p>Xem doanh thu</p>
                    </a>
                </li>
                <!-- <li>
                    <a href="notifications.html">
                        <i class="ti-bell"></i>
                        <p>Notifications</p>
                    </a>
                </li> -->
				<!-- <li class="active-pro">
                    <a href="upgrade.html">
                        <i class="ti-export"></i>
                        <p>Upgrade to PRO</p>
                    </a>
                </li> -->
            </ul>
    	</div>
    </div>

    <div class="main-panel">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar bar1"></span>
                        <span class="icon-bar bar2"></span>
                        <span class="icon-bar bar3"></span>
                    </button>
                    <a class="navbar-brand" href="#">QUẢN LÍ CỦA HÀNG</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="ti-panel"></i>
								<p>Thống kê</p>
                            </a>
                        </li>
                        <li class="dropdown">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <i class="ti-bell"></i>
                                    <p class="notification">5</p>
									<p>Thông báo</p>
									<b class="caret"></b>
                              </a>
                              <ul class="dropdown-menu">
                                <li><a href="#">Thông báo 1</a></li>
                                <li><a href="#">Thông báo 2</a></li>
                                <li><a href="#">Thông báo 3</a></li>
                                <li><a href="#">Thông báo 4</a></li>
                                <li><a href="#">Thông báo khác</a></li>
                              </ul>
                        </li>
						<li>
                            <a href="#">
								<i class="ti-settings"></i>
								<p>Cài đặt</p>
                            </a>
                        </li>
                    </ul>

                </div>
            </div>
        </nav>
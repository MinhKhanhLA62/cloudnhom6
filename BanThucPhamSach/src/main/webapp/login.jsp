<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body background="img/background.jpg">
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">
		
			<div class="login">
				<form action="dang-nhap" method="post">
					<label for="chk" aria-hidden="true">DBQ Shop</label>
					<input type="text" name="user" placeholder="Số điện thoại" required="">
					<input type="password" name="pass" placeholder="Mật khẩu của bạn" required="">
					<button type="submit">Đăng nhập</button>
					<c:if test="${mess != null}">
						<h3 class="" style="text-align: center;color: #f44336;">${mess}</h3>
					</c:if>
				</form>
			</div>
			<div class="signup">
				<form action="dang-ky" method="post">
					<label for="chk" aria-hidden="true">Đăng kí</label>
					<input type="text" name="ten" placeholder="Họ và tên" required="">
					<input type="text" name="diaChi" placeholder="Địa chỉ" required="">
					<input type="text" name="SDT" placeholder="Số điện thoại" required="">
					<input type="password" name="pswd" placeholder="Mật khẩu" required="">
					
					<button>Đăng kí</button>
				</form>
			</div>
			
	</div>
</body>
</html>
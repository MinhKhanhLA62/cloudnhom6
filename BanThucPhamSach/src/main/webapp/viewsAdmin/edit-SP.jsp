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

</head>
<body>

<div class="wrapper">
 <!-- header -->
 <%@ include file="/views/header_admin.jsp" %>
 <!-- end header -->
<form action="xac-nhan-sua-san-pham-admin">
    <div class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class="header">
                            <h4 class="title">Sửa sản phẩm</h4>
                            
                        </div>
                        <div class="content table-responsive table-full-width">
                            <table class="table table-striped">
                                <thead>
                                    <th>STT</th>
                                    <th></th>
                                    <th>Nội dung</th>
                                    
                                </thead>
                                <tbody>
                                    <tr>
                                        <input name="maSP" type="hidden" class="col-md-12 form-control border-input" placeholder="" value="${sp.getMaSP()}">
                                    </tr>
                                    <tr>
                                    	<c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td>                                        
                                        <td>
                                            Tên sản phẩm
                                        </td>
                                        <td> 
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <input name="tenSP" type="text" class="col-md-12 form-control border-input" placeholder="" value="${sp.getTenSP()}">
                                                </div>
                                            </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                    	<c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td>                                        
                                        <td>
                                            Giá sản phẩm
                                        </td>
                                        <td> 
                                        	<p id="errorMsgPrice" style="color:red"></p>
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <input id="priceInput" name="Gia" type="number" class="col-md-12 form-control border-input" placeholder="" value="${sp.getGiaSP()}" oninput="validateInput('priceInput', 'Giá sản phẩm phải lớn hơn 0', errorMsgPrice)">
                                                </div>
                                            </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                    	<c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td>                                        
                                        <td>
                                            SL tồn kho
                                        </td>
                                        <td> 
                                        	<p id="errorMsgSoLuong" style="color:red"></p>
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <input id="soLuongInput" name="soLuong" type="number" min="0" class="col-md-12 form-control border-input" placeholder="" value="${sp.getSoLuongTonKho()} " oninput="validateInput('soLuongInput', 'Số lượng tồn kho phải lớn hơn 0', errorMsgSoLuong)">
                                                </div>
                                            </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>                                        
                                        <c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td>  
                                        <td>
                                            Phân loại
                                        </td>
                                        <td> 
                                        <div class="row">
                                            <div class="col-md-12">
                                                <select name="phanLoai" class="form-select col-md-12 form-control border-input" aria-label="Default select example">
                                                    <option selected>Mã loại sản phẩm</option>                                 
													<!-- <option value="1">LSP001</option>
													<option value="2">LSP002</option>
													<option value="3">LSP003</option>
													<option value="4">LSP004</option>
													<option value="5">LSP005</option> -->
													<c:set var="count" value="${0}"/>
													<c:forEach items="${allLoaiSanPham}" var="sp" >
														<c:set var="count" value="${count+1}"/>
														<option value="${sp.getMaLoai()}">${sp.getMaLoai()}</option>
													</c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td> 
                                        <td>
                                            Đồ tươi khô
                                        </td>
                                        <td> 
                                        <div class="row">
                                            <div class="col-md-12">
                                                <select name="doTuoiKho" class="form-select col-md-12 form-control border-input" aria-label="Default select example">
                                                    <option selected>Lựa chọn loại:</option>
                                                    <option value="Đồ tươi">Đồ tươi</option>
                                                    <option value="Đồ khô">Đồ khô</option>
                                                </select>
                                            </div>
                                        </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>

                                    <tr>
                                    	<c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td>                                        
                                        <td>
                                            Phần trăm giảm giá
                                        </td>
                                        <td> 
                                        	<p id="errorMsgPhantramgiamgia" style="color:red"></p>
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <input id="PhantramgiamgiaInput" name="giamGia" type="number" class="col-md-12 form-control border-input" placeholder="" value="${sp.getGiamGia()}" oninput="validateInput('PhantramgiamgiaInput', 'Phần trăm giảm giá phải lớn hơn 0', errorMsgPhantramgiamgia)">
                                                </div>
                                            </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                    	<c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td>                                        
                                        <td>
                                            Mô tả
                                        </td>
                                        <td> 
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <input name="moTa" type="text" class="col-md-12 form-control border-input" placeholder="" value="${sp.getMoTaSP()}">
                                                </div>
                                            </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                    	<c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td>                                        
                                        <td>
                                            Ngày nhập
                                        </td>
                                        <td> 
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <input name="ngay" type="text" class="col-md-12 form-control border-input" placeholder="" value="${sp.getNgayNhapHang()}">
                                                </div>
                                            </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <c:set var="STT" value="${STT+1}"/>
                                        <td>${STT}</td>  
                                        <td>
                                            File ảnh
                                        </td>
                                        <td> 
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <input name="hinhAnh" type="file" class="form-control-file" id="exampleFormControlFile1">
                                                </div>
                                            </div>
                                        </td>    
                                        <td></td>
                                        <td></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="text-center" style="margin-bottom:30px;">
        <button type="submit" class="btn btn-info btn-fill btn-wd">Xác nhận lưu</button>
    </div>
 </form>   
<!-- footer -->  
  <%@ include file="/views/footer_admin.jsp" %>
<!-- end footer -->  
</body>

<!--   Core JS Files   -->
<script src="assets/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

<!--  Checkbox, Radio & Switch Plugins -->
<script src="assets/js/bootstrap-checkbox-radio.js"></script>

<!--  Charts Plugin -->
<script src="assets/js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script src="assets/js/bootstrap-notify.js"></script>

<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>

<!-- Paper Dashboard Core javascript and methods for Demo purpose -->
<script src="assets/js/paper-dashboard.js"></script>

<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
<script src="assets/js/demo.js"></script>

<script>
function validateInput(inputName, msg, errorMsgP) {
  var x = document.getElementById(inputName);
  if (x.value < 0) {
	  errorMsgP.textContent = msg;
  }
  else {
	  errorMsgP.textContent = "";
  }
}
</script>


</html>
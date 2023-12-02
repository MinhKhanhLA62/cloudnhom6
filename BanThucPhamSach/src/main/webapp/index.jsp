
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
 <%@ include file="/views/header_index.jsp" %>
 <!-- end header -->
 
    <!-- Categories Section Begin -->
    <section class="categories">
        <div class="container">
            <div class="row">
                <div class="categories__slider owl-carousel">
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-1.jpg">
                            <h5><a href="cua-hang?phanLoai=LSP003">Quả</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-2.jpg">
                            <h5><a href="cua-hang?phanLoai=LSP002">Củ</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-3.jpg">
                            <h5><a href="cua-hang?phanLoai=LSP001">Rau</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-4.jpg">
                            <h5><a href="cua-hang?phanLoai=LSP004">Hạt</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-5.jpg">
                            <h5><a href="cua-hang?phanLoai=LSP005">Đậu</a></h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Categories Section End -->

    <!-- Featured Section Begin -->
    <section class="featured spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="section-title">
                        <h2>Sản phẩm nổi bật</h2>
                    </div>
                    <div class="featured__controls">
                        <ul>
                            <li class="active" data-filter="*">All</li>
                            <li data-filter=".oranges">Đồ Tươi</li>
                            <li data-filter=".fresh-meat">Đồ khô</li>
                            <!-- <li data-filter=".vegetables">Vegetables</li>
                            <li data-filter=".fastfood">Fastfood</li> -->
                        </ul>
                    </div>
                </div>
            </div>
            <!-- Dữ liệu mặt hàng tiêu biểu -->
            <div class="row featured__filter">
            
            
            

            <c:forEach items="${allSanPhamDoTuoi}" var="sp">
	        	<div class="col-lg-3 col-md-4 col-sm-6 mix oranges">
	                <div class="featured__item">
	                    <div class="featured__item__pic set-bg" data-setbg="${pageContext.request.contextPath}/img/ImageSP/${sp.getHinhAnh()}">
	                        <ul class="featured__item__pic__hover">
	                            <!-- <li><a href="#"><i class="fa fa-heart"></i></a></li>-->
	                            <li><a href="thong-tin-san-pham?maSP=${sp.getMaSP()}"><i class="fa fa-info"></i></a></li> 
	                            <li><a href="<c:url value="/them-vao-gio?maSP=${sp.getMaSP()}&soLuong=1"></c:url>"><i class="fa fa-shopping-cart"></i></a></li>
	                        </ul>
	                    </div>
	                    
	                    <div class="featured__item__text">
	                        <h6><a href="thong-tin-san-pham?maSP=${sp.getMaSP()}">${sp.getTenSP()}</a></h6>
	                        <h5>${sp.getGiaSP()} VND</h5>
	                    </div>
	                </div>
	            </div>
            </c:forEach> 
            
            
            <c:forEach items="${allSanPhamDoKho}" var="sp">
	        	<div class="col-lg-3 col-md-4 col-sm-6 mix fresh-meat">
	                <div class="featured__item">
	                    <div class="featured__item__pic set-bg" data-setbg="${pageContext.request.contextPath}/img/ImageSP/${sp.getHinhAnh()}">
	                        <ul class="featured__item__pic__hover">
	                            <!-- <li><a href="#"><i class="fa fa-heart"></i></a></li>-->
	                            <li><a href="thong-tin-san-pham?maSP=${sp.getMaSP()}"><i class="fa fa-info"></i></a></li> 
	                            <li><a href="<c:url value="/them-vao-gio?maSP=${sp.getMaSP()}&soLuong=1"></c:url>"><i class="fa fa-shopping-cart"></i></a></li>
	                        </ul>
	                    </div>
	                    <div class="featured__item__text">
	                        <h6><a href="thong-tin-san-pham?maSP=${sp.getMaSP()}">${sp.getTenSP()}</a></h6>
	                        <h5>${sp.getGiaSP()} VND</h5>
	                    </div>
	                </div>
	            </div>
            </c:forEach>
            
                                      
            </div>
        </div>
    </section>
    <!-- Featured Section End -->

    <!-- Banner Begin -->
    <!-- <div class="banner">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="banner__pic">
                        <img src="img/banner/banner-1.jpg" alt="">
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="banner__pic">
                        <img src="img/banner/banner-2.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div> -->
    <!-- Banner End -->

    <!-- Latest Product Section Begin -->
    <section class="latest-product spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-6">
                    <div class="latest-product__text">
                        <h4>Sản phẩm mới</h4>
                        <div class="latest-product__slider owl-carousel">
                            <div class="latest-prdouct__slider__item">
                                                                                                         
                            	<c:forEach items="${top3SanPhamMoiNhat}" var="sp">
                            	
									<a href="thong-tin-san-pham?maSP=${sp.getMaSP()}" class="latest-product__item">
		                                <div class="latest-product__item__pic">
		                                    <img src="${pageContext.request.contextPath}/img/ImageSP/${sp.getHinhAnh()}" alt="">
		                                </div>
		                                <div class="latest-product__item__text">
		                                    <h6>${sp.getTenSP()}</h6>
		                                    <span>${sp.getGiaSP()}</span>
		                                </div>
		                            </a>
                            	</c:forEach> 
                                                                          
                            </div>
                            <div class="latest-prdouct__slider__item">
                            
                                <c:forEach items="${top3SanPhamMoiNhat2}" var="sp">
                            	
									<a href="thong-tin-san-pham?maSP=${sp.getMaSP()}" class="latest-product__item">
		                                <div class="latest-product__item__pic">
		                                    <img src="${pageContext.request.contextPath}/img/ImageSP/${sp.getHinhAnh()}" alt="">
		                                </div>
		                                <div class="latest-product__item__text">
		                                    <h6>${sp.getTenSP()}</h6>
		                                    <span>${sp.getGiaSP()}</span>
		                                </div>
		                            </a>
                            	</c:forEach> 
                            	
                            </div> 
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="latest-product__text">
                        <h4>Sản phẩm bán chạy</h4>
                        <div class="latest-product__slider owl-carousel">
                            <div class="latest-prdouct__slider__item">
                                <c:forEach items="${topSanPhamBanChay}" var="sp">
                            	
									<a href="thong-tin-san-pham?maSP=${sp.getMaSP()}" class="latest-product__item">
		                                <div class="latest-product__item__pic">
		                                    <img src="${pageContext.request.contextPath}/img/ImageSP/${sp.getHinhAnh()}" alt="">
		                                </div>
		                                <div class="latest-product__item__text">
		                                    <h6>${sp.getTenSP()}</h6>
		                                    <span>${sp.getGiaSP()}</span>
		                                </div>
		                            </a>
                            	</c:forEach> 
                            </div>
                            
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="latest-product__text">
                        <h4>Sản phẩm đánh giá cao</h4>
                        <div class="latest-product__slider owl-carousel">
                            <div class="latest-prdouct__slider__item">
                                <c:forEach items="${top3SanPhamDanhGiaCao}" var="sp">
                            	
									<a href="thong-tin-san-pham?maSP=${sp.getMaSP()}" class="latest-product__item">
		                                <div class="latest-product__item__pic ">
		                                    <img src="${pageContext.request.contextPath}/img/ImageSP/${sp.getHinhAnh()}" alt="">
		                                </div>
		                                <div class="latest-product__item__text">
		                                    <h6>${sp.getTenSP()}</h6>
		                                    <span>${sp.getGiaSP()}</span>
		                                </div>
		                            </a>
                            	</c:forEach> 
                            </div>                           
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Latest Product Section End -->

    <!-- Blog Section Begin -->
    <section class="from-blog spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="section-title from-blog__title">
                        <h2>Tin Tức</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-1.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> 19-04-2023 6:31 AM</li>
                                <!-- <li><i class="fa fa-comment-o"></i> 5</li> -->
                            </ul>
                            <h5><a href="https://ducladeyeuthuongkhongphaideghet.blogspot.com/2022/11/uong-nuoc-chanh-u-va-ung-cach-se-nhan.html" target="_blank">
                                Uống nước chanh đủ và đúng cách sẽ nhận được 4 lợi ích sức khỏe</a></h5>
                            <p>Uống nước chanh thường xuyên giúp bạn được bổ sung một số vitamin và chất dinh dưỡng quan trọng. Ngoài hương vị tươi ngon, nước chanh là loại đồ uống ít rủi ro cho sức khỏe. Tuy nhiên, nếu bạn uống nước chanh sai thời điểm hoặc với liều lượng quá nhiều thì nước chanh lại trở thành có hại.</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-3.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> 04-11-2023 9:03 AM</li>
                                <!-- <li><i class="fa fa-comment-o"></i> 5</li> -->
                            </ul>
                            <h5><a href="https://ducladeyeuthuongkhongphaideghet.blogspot.com/2022/11/top-10-loai-thuc-pham-giau-vitamin-c.html" target="_blank">Top 10 loại thực phẩm giàu vitamin C, thật bất ngờ không phải cam quýt</a></h5>
                            <p>Vitamin C là một trong những loại vitamin cần thiết để tăng cường sức đề kháng khi mùa đông đến gần. Cùng tìm hiểu những loại thực phẩm chứa nhiều vitamin C nhất. Và đáng ngạc nhiên, đó không phải là các loại trái cây họ cam quýt như mọi người vẫn tưởng.</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-2.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> 08-10-2023 6:54 AM</li>
                                <!-- <li><i class="fa fa-comment-o"></i> 5</li> -->
                            </ul>
                            <h5><a href="https://ducladeyeuthuongkhongphaideghet.blogspot.com/2022/11/au-cove-co-ve-va-10-loi-ich-tuyet-voi.html" target="_blank">Đậu Cove (Cô Ve) và 10 Lợi Ích Tuyệt Vời Cho Sức Khỏe</a></h5>
                            <p>Đậu cove là một loại cây thuộc họ nhà đậu có tên khoa học là Phaseolus vulgaris. Loại cây này còn có nhiều tên gọi khác như đậu cô ve hay đậu tây. Quả và hạt đậu cove được sử dụng rộng rãi trong ẩm thực nhờ có giá trị dinh dưỡng cao và mang lại nhiều lợi ích tuyệt vời cho sức khỏe.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Blog Section End -->
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
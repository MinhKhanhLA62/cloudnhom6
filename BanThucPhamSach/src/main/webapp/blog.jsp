
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
                        <h2>Tin Tức</h2>
                        <div class="breadcrumb__option">
                            <a href="./index.jsp">Home</a>
                            <span>Tin Tức</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Breadcrumb Section End -->

    <!-- Blog Section Begin -->
    <section class="blog spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-5">
                    <div class="blog__sidebar">
                        <div class="blog__sidebar__search">
                            <form action="#">
                                <input type="text" placeholder="Search...">
                                <button type="submit"><span class="icon_search"></span></button>
                            </form>
                        </div>
                        <!-- <div class="blog__sidebar__item">
                            <h4>Categories</h4>
                            <ul>
                                <li><a href="#">All</a></li>
                                <li><a href="#">Beauty (20)</a></li>
                                <li><a href="#">Food (5)</a></li>
                                <li><a href="#">Life Style (9)</a></li>
                                <li><a href="#">Travel (10)</a></li>
                            </ul>
                        </div> -->
                        <div class="blog__sidebar__item">
                            <h4>Tin mới nhất</h4>
                            <div class="blog__sidebar__recent">
                                <a href="https://vythetran.blogspot.com/2023/11/10-loai-rau-bao-ve-gan.html" class="blog__sidebar__recent__item" target="_blank">
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
                        <div class="blog__sidebar__item">
                            <h4>Search By</h4>
                            <div class="blog__sidebar__item__tags">
                                <a href="#">Apple</a>
                                <a href="#">Beauty</a>
                                <a href="#">Vegetables</a>
                                <a href="#">Fruit</a>
                                <a href="#">Healthy Food</a>
                                <a href="#">Lifestyle</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-8 col-md-7">
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item">
                                <div class="blog__item__pic">
                                    <img src="img/blog/blog-2.jpg" alt="">
                                </div>
                                <div class="blog__item__text">
                                    <ul>
                                        <li><i class="fa fa-calendar-o"></i> 08-10-2023 6:54 AM</li>
                                        <li><i class="fa fa-comment-o"></i> 1</li>
                                    </ul>
                                    <h5><a href="https://vythetran.blogspot.com/2023/11/nhom09-cove.html" target="_blank">Đậu Cove (Cô Ve) và 10 Lợi Ích Tuyệt Vời Cho Sức Khỏe</a></h5>
                                    <p>Đậu cove là một loại cây thuộc họ nhà đậu có tên khoa học là Phaseolus vulgaris. Loại cây này còn có nhiều tên gọi khác như đậu cô ve hay đậu tây. Quả và hạt đậu cove được sử dụng rộng rãi trong ẩm thực nhờ có giá trị dinh dưỡng cao và mang lại nhiều lợi ích tuyệt vời cho sức khỏe.</p>
                                    <a href="https://vythetran.blogspot.com/2023/11/nhom09-cove.html" target="_blank" class="blog__btn">CHI TIẾT<span class="arrow_right"></span></a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item">
                                <div class="blog__item__pic">
                                    <img src="img/blog/blog-3.jpg" alt="">
                                </div>
                                <div class="blog__item__text">
                                    <ul>
                                        <li><i class="fa fa-calendar-o"></i> 04-11-2023 9:03 AM</li>
                                        <li><i class="fa fa-comment-o"></i> 5</li>
                                    </ul>
                                    <h5><a href="https://vythetran.blogspot.com/2023/11/top-10-loai-thuc-pham-giau-vitamin-c.html" target="_blank">Top 10 loại thực phẩm giàu vitamin C, thật bất ngờ không phải cam quýt</a></h5>
                                    <p>Vitamin C là một trong những loại vitamin cần thiết để tăng cường sức đề kháng khi mùa đông đến gần. Cùng tìm hiểu những loại thực phẩm chứa nhiều vitamin C nhất. Và đáng ngạc nhiên, đó không phải là các loại trái cây họ cam quýt như mọi người vẫn tưởng.</p>
                                    <a href="https://vythetran.blogspot.com/2023/11/top-10-loai-thuc-pham-giau-vitamin-c.html" target="_blank" class="blog__btn">CHI TIẾT<span class="arrow_right"></span></a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item">
                                <div class="blog__item__pic">
                                    <img src="img/blog/blog-1.jpg" alt="">
                                </div>
                                <div class="blog__item__text">
                                    <ul>
                                        <li><i class="fa fa-calendar-o"></i>19-04-2023 6:31 AM</li>
                                        <li><i class="fa fa-comment-o"></i> 7</li>
                                    </ul>
                                    <h5><a href="https://vythetran.blogspot.com/2023/11/uong-nuoc-chanh-u-va-ung-cach-se-nhan.html" target="_blank"> Uống nước chanh đủ và đúng cách sẽ nhận được 4 lợi ích sức khỏe</a></h5>
                                    <p>Uống nước chanh thường xuyên giúp bạn được bổ sung một số vitamin và chất dinh dưỡng quan trọng. Ngoài hương vị tươi ngon, nước chanh là loại đồ uống ít rủi ro cho sức khỏe. Tuy nhiên, nếu bạn uống nước chanh sai thời điểm hoặc với liều lượng quá nhiều thì nước chanh lại trở thành có hại.</p>
                                    <a href="https://vythetran.blogspot.com/2023/11/uong-nuoc-chanh-u-va-ung-cach-se-nhan.html" target="_blank" class="blog__btn">CHI TIẾT<span class="arrow_right"></span></a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="blog__item">
                                <div class="blog__item__pic">
                                    <img src="img/blog/blog-4.jpg" alt="">
                                </div>
                                <div class="blog__item__text">
                                    <ul>
                                        <li><i class="fa fa-calendar-o"></i> 12-01-2023 9:21 pM</li>
                                        <li><i class="fa fa-comment-o"></i> 10</li>
                                    </ul>
                                    <h5><a href="https://ducladeyeuthuongkhongphaideghet.blogspot.com/2022/11/meo-nau-giup-viec-nau-tro-nen-on-gian.html" target="_blank">Mẹo nấu ăn giúp việc nấu ăn trở nên đơn giản</a></h5>
                                    <p>Nấu ăn ngon ngoài việc nắm vững các công thức đòi hỏi bạn cần phải có kinh nghiệm. Trong quá trình nấu ăn chúng ta sẽ tự đúc rút ra nhiều kinh nghiệm hơn cho bản thân vào những lần nấu sau đấy. Cùng xem các mẹo sau để nấu ăn dưới đây nhé!<br><br></p>
                                    <a href="https://ducladeyeuthuongkhongphaideghet.blogspot.com/2022/11/meo-nau-giup-viec-nau-tro-nen-on-gian.html" target="_blank" class="blog__btn">CHI TIẾT<span class="arrow_right"></span></a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-12">
                            <div class="product__pagination blog__pagination">
                                <a href="#">1</a>
                                <a href="#">2</a>
                                <a href="#">3</a>
                                <a href="#"><i class="fa fa-long-arrow-right"></i></a>
                            </div>
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
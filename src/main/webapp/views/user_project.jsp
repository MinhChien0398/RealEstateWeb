<%--
  Created by IntelliJ IDEA.
  User: Clover
  Date: 04/12/2023
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="lib/MDB_4_pro/css/bootstrap.min.css" rel="stylesheet">
    <!--    <link href="../../../RealEstateWeb/public/lib/MDB_4_pro/css/mdb.lite.min.css" rel="stylesheet">-->
    <link href="lib/MDB_4_pro/css/mdb.min.css" rel="stylesheet">
    <link href="lib/MDB_4_pro/css/style.css" rel="stylesheet">
    <link href="css/user_favourite.css" rel="stylesheet">
    <link href="css/admin-nav-bar.css" rel="stylesheet">
    <link href="css/user_projects.css" rel="stylesheet">

    <!--<link href="/lib/fontawesome-free-6.4.2-web/css/fontawesome.min.css" rel="stylesheet"> -->
    <link href="lib/fontawesome-free-6.4.2-web/css/all.min.css" rel="stylesheet">
    <!--    <link href="../../../RealEstateWeb/public/views/template/css/swiper-bundle.min.css" rel="stylesheet">-->
    <title>Title</title>
</head>
<body>

<div class="wrapper position-relative">
    <!--start Navigation-->
    <div class="wrapper position-relative">
        <!--start Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light nav-property position-fixed w-100"
             style="z-index: 1000; top:0">
            <div class="container">
                <a class="navbar-brand "
                   href="home.jsp">
                    <div class="navbar-brand flex-center justify-content-between">
                        <img class="mr-3 ml-4 " src="img/logo/logo.png" style="width: 50px">
                        <h5 class=" text-uppercase mb-2 mt-2 font-weight-bold main-color">XÂY DỰNG NHÀ ĐẸP</h5>
                    </div>
                </a>
                <div class="collapse navbar-collapse border-left row  align-items-center"
                     id="navbarSupportedContent-555">
                    <ul class="navbar-nav  col-9 border-right">
                        <li class="nav-item nav-menuItem font-weight-bolder ">
                            <a class="nav-link text-center"
                               href="home.jsp">Trang Chủ
                            </a>
                        </li>
                        <li class="nav-item nav-menuItem font-weight-bolder">
                            <a class="nav-link text-center"
                               href="intro.html">Giới Thiệu</a>
                        </li>
                        <li class="d-flex align-items-center nav-item
                nav-menuItem position-relative font-weight-bolder nav-dropdownItem"
                        >
                            <a class="nav-link text-center"
                               href="services.html"
                               role="link"
                            >Dịch vụ
                            </a>
                            <i class="fa-solid fa-angle-down position-absolute  " style="color: #000000;"></i>
                            <div class="dropdown-menu w-100">
                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Trọn
                                    Gói</a>
                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Thô</a>
                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Biệt Thự</a>
                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Xưởng</a>
                            </div>

                        </li>
                        <li class="d-flex align-items-center nav-item
                nav-menuItem position-relative font-weight-bolder nav-dropdownItem"
                        >
                            <a class="nav-link text-center"
                               href="project.html"
                               role="link"
                            >Dự án
                            </a>
                            <i class="fa-solid fa-angle-down position-absolute  " style="color: #000000;"></i>
                            <div class="dropdown-menu w-100">
                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Biệt Thự</a>
                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Nhà Phố</a>
                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Văn Phòng</a>
                            </div>
                        </li>
                        <li class="nav-item nav-menuItem font-weight-bolder">
                            <a class="nav-link text-center"
                               href="contact.html">Liên Hệ</a>
                        </li>
                        <li class="nav-item nav-menuItem font-weight-bolder" id="nav-menuItem-active">
                            <a class="nav-link text-center" href="#">TK của tôi</a>
                        </li>
                    </ul>
                    <!--icon font ring-->
                    <div class="phone-contain flex-center justify-content-center col-3">

                        <div class="icon-phone-ring col-lg-6 col-md-6 col-sm-12 ">
                            <div class="w-100 h-100 d-flex justify-content-center align-items-center">
                                <i class="fa-solid fa-phone"></i>
                                <i class="circle-1"></i>
                            </div>
                        </div>
                        <div>
                            <a class=" col-lg-6 col-md-6">0352033199</a>
                        </div>
                    </div>
                </div>
            </div>
        </nav>

        <!--end Navigation-->

        <div class="sidebar">
            <div class="sidebar-menu">
                <li class="sidebar-item" id="user">
                    <a href="user.jsp" class="menu-btn">
                        <i class="fas fa-user-circle"></i><span>Thông tin cá nhân</span>
                    </a>
                </li>
                <li class="sidebar-item" id="favourite">
                    <a href="user_favourite.jsp" class="menu-btn">
                        <i class="fa-solid fa-star"></i><span>Dự án đã lưu</span>
                    </a>
                </li>
                <li class="sidebar-item" id="history">
                    <a href="user_history.jsp" class="menu-btn">
                        <i class="fa-solid fa-clock-rotate-left"></i><span>Lịch sử truy cập</span>
                    </a>
                </li>
                <li class="sidebar-item" id="my-projcet">
                    <a href="user_project.jsp" class="menu-btn">
                        <i class="fa-solid fa-layer-group"></i><span>Dự án của tôi</span>
                    </a>
                </li>
            </div>
        </div>


        <div class="main-container">

            <div id="section-1" class="bc-icons-2">
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb bg-white small">
                        <li class="breadcrumb-item">
                            <a class="black-text breadcrumb-size"
                               href="home.jsp">
                                <i class="fa-solid fa-house"></i>
                            </a>
                        </li>
                        <li>
                            <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                        </li>
                        <li class="breadcrumb-item active breadcrumb-size">
                            <a class="black-text text-uppercase  "
                               href="user.jsp">Tài khoản cá nhân</a>
                        </li>
                        <li>
                            <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                        </li>
                        <li class="breadcrumb-item active breadcrumb-size">
                            <a class="black-text text-uppercase font-weight-bolder"
                               href="user_history.jsp">Lịch sử</a>
                        </li>
                    </ol>
                </nav>
            </div>

            <main class="my-body">
                <div class="container">
                    <div class="border box-project hover-image d-flex">
                        <a class="">
                            <img src="img/project-img/thiet-ke-nha-1-3.jpg">
                        </a>
                        <div class="w-100 flex-column">
                            <div class="box-content">
                                <h4 class=""> Nhà phố hiện đại Q.10 thành phố Hồ Chí Minh</h4>
                                <p><span>Ngày khởi công: </span> 12/11/2023</p>
                                <p><span>Chủ đầu tư: </span> Ông Dũ</p>
                                <p><span>Địa chỉ: </span> Thành phố Hồ Chí Minh</p>
                                <p><span>Loại dự án: </span> Nhà phố</p>
                                <p><span>Mã dự án: </span> 0027</p>
                                <p><span>Dự toán kinh phí: </span> 1,5 tỷ</p>
                                <p><span>Tiến độ công trình: </span> Đang trong quá trình thi công phần thô</p>
                                <p><span>Dự kiến thời điểm hoàn thành: </span> 30/1/2024</p>

                            </div>
                            <div class="box-button d-flex justify-content-around">
                                <a href="#">
                                    <button class="btn btn-blue font-weight-bold ml-0"> Xem bài viết về dự án</button>
                                </a><a href="#"> </a>
                                <button class="btn btn-green font-weight-bold ml-0 p-3"> Cho phép đăng bài viết</button>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </main>

            <!--footer -->
            <!--end footer -->
        </div>
    </div>
</div>

<script src="lib/MDB_4_pro/js/jquery.min.js"></script>
<script src="lib/MDB_4_pro/js/popper.min.js"></script>
<script src="lib/MDB_4_pro/js/bootstrap.min.js"></script>
<script src="lib/MDB_4_pro/js/mdb.min.js"></script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Minh Tan
  Date: 11/27/2023
  Time: 1:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="vi">
<head><meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/contact.css">
    <link href="lib/MDB_4_pro/css/bootstrap.min.css" rel="stylesheet">
    <!--    <link href="lib/MDB_4_pro/css/mdb.lite.min.css" rel="stylesheet">-->
    <link href="lib/MDB_4_pro/css/mdb.min.css" rel="stylesheet">
    <link href="lib/MDB_4_pro/css/style.css" rel="stylesheet">
    <link href="lib/fontawesome-free-6.4.2-web/css/all.min.css" rel="stylesheet">

    <title>Title</title>
</head>
<body>
<jsp:include page="public/layout/public/header.jsp"></jsp:include>
<!--start content-->
<!--        Start breadcrumb -->
<div class="container">
    <div id="section-1" class="bc-icons-2 container">
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb bg-white small" style="">
                <li class="breadcrumb-item">
                    <a class="black-text breadcrumb-size hover-red" href="/">
                        <i class="fas fa-home"></i>
                    </a>
                </li>
                <li>
                    <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                </li>
                <li class="breadcrumb-item active breadcrumb-size">
                    <a class="text-uppercase font-weight-bolder black-text" href="#">LIÊN HỆ</a>
                </li>
            </ol>
        </nav>
    </div>
</div>
<!--    end breadcrumb-->
<div id="card">
    <div>
        <h5 class="section-heading h1 pt-4 text-center bottom redbockdoor font-weight-bold">Gửi thư đến chúng
            tôi</h5>
    </div>
    <div class="bg-light">
        <div class="row d-flex flex-wrap container">
            <div class="item col-lg-6 col-md-12 col-sm-12 w-100">
                <img class="w-100"
                     src="https://cms.luatvietnam.vn/uploaded/Images/Original/2020/01/17/gia-nhan-cong-xay-dung_1701151934.jpg">
            </div>
            <div class="item col-lg-6 col-md-10 col-sm-12 w-100 container">
                <div>
                    <p class="text-uppercase text-center font-weight-bold p-lg-4">thông tin liên hệ</p>
                </div>
                <div class="bg-white listContent">
                    <ul class="align-content-lg-start p-0">
                        <li class="text-center">
                            <p class="font-weight-bold">CÔNG TY XÂY DỰNG TMĐT NHÀ XINH</p>
                            <p>Địa chỉ: 254/5/41 Lê Văn Thọ, P.11, Q. Gò Vấp, TP HCM</p>
                            <p>Số Điện Thoại: 0935 671 886 </p>
                            <p>Email: xaydungnhaxinh72@gmail.com</p>
                            <p>Website: nhaxinh.asia</p>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!--    end wraper contact-->
<div id="section-3" class="container">
    <!--Section: Contact v.1-->
    <section class="section pb-4 pt-5">
        <!--Section heading-->

        <!--Section description-->
        <div class="row">
            <!--Grid column-->
            <div class="col-lg-5 mb-4">
                <!--Form with header-->
                <form class="card" action="" method="post">
                    <div class="card-body">
                        <!--Header-->
                        <!--Body-->
                        <div class="md-form">
                            <i class="fas fa-user prefix grey-text"></i>
                            <input type="text" id="form-name" class="form-control">
                            <label for="form-name">Họ và tên</label>
                        </div>


                        <div class="md-form">
                            <i class="fas fa-envelope prefix grey-text"></i>
                            <input type="text" id="form-email" class="form-control">
                            <label for="form-email">Địa chỉ email</label>
                        </div>
                        <div class="md-form">
                            <i class="fa-solid fa-map-location prefix grey-text"></i>
                            <input type="text" id="form-address" class="form-control">
                            <label for="form-address">Địa chỉ(tỉnh/thành phố)</label>
                        </div>
                        <div class="row">
                            <div
                                    class=" black-brown-text font-weight-bold text-uppercase text-lg-center col-6 flex-center">
                                <!--                            <label>Chủ đề</label>-->
                                <select class="browser-default custom-select mb-4">
                                    <option value="" disabled>Loại dự án</option>
                                    <option value="1" selected>Nhà phố</option>
                                    <option value="2">Biệt thự</option>
                                </select>

                            </div>
                            <div class="form-outline col-6">
                                <input type="text" id="typeText" class="form-control" placeholder="Mã dự án"/>
                            </div>
                        </div>

                        <!-- Message -->
                        <div class="form-group">
                                <textarea class="form-control rounded-0" id="exampleFormControlTextarea2" rows="3"
                                          placeholder="Lời nhắn"></textarea>
                        </div>
                        <div class="text-center mt-4">
                            <button class="btn btn-red" type="submit">Gửi ngay</button>
                        </div>
                    </div>
                </form>
                <!--Form with header-->

            </div>

            <div class="col-lg-7 mb-4">

                <!--Google map-->
                <div id="map-container-google-11" class="z-depth-1-half map-container-6 h-100"
                     style="height: 453px">
                    <iframe
                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4247.872564543886!2d106.79040908333542!3d10.870529759247004!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3175276398969f7b%3A0x9672b7efd0893fc4!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBOw7RuZyBMw6JtIFRQLiBI4buTIENow60gTWluaA!5e0!3m2!1svi!2s!4v1695713054142!5m2!1svi!2s"
                            width="200" height="150" style="border:0;" allowfullscreen="" loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade">

                    </iframe>
                </div>

                <br>
                <!--Buttons-->

            </div>
        </div>
    </section>
    <!--Section: Contact v.1-->
</div>
<!--    end main contact-->
<!--end content-->
<jsp:include page="public/layout/public/footer.jsp"></jsp:include>
<script src="../../../../RealEstateWeb/resources/views/template/js/main.js"></script>
<script src="lib/MDB_4_pro/js/jquery.min.js"></script>
<script src="lib/MDB_4_pro/js/popper.min.js"></script>
<script src="lib/MDB_4_pro/js/bootstrap.min.js"></script>
<script src="lib/MDB_4_pro/js/mdb.min.js"></script>
<script src="lib/MDB_4_pro/js/mdb.lite.min.js"></script>
</body>
</html>

<!doctype html>
<html lang="en">
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
    <%@include file="/layout/common.jsp"%>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%@ include file="/layout/link.jsp"%>
    <link rel="stylesheet" href="/template/css/services.css">
    <title>DỊCH VỤ</title>
</head>
<body>
<%@include file="/layout/public/header.jsp"%>
<!--start content-->
<div class="my-body">
    <div class="container">
        <!--        breadcrumb -->
        <div id="section-1" class="bc-icons-2">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb bg-white small">
                    <li class="breadcrumb-item">
                        <a class="black-brown-text breadcrumb-size" href="/">
                            <i class="fa-solid fa-house"></i>
                        </a>
                    </li>
                    <li>
                        <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                    </li>
                    <li class="breadcrumb-item active breadcrumb-size">
                        <a class="black-text text-uppercase font-weight-bolder" href="#">GIỚI THIỆU CHUNG</a>
                    </li>
                </ol>
            </nav>
        </div>
        <!--    end breadcrumb-->
        <!--Section: Posts-->
        <section class="text-center">
            <h1 class="mb-5" style="color:#E90808; font-family: Inter,Arial, Helvetica, sans-serif; font-weight: 700;">
                Dịch vụ và báo giá</h1>

            <div class="row g-4 g-lg-5">
                <div class="col-lg-4 col-md-6">
                    <div class="card">
                        <div
                                class="bg-image hover-overlay ripple"
                                data-mdb-ripple-color="light">
                            <a href="#">
                                <div
                                        class="mask"
                                        style="background-color: rgba(251, 251, 251, 0.15)"
                                ></div>
                                <div class="hover-img">
                                    <img
                                            src="../../../../RealEstateWeb/public/img/service-img/untitled-3-8307.png"
                                            class="img-fluid"/>
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="card-content">
                                <h3 class="card-title">Dịch vụ thi công nhà phần thô</h3>
                                <p class="card-text">
                                    Để xây dựng một tổ ấm hoàn mỹ, lựa chọn được một đơn vị thi công phần thô nhà phố là
                                    yêu
                                    cầu tiên quyết. Một đơn vị thi công phù hợp sẽ đảm bảo chất lượng công trình tốt
                                    nhất và
                                    giúp gia chủ cân đối được nguồn tài chính khi xây nhà.
                                </p>
                            </div>
                            <a href="../../../../RealEstateWeb/resources/views/template/servicePost.html" class="btn btn-rounded">Xem thêm</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="card">
                        <div
                                class="bg-image hover-overlay ripple"
                                data-mdb-ripple-color="light">
                            <a href="#">
                                <div
                                        class="mask"
                                        style="background-color: rgba(251, 251, 251, 0.15)"
                                ></div>
                                <div class="hover-img">
                                    <img
                                            src="../../../../RealEstateWeb/public/img/service-img/dichvuxaydungnhaotrongoi-2589.jpg"
                                            class="img-fluid"/>
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="card-content">
                                <h3 class="card-title">Dịch vụ xây nhà trọn gói</h3>
                                <p class="card-text">
                                    Dịch vụ xây nhà trọn gói là một giải pháp toàn diện và tiện lợi cho việc xây dựng
                                    ngôi nhà mơ ước của bạn. Thay vì bạn phải tự mình quản lý từng khía cạnh của quá
                                    trình xây dựng, dịch vụ xây nhà trọn gói sẽ đảm nhiệm toàn bộ công việc, từ thiết kế
                                    ban đầu đến hoàn thiện cuối cùng.
                                </p>
                            </div>
                            <a href="../../../../RealEstateWeb/resources/views/template/servicePost.html" class="btn btn-rounded">Xem thêm</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="card">
                        <div
                                class="bg-image hover-overlay ripple"
                                data-mdb-ripple-color="light">
                            <a href="#">
                                <div
                                        class="mask"
                                        style="background-color: rgba(251, 251, 251, 0.15)"
                                ></div>
                                <div class="hover-img">
                                    <img
                                            src="../../../../RealEstateWeb/public/img/service-img/nhamaysanxuatgangtay-7223.jpg"
                                            class="img-fluid"/>
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="card-content">
                                <h3 class="card-title">Dịch vụ thi công nhà xưởng</h3>
                                <p class="card-text">
                                    Dịch vụ thi công nhà xưởng là quá trình tổ chức, quản lý và thực hiện xây dựng hoặc
                                    cải tạo các cơ sở sản xuất, nhà máy, hoặc nhà xưởng để đáp ứng nhu cầu sản xuất và
                                    kinh doanh của khách hàng.
                                </p>
                            </div>
                            <a href="../../../../RealEstateWeb/resources/views/template/servicePost.html" class="btn btn-rounded">Xem thêm</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--Section: Posts-->
    </div>
</div>
<!--end content-->
<%@include file="/layout/public/footer.jsp"%>
<%@include file="/layout/script.jsp"%>
<script src="<c:url value="/template/js/main.js"/>"></script>
</body>
</html>
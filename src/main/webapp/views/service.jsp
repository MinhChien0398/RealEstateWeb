<%--
  Created by IntelliJ IDEA.
  User: Minh Tan
  Date: 11/27/2023
  Time: 1:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="lib/MDB_4_pro/css/bootstrap.min.css" rel="stylesheet">
    <link href="lib/MDB_4_pro/css/mdb.lite.min.css" rel="stylesheet">
    <link href="lib/MDB_4_pro/css/mdb.min.css" rel="stylesheet">

    <link href="lib/MDB_4_pro/css/style.css" rel="stylesheet">
    <link href="css/services.css" rel="stylesheet">

    <!--<link href="/lib/fontawesome-free-6.4.2-web/css/fontawesome.min.css" rel="stylesheet"> -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" rel="stylesheet">

    <title>Title</title>
</head>
<body>
<jsp:include page="public/layout/public/header.jsp"></jsp:include>
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
                                            src="img/service-img/untitled-3-8307.png"
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
                            <a href="servicePost.jsp"
                               class="btn btn-rounded">Xem thêm</a>
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
                                            src="img/service-img/dichvuxaydungnhaotrongoi-2589.jpg"
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
                            <a href="servicePost.jsp"
                               class="btn btn-rounded">Xem thêm</a>
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
                                            src="img/service-img/nhamaysanxuatgangtay-7223.jpg"
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
                            <a href="servicePost.jsp"
                               class="btn btn-rounded">Xem thêm</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--Section: Posts-->
    </div>
</div>
<!--end content-->
<jsp:include page="public/layout/public/footer.jsp"></jsp:include>
<script src="js/main.js"></script>
<script src="lib/MDB_4_pro/js/jquery.min.js"></script>
<script src="lib/MDB_4_pro/js/popper.min.js"></script>
<script src="lib/MDB_4_pro/js/bootstrap.min.js"></script>
<script src="lib/MDB_4_pro/js/mdb.min.js"></script>
<script src="lib/MDB_4_pro/js/mdb.lite.min.js"></script>
</body>
</html>

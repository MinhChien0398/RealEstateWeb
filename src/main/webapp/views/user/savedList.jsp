<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@include file="/layout/common.jsp" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%@include file="/layout/public/link.jsp" %>
    <link href=" <c:url value="/template/css/admin-nav-bar.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/css/user_favourite.css"/>" rel="stylesheet">
    <title>dự án đã lưu</title>
</head>
<body>
<%@include file="/layout/public/header.jsp" %>
<div class="wrapper">
    <!--start Navigation-->
    <%--    <div class="wrapper position-relative">--%>
    <%--        <!--start Navigation-->--%>
    <%--        <nav class="navbar navbar-expand-lg navbar-light nav-property position-fixed w-100"--%>
    <%--             style="z-index: 1000; top:0">--%>
    <%--            <div class="container">--%>
    <%--                <a class="navbar-brand "--%>
    <%--                   href="../../../../RealEstateWeb/resources/views/template/main.html">--%>
    <%--                    <div class="navbar-brand flex-center justify-content-between">--%>
    <%--                        <img class="mr-3 ml-4 " src="../../../../RealEstateWeb/public/img/logo/logo.png" style="width: 50px">--%>
    <%--                        <h5 class=" text-uppercase mb-2 mt-2 font-weight-bold main-color">XÂY DỰNG NHÀ ĐẸP</h5>--%>
    <%--                    </div>--%>
    <%--                </a>--%>
    <%--                <div class="collapse navbar-collapse border-left row  align-items-center"--%>
    <%--                     id="navbarSupportedContent-555">--%>
    <%--                    <ul class="navbar-nav  col-9 border-right">--%>
    <%--                        <li class="nav-item nav-menuItem font-weight-bolder ">--%>
    <%--                            <a class="nav-link text-center"--%>
    <%--                               href="../../../../RealEstateWeb/resources/views/template/main.html">Trang Chủ--%>
    <%--                            </a>--%>
    <%--                        </li>--%>
    <%--                        <li class="nav-item nav-menuItem font-weight-bolder">--%>
    <%--                            <a class="nav-link text-center"--%>
    <%--                               href="../../../../RealEstateWeb/resources/views/template/intro.html">Giới Thiệu</a>--%>
    <%--                        </li>--%>
    <%--                        <li class="d-flex align-items-center nav-item--%>
    <%--                nav-menuItem position-relative font-weight-bolder nav-dropdownItem"--%>
    <%--                        >--%>
    <%--                            <a class="nav-link text-center"--%>
    <%--                               href="../../../../RealEstateWeb/resources/views/template/services.html"--%>
    <%--                               role="link"--%>
    <%--                            >Dịch vụ--%>
    <%--                            </a>--%>
    <%--                            <i class="fa-solid fa-angle-down position-absolute  " style="color: #000000;"></i>--%>
    <%--                            <div class="dropdown-menu w-100">--%>
    <%--                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Trọn--%>
    <%--                                    Gói</a>--%>
    <%--                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Thô</a>--%>
    <%--                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Biệt Thự</a>--%>
    <%--                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Xưởng</a>--%>
    <%--                            </div>--%>

    <%--                        </li>--%>
    <%--                        <li class="d-flex align-items-center nav-item--%>
    <%--                nav-menuItem position-relative font-weight-bolder nav-dropdownItem"--%>
    <%--                        >--%>
    <%--                            <a class="nav-link text-center"--%>
    <%--                               href="../../../../RealEstateWeb/resources/views/template/project.html"--%>
    <%--                               role="link"--%>
    <%--                            >Dự án--%>
    <%--                            </a>--%>
    <%--                            <i class="fa-solid fa-angle-down position-absolute  " style="color: #000000;"></i>--%>
    <%--                            <div class="dropdown-menu w-100">--%>
    <%--                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Biệt Thự</a>--%>
    <%--                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Nhà Phố</a>--%>
    <%--                                <a class="dropdown-item text-center" style="font-size: 16px" href="#">Văn Phòng</a>--%>
    <%--                            </div>--%>
    <%--                        </li>--%>
    <%--                        <li class="nav-item nav-menuItem font-weight-bolder">--%>
    <%--                            <a class="nav-link text-center"--%>
    <%--                               href="../../../../RealEstateWeb/resources/views/template/contact.html">Liên Hệ</a>--%>
    <%--                        </li>--%>
    <%--                        <li class="nav-item nav-menuItem font-weight-bolder" id="nav-menuItem-active">--%>
    <%--                            <a class="nav-link text-center" href="#">TK của tôi</a>--%>
    <%--                        </li>--%>
    <%--                    </ul>--%>
    <%--                    <!--icon font ring-->--%>
    <%--                    <div class="phone-contain flex-center justify-content-center col-3">--%>

    <%--                        <div class="icon-phone-ring col-lg-6 col-md-6 col-sm-12 ">--%>
    <%--                            <div class="w-100 h-100 d-flex justify-content-center align-items-center">--%>
    <%--                                <i class="fa-solid fa-phone"></i>--%>
    <%--                                <i class="circle-1"></i>--%>
    <%--                            </div>--%>
    <%--                        </div>--%>
    <%--                        <div>--%>
    <%--                            <a class=" col-lg-6 col-md-6">0352033199</a>--%>
    <%--                        </div>--%>
    <%--                    </div>--%>
    <%--                </div>--%>
    <%--            </div>--%>
    <%--        </nav>--%>


    <!--end Navigation-->

    <div class="sidebar">
        <div class="sidebar-menu">
            <li class="sidebar-item" id="user">
                <a href="../../../../RealEstateWeb/resources/views/template/user.html" class="menu-btn">
                    <i class="fas fa-user-circle"></i><span>Thông tin cá nhân</span>
                </a>
            </li>
            <li class="sidebar-item" id="favourite">
                <a href="../../../../RealEstateWeb/resources/views/template/user_favourite.html" class="menu-btn">
                    <i class="fa-solid fa-star"></i><span>Dự án đã lưu</span>
                </a>
            </li>
            <li class="sidebar-item" id="history">
                <a href="../../../../RealEstateWeb/resources/views/template/user_history.html" class="menu-btn">
                    <i class="fa-solid fa-clock-rotate-left"></i><span>Lịch sử truy cập</span>
                </a>
            </li>
            <li class="sidebar-item" id="my-projcet">
                <a href="../../../../RealEstateWeb/resources/views/template/user_Projects.html" class="menu-btn">
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
                           href="../../../../RealEstateWeb/resources/views/template/main.html">
                            <i class="fa-solid fa-house"></i>
                        </a>
                    </li>
                    <li>
                        <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                    </li>
                    <li class="breadcrumb-item active breadcrumb-size">
                        <a class="black-text text-uppercase "
                           href="../../../../RealEstateWeb/resources/views/template/user.html">Tài khoản cá nhân</a>
                    </li>
                    <li>
                        <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                    </li>
                    <li class="breadcrumb-item active breadcrumb-size">
                        <a class="black-text text-uppercase font-weight-bolder"
                           href="../../../../RealEstateWeb/resources/views/template/user_favourite.html">Lưu trữ</a>
                    </li>
                </ol>
            </nav>
        </div>

        <main class="my-body">
            <div class="container">
                <!-- Main Container -->
                <div class="container">
                    <div class="row" id="imageProjects">
                        <c:forEach items="${projects}" var="project">
                            <div
                                    class="col-lg-3 col-md-4 col-sm-6 mb-4 overflow-hidden position-relative projectCard-container">
                                <div
                                        class="bg-image hover-image hover-zoom ripple shadow-1-strong rounded-5 w-100 d-block">
                                    <i class="fa-solid fa-bookmark position-absolute" style="z-index: 1000"></i>
                                    <a href="/post/project?id=${project.id}">
                                        <img
                                                src="${project.avatar}"
                                                class="w-100">
                                        <div class="w-100 position-absolute projectCard-content">
                                            <div class="mask justify-content-center d-flex h-100"
                                                 style="background-color: rgba(48, 48, 48, 0.72);">
                                                <div class="align-items-center flex-column d-flex w-100">
                                                    <h6 class="text-white text-center pt-4 projectTitle-center text-uppercase">
                                                            ${project.title}</h6>
                                                    <p class="text-white p-0 id-project">
                                                        <strong>
                                                            MDA:${project.id}</strong>
                                                    </p>
                                                    <p class="text-white p-4">
                                                            ${project.description}
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="d-flex justify-content-center">
                        <ul class="nav md-pills pills-danger " id="contain-button">

                        </ul>
                    </div>

                </div>
                <!-- Main Container -->
            </div>
        </main>

        <!--footer -->
        <!--end footer -->
    </div>
</div>
</div>
<%@include file="/layout/public/script.jsp" %>
<script>
    $('document').ready(function () {
        $(".button-collapse").sideNav();
        var sideNavScrollbar = document.querySelector('.custom-scrollbar');
        var ps = new PerfectScrollbar(sideNavScrollbar);
    });
</script>
<script>
    function drawButton(fdata, size) {
        let data = fdata != null && fdata !== "" ? fdata : 'null';
        let container = document.getElementById('container-button');
        let page = '';
        page +=
            ' <li class="page-item page-0 " >' +
            '  <a class="page-link " onClick="getProject(\'' + data +
            '\',0)" >Trang đầu</a>' +
            '</li>'

        for (let i = 0; i < size; i++) {
            if (i === 0) {
                page +=
                    '<li class="page-item active page-' + i + '">' +
                    '<a class="page-link " onclick="getProject(\'' + data + '\',' + i + ')">' + i + '</a></li>'

            } else
                page += '<li class="page-item page-' + i + '">' +
                    '<a class="page-link" onclick="getProject(\'' + data + '\',' + i + ')">' + i + '</a></li>'
        }
        page +=
            ' <li class="page-item page-' + (size - 1) + '" >' +
            '  <a class="page-link" onClick="getProject(\'' + data + '\',' + (size - 1) + ')" >Trang cuối</a>' +
            '    </li>'
        console.log(page)
        container.innerHTML = page;
        console.log('button:' + container.innerHTML)
    }


    function drawProject(data) {
        let container = document.getElementById('project-container');
        container.innerHTML = "";
        let project = '';
        for (const x of data) {
            console.log(x.isSave);
            project += '<div' +
                ' class="col-lg-3 col-md-4 col-sm-6 mb-4 overflow-hidden position-relative projectCard-container">'
                + '<div'
                + ' class="bg-image hover-image hover-zoom ripple shadow-1-strong rounded-5 w-100 d-block">';
            if (x.isSave) project += ' <i class="fa-solid fa-bookmark position-absolute" onclick="like(this)" style="z-index: 1000"></i>'
            else project += '<i class="fa-regular fa-bookmark position-absolute" onclick="like(this)" style="z-index: 1000"></i>';
            project += '<a href="/post/project?id=' + x.id + '">'
                + '<img src="' + x.avatar + '"'
                + ' class="w-100">'
                + ' <input type="hidden" class="project-id" value=' + x.id + '>'
                + ' <div class="w-100 position-absolute projectCard-content">'
                + '  <div class="mask justify-content-center d-flex h-100"'
                + ' style="background-color: rgba(48, 48, 48, 0.72);">'
                + '<div class="align-items-center flex-column d-flex w-100"><h6'
                + ' class="text-white text-center pl-2 pr-2 projectTitle-center text-uppercase">'
                + x.title + '</h6>'
                + '<p class="text-white p-0 id-project">'
                + '<strong>MDA:' + x.id + '</strong>'
                + '</p>'
                + '<p class="text-white p-4">'+x.description+'</p>'
                + '</div>'
                + '</div></div></a></div></div>'
        }
        container.innerHTML = project;
    }
</script>
</body>
</html>
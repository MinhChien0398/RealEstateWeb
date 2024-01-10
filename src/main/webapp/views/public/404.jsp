<!doctype html>
<html lang="en">
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
    <%@include file="/layout/common.jsp" %>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%@ include file="/layout/public/link.jsp" %>
    <link rel="stylesheet" href="/template/css/intro.css">
    <title>GIỚI THIỆU</title>

</head>
<body>
<%--<style>--%>
<%--    body #page-error {--%>
<%--        /*background-image: url("/template/img/realestate-error-page.png");*/--%>
<%--        display: flex;--%>
<%--        justify-content: space-around;--%>
<%--        height: 541px;--%>
<%--        background-color: #90a4ae;--%>
<%--    }--%>


<%--</style>--%>
<%@include file="/layout/public/header.jsp" %>
<!--start content-->
<div class="container">
<%--    <!--        breadcrumb -->--%>
<%--    <div id="section-1" class="bc-icons-2">--%>
<%--        <nav aria-label="breadcrumb">--%>
<%--            <ol class="breadcrumb bg-white small">--%>
<%--                <li class="breadcrumb-item">--%>
<%--                    <a class="black-text breadcrumb-size" href="/">--%>
<%--                        <i class="fa-solid fa-house"></i>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>--%>
<%--                </li>--%>
<%--                &lt;%&ndash;                <li class="breadcrumb-item active breadcrumb-size">&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <a class="black-text text-uppercase font-weight-bolder" href="#">GIỚI THIỆU CHUNG</a>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                </li>&ndash;%&gt;--%>
<%--            </ol>--%>
<%--        </nav>--%>
<%--    </div>--%>


<%--    <!--    end breadcrumb-->--%>
    <div id="page-error" class="flex-row mt-5" style="display: flex; justify-content: space-evenly">
        <div>
            <h1 style="font-size: 50px">404!</h1>
            <p style="font-size: 20px">Oops! Có lỗi xảy ra, trang bạn tìm không thấy</p>
        </div>
        <div>
            <img src="\template\img\realestate-error-page.png" alt="" style="width: 500px">
        </div>

    </div>
    <div class="ml-5">

    </div>
</div>

<!--end content-->
<%@include file="/layout/public/footer.jsp" %>
<%@include file="/layout/public/script.jsp" %>
<script src="<c:url value="/template/js/main.js"/>"></script>
</body>
</html>
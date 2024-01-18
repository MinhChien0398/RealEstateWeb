<%--
  Created by IntelliJ IDEA.
  User: Clover
  Date: 11/12/2023
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@include file="/layout/common.jsp" %>
<html>
<head>
    <%@include file="/layout/public/link.jsp" %>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href=" <c:url value="/template/lib/DataTables/DataTables-1.13.6/css/jquery.dataTables.min.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/lib/DataTables/datatables.min.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/css/admin-nav-bar.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/css/admin-datatable.css"/>" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<!-- Sidebar navigation -->
<div class="wrapper">
    <div class="header fixed-top ">
        <div class="header-menu row m-0">
            <div class="col-11 d-flex align-items-center">
                <div class="sidebar-btn mr-3">
                    <i class="fas fa-bars"></i>
                </div>
                <div class="title text-uppercase">
                    Xây dựng <span>Nhà Đẹp</span></div>
            </div>
            <ul class="col-1 d-flex align-items-center m-0">
                <li><a href="#"><i class="fas fa-sign-out-alt"></i></a></li>
            </ul>
        </div>
    </div>
    <div class="sidebar">
        <div class="sidebar-menu">
            <center class="logo">
                <img src="../../../../RealEstateWeb/public/img/logo/logo.png" alt="logo" style="">
            </center>
            <li class="sidebar-item">
                <a href="../dashboard.jsp" class="menu-btn">
                    <i class="fas fa-desktop"></i><span>Thống kê</span>
                </a>
            </li>
            <li class="sidebar-item" id="user">
                <a href="../user/user_manage.jsp" class="menu-btn">
                    <i class="fas fa-user-circle"></i><span>QL Người dùng</span>
                </a>
            </li>
            <li class="sidebar-item" id="project"><div class="menu-btn">
                <i class="fa-solid fa-building">  </i>
                <a href="project_manage.jsp" >
                    <span>QL Dự án</span>
                </a> <i
                    class="m-0 fas fa-chevron-circle-down drop-down"></i> </div>
                <div class="sub-menu d-none">
                    <a href="../category/category_management.jsp" class="menu-btn">
                        <i class="fa-solid fa-building m-0"> </i> <i class="fa-solid fa-folder-tree"></i><span>QL loại dự án</span>
                    </a>
                    <a href="post_project.jsp" class="menu-btn">
                        <i class="fa-solid fa-newspaper"></i><span>QL Bài viết dự án</span>
                    </a>
                    <a href="project_schedule.jsp" class="menu-btn">
                        <i class="fa-solid fa-bars-progress"></i><span>QL Dự án thi công</span>
                    </a>
                </div>
            </li>

            <li class="sidebar-item" id="type-project">
                <div class="menu-btn">
                    <a href="../service/service_manage.jsp">
                        <i class="fa-solid fa-toolbox"></i><span>QL Dịch vụ</span>
                    </a><i
                        class="m-0 fas fa-chevron-circle-down drop-down"></i></div>
                <div class="sub-menu d-none">
                    <a href="../service/post_service.jsp" class="menu-btn">
                        <i class="fa-solid fa-newspaper"></i><span>QL Bài viết dịch vụ</span>
                    </a>
                </div>
            </li>
            <li class="sidebar-item" id="contact">
                <a href="../contact/contact_manage.jsp" class="menu-btn">
                    <i class="fa-solid fa-file-contract"></i></i><span>QL tương tác</span>
                </a>
            </li>
            <li class="sidebar-item" id="slide">
                <a href="../slide/slide_manage.jsp" class="menu-btn">
                    <i class="fa-regular fa-clone"></i><span>QL slide</span></span>
                </a>
            </li>
        </div>
    </div>


    <div class="main-container">
        <div class="container p-0">
            <nav class="" aria-label="breadcrumb">
                <ol class="breadcrumb p-0 bg-white">
                    <li class="breadcrumb-item"><a class="black-text" href="../dashboard.jsp">Thống kê</a></li>
                    <li><i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i></li>
                    <li class="breadcrumb-item"><a class="black-text" href="project_manage.jsp">QL Dự án</a></li>
                    <li><i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i></li>
                    <li class="breadcrumb-item"><a class="black-text" href="project_manage.jsp">QL Bài viết dự
                        án</a></li>
                    <li><i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i></li>
                    <li class="breadcrumb-item"><a class="main-color" href="add_project.jsp">Chỉnh sửa bài viết dự
                        án</a></li>
                </ol>
            </nav>

            <main class="container shadow border p-3 h-auto">

                <form action="/admin/post_project?action=save&id=${post.id}" method="post">
                    <div class="border-bottom pb-3 mb-3 ml-1 mr-1 d-flex justify-content-between align-items-center">
                        <div class="d-flex align-items-center p-0 ">
                            <h3 class="font-weight-bold main-color m-0">Chỉnh sửa bài viết</h3>
                        </div>

                        <div class="btn-save flex-center">
                            <button type="submit" class="btn btn-warning p-2 waves-effect waves-light"> LƯU
                            </button>
                        </div>
                    </div>
                    <div class="col-md-12 mb-4">
                        <div class="card card-cascade cascading-admin-card user-card">
                            <div class="card-body card-body-cascade">
                                <div class="col-lg-12 col-md-12 p-0">
                                    <div class="form-group">
                                        <textarea class="form-control rounded-0" name="content" rows="10"
                                                  id="service-des" contenteditable="true">
                                            ${post.content}
                                        </textarea>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </main>
        </div>
    </div>
</div>
<!--/. Sidebar navigation -->


<%@include file="/layout/public/script.jsp" %>
<script src="<c:url value="/template/lib/DataTables/DataTables-1.13.6/js/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/template/lib/ckeditor_4.22.1_standard/ckeditor/ckeditor.js"/>"></script>
<img src="" alt="">
<script>
    CKEDITOR.replace('service-des');
    CKEDITOR.config.width = "100%";
    CKEDITOR.config.height = "800px";
    // CKEDITOR.instances['service-des'].setData(
    //
    // )

</script>

<script>
    $(document).ready(function () {
        $(".sidebar-btn").click(function () {
            $(".wrapper").toggleClass("mycollapse");
        });

    });
</script>
<script>
    let cur;
    for (let item of $('.sidebar-item')) {
        item.addEventListener('click', function () {
            if (cur != null) {
                cur.classList.remove('d-block');
                cur.classList.add('d-none');
            }
            if (this.children.length === 2) {
                this.children[1].classList.remove('d-none')
                this.children[1].classList.add('d-block')
                cur = this.children[1];
            }
        })
    }

</script>
</body>
</html>

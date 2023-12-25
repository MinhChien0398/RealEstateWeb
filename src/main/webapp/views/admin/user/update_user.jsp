<%--
  Created by IntelliJ IDEA.
  User: Clover
  Date: 13/12/2023
  Time: 2:03 PM
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
    <link href=" <c:url value="/template/lib/DataTables/DataTables-1.13.6/css/jquery.dataTables.min.css"/>"
          rel="stylesheet">
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
                <a href="user_manage.jsp" class="menu-btn">
                    <i class="fas fa-user-circle"></i><span>QL Người dùng</span>
                </a>
            </li>
            <li class="sidebar-item" id="project">
                <div class="menu-btn">
                    <i class="fa-solid fa-building"> </i>
                    <a href="../project/project_manage.jsp">
                        <span>QL Dự án</span>
                    </a> <i
                        class="m-0 fas fa-chevron-circle-down drop-down"></i></div>
                <div class="sub-menu d-none">
                    <a href="../category/category_management.jsp" class="menu-btn">
                        <i class="fa-solid fa-building m-0"> </i> <i class="fa-solid fa-folder-tree"></i><span>QL loại dự án</span>
                    </a>
                    <a href="../project/post_project.jsp" class="menu-btn">
                        <i class="fa-solid fa-newspaper"></i><span>QL Bài viết dự án</span>
                    </a>
                    <a href="../project/project_schedule.jsp" class="menu-btn">
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
                    <i class="fa-solid fa-file-contract"></i><span>QL tương tác</span>
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
                    <li class="breadcrumb-item"><a class="black-text" href="#">Thống kê</a></li>
                    <li class="breadcrumb-item"><a class="black-text" href="#">QL người dùng</a></li>
                    <li class="breadcrumb-item"><a class="main-color" href="#">Cập nhật tài khoản</a></li>
                </ol>
            </nav>
            <main class="container shadow border p-3 h-100">
                <form action="">
                    <div class="row border-bottom pb-3 mb-3 ml-1 mr-1  justify-content-lg-between">
                        <div class="col-6 d-flex align-items-center p-0">
                            <h3 class="font-weight-bold main-color m-0">Cập nhật tài khoản</h3>
                        </div>
                        <div class="col-6 d-flex justify-content-end align-items-center p-0">
                            <a href="#add">
                                <button class="btn btn-warning p-2 waves-effect waves-light" type="button">LƯU
                                </button>
                            </a>
                        </div>
                    </div>
                    <div class="">
                        <div class="edit-profile flex-center">
                            <div class="col-md-8 mb-4">
                                <!-- Card -->
                                <div class="card card-cascade cascading-admin-card user-card">
                                    <!-- Card content -->
                                    <div class="card-body card-body-cascade">
                                        <!-- Grid row -->

                                        <div class="row">
                                            <div class="col-lg-6 col-md-6">

                                                <div class="md-form form-sm mb-0">
                                                    <input type="email" id="form8" class="form-control form-control-sm"
                                                           value="${user.email}">
                                                    <label for="form8" class="active">Email</label>
                                                </div>

                                            </div>
                                            <div class="col-lg-6 col-md-6">

                                                <div class="md-form form-sm mb-0">
                                                    <input type="password" id="form9"
                                                           class="form-control form-control-sm"
                                                           value="${user.password}">
                                                    <label for="form9" class="active">Password</label>
                                                </div>

                                            </div>
                                        </div>
                                        <div class="row d-flex align-items-center">
                                            <!-- Grid column -->
                                            <div class="col-lg-4">

                                                <div class="md-form form-sm mb-0">
                                                    <input type="text" id="form12" class="form-control form-control-sm" value="${user.fullName}">

                                                    <label for="form12" class="active">Họ và tên</label>
                                                </div>

                                            </div>
                                            <!-- Grid column -->

                                            <!-- Grid column -->

                                            <div class="col-lg-4">
                                                <div id="date-picker-example"
                                                     class="md-form mb-0 input-with-post-icon datepicker"
                                                     style="outline: none" inline="true">
                                                    <input type="text" id="birthday"
                                                           class="form-control form-control-sm" value="${user.birthday}">
                                                    <label for="birthday" class="" >Ngày sinh</label>
                                                    <i class="fas fa-calendar input-prefix"
                                                       style="font-size: .875rem"></i>
                                                </div>


                                            </div>
                                            <!-- Grid column -->

                                            <!-- Grid column -->
                                            <div class="col-lg-4">

                                                <div class="md-form form-sm mb-0">
                                                    <input type="text" id="form4" class="form-control form-control-sm"
                                                           value="${user.phone}">
                                                    <label for="form4" class="active">SĐT</label>
                                                </div>

                                            </div>
                                            <!-- Grid column -->
                                        </div>
                                        <div class="row">

                                            <!-- Grid column -->
                                            <div class="col-lg-6 col-md-10">

                                                <div class="md-form form-sm mb-0">
                                                    <select name="address" id="address" class=" custom-select ">
                                                        <option value="" disabled>Chọn tỉnh thành</option>
                                                        <c:forEach var="item" items="${sessionScope.get('provinces')}">
                                                            <option value="${item.name}">${item.name}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>


                                            </div>
                                            <!-- Grid column -->

                                            <!-- Grid column -->
                                            <div class="col-lg-6 input-group  justify-content-around" role="group">
                                                <div class="col-6 col-md-3">
                                                    <!-- Material unchecked -->
                                                    <div class="custom-control custom-radio form-check mt-4">
                                                        <input name="gender" type="radio" class="form-check-input"
                                                               id="male" checked>
                                                        <label class="form-check-label"
                                                               for="male">Nam</label>
                                                    </div>
                                                </div>
                                                <!-- Grid column -->
                                                <!-- Grid column -->
                                                <div class="col-6 col-md-3">
                                                    <!-- Material indeterminate -->
                                                    <div class="custom-control custom-radio form-check mt-4">
                                                        <input name="gender" type="radio" class="form-check-input"
                                                               id="female"
                                                        >
                                                        <label class="form-check-label"
                                                               for="female">Nữ</label>
                                                    </div>
                                                </div>
                                            </div>

                                            <!-- Grid column -->

                                            <!-- Grid column -->

                                            <div class="col-lg-12 col-md-12 d-flex justify-content-between m-auto p-0">
                                                <div class="col-lg-6 col-md-6">

                                                    <div class="md-form form-sm mb-0">
                                                        <select class="browser-default custom-select mb-4">
                                                            <option value="" disabled>Trạng thái</option>
                                                            <option value="1">Chưa kích hoạt</option>
                                                            <option value="2" selected>Kích hoạt</option>
                                                            <option value="3">Khóa</option>
                                                        </select>
                                                    </div>

                                                </div>
                                                <div class="col-lg-6 col-md-6">
                                                    <div class="md-form form-sm mb-0">
                                                        <select class="browser-default custom-select mb-4">
                                                            <option value="" disabled>Chọn phân quyền</option>
                                                            <option value="1">Người dùng</option>
                                                            <option value="2" selected>Admin</option>
                                                        </select>
                                                    </div>

                                                </div>
                                                <!-- Grid column -->
                                            </div>
                                        </div>
                                        <!-- Grid row -->

                                        <!-- Grid row -->

                                    </div>
                                    <!-- Grid row -->

                                    <!-- Grid row -->

                                </div>
                                <!-- Card content -->

                            </div>
                            <!-- Card -->

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
<script>
    $('#table-user').dataTable({
        // "ajax": {
        //     // "url": "http://localhost/RealEstateWeb/userManage" ,
        //     "dataSrc": ""
        // },
        "columnDefs": [
            {
                "targets": 0,
                "width": "5%",
            },
            {
                "targets": 1,
                "width": "15%",
            },
            {
                "targets": 2,
                "width": "20%",
            },
            {
                "targets": 3,
                "width": "10%",
            },
            {
                "targets": 4,
                "width": "10%",
            },
            {
                "targets": 5,
                "width": "5%",
            },
            {
                "targets": 6,
                "width": "5%",
            },
            {
                "targets": 7,
                "width": "10%",
            },
            {
                "targets": 8,
                "width": "10%",
            },
            {
                "targets": 9,
                "width": "1%",
            },
            {className: "text-center mt-auto mb-auto", targets: "_all"},

        ],
        "language": {
            "lengthMenu": "Hiển thị _MENU_ dòng",
            "zeroRecords": "Không tìm thấy dữ liệu",
            "info": "Hiển thị trang _PAGE_ trên _PAGES_",
            "infoEmpty": "Không có dữ liệu",
            "infoFiltered": "(lọc từ _MAX_ dòng dữ liệu)",
            "search": "Tìm kiếm",
            "paginate": {
                "previous": "Trước",
                "next": "Tiếp theo"
            }
        },
        "pagingType": "full_numbers",
        "lengthMenu": [5, 10, 15, 20],
        "order": [[0, "asc"]],
    });

</script>
<script>
    $(document).ready(function () {
        $(".sidebar-btn").click(function () {
            $(".wrapper").toggleClass("mycollapse");
        });

    });
</script>
<script>
    $('.datepicker').datepicker({
        inline: true,
        monthsFull: ['Tháng 01', 'Tháng 02', 'Tháng 03', 'Tháng 04', 'Tháng 05', 'Tháng 06', 'Tháng 07', 'Tháng 08', 'Tháng 09', 'Tháng 10',
            'Tháng 11', 'Tháng 12'],

        weekdaysFull: ["CN", "T2", "T3", "T4", "T5", "T6", "T7"],
        showWeekdaysFull: true,
        today: 'Hôm nay',
        clear: 'Xóa',
        close: 'Đóng',
        regional: 'vi-VN',
        labelMonthNext: 'Tháng kế tiêp',
        labelMonthPrev: 'Tháng trước',
        labelMonthSelect: 'Chọn tháng',
        labelYearSelect: 'Chọn năm',
        format: 'dd/mm/yyyy',
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

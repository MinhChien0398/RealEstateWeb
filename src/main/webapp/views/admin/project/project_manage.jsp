<%--
  Created by IntelliJ IDEA.
  User: Clover
  Date: 11/12/2023
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@include file="/layout/common.jsp" %>
<html>
<head>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%@include file="/layout/public/link.jsp" %>
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
                <a href="../user/user_manage.jsp" class="menu-btn">
                    <i class="fas fa-user-circle"></i><span>QL Người dùng</span>
                </a>
            </li>
            <li class="sidebar-item" id="project">
                <div class="menu-btn">
                    <i class="fa-solid fa-building"> </i>
                    <a href="project_manage.jsp">
                        <span>QL Dự án</span>
                    </a> <i
                        class="m-0 fas fa-chevron-circle-down drop-down"></i></div>
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

    <div class="main-container" style="height: fit-content">
        <div class="container">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb m-0 bg-white">
                    <li class="breadcrumb-item"><a class="black-text" href="#">Thống kê</a></li>
                    <li>
                        <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                    </li>
                    <li class="breadcrumb-item">
                        <a class="main-color" href="#">QL dự án</a>
                    </li>
                </ol>
            </nav>
            <main class="shadow border p-3 h-100">
                <div class="row border-bottom pb-3 mb-3 ml-1 mr-1   ">
                    <div class="col-6 d-flex align-items-center p-0">
                        <h3 class="font-weight-bold main-color m-0">QL DỰ ÁN</h3>
                    </div>
                    <div class="col-6 d-flex justify-content-end align-items-center p-0">
                        <a href="/admin/project_additional_and_edit">
                            <button class="btn btn-blue p-2" type="button"><i class="fa-solid fa-plus"></i> Thêm dự án
                            </button>
                        </a>
                    </div>
                </div>
                <table id="project-table" class="table table-hover table-striped table-bordered m-0 w-100" style="">
                    <thead>
                    <tr>
                        <th class="font-weight-bold" scope="col">#</th>
                        <th class="font-weight-bold" scope="col">Tên dự án</th>
                        <th class="font-weight-bold" scope="col">Avatar</th>
                        <th class="font-weight-bold" scope="col">Định mức</th>
                        <th class="font-weight-bold" scope="col">Địa chỉ</th>
                        <th class="font-weight-bold" scope="col">Loại dự án</th>
                        <th class="font-weight-bold" scope="col">Đồng ý đăng</th>
                        <th class="font-weight-bold" scope="col">Trạng thái</th>
                        <th class="font-weight-bold" scope="col">Ngày cập nhập</th>
                        <th class="font-weight-bold" scope="col">Hành động</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    </tbody>
                </table>
            </main>
        </div>
    </div>
</div>
<!--/. Sidebar navigation -->


<%@include file="/layout/public/script.jsp" %>
<script src="<c:url value="/template/lib/DataTables/DataTables-1.13.6/js/jquery.dataTables.min.js"/>"></script>
<script>
    $.ajax({
        url: "${pageContext.request.contextPath}/api/project",
        type: "GET",
        dataType: "json",
        success: function (data) {
            console.log(data)
        },
        error: function (e) {
            console.log(e)
        }
    })
</script>
<script>
    let index = 1;
    $('#project-table').dataTable({
        ajax: {
            url: "${pageContext.request.contextPath}/api/project",
            type: "get",
            dataSrc: "",
            dataType: "json",
        },
        columns: [
            {

                render: function () {
                    return index++;
                }
            },
            {
                data: "title",
                render: function (title) {
                    return (title==null|| title==="")?"---":title;
                }
            },
            {
                data: "avatar",
                render: function (avatar) {
        return (avatar==null|| avatar==="")?"":"<img src=\""+avatar+"\" alt=\"\" style=\"\" class=\"w-100\">"
            },
            },
            {
                data: "price",
                render: function (price) {
                    return (price==null|| price===0)?0:price  + "VND";
                }
            },
            {
                data: "province",
                render: function (province) {
                    return (province==null|| province==="")?"---":province;
                }
            },
            {
                data: "category",
                render: function (category) {
                    return (category==null|| category==="")?"---":category;
                }
            },
            {
                data: "isAccepted", render: function (isAccepted) {
                    if (isAccepted === 1 ) {
                        return '<i class="fa-solid fa-square active-icon" value="0"></i>'
                    } else {
                        return '<i class="fa-solid fa-square inactive-icon" value="1"></i>'
                    }
                }
            },
            {
                data: "status",
                render: function (status) {
                    if (status === 1) {
                        return '<i class="fa-solid fa-square active-icon" value="0"></i>'
                    } else {
                        return '<i class="fa-solid fa-square inactive-icon" value="1"></i>'
                    }
                }
            },
            {
                data: "updatedAt", render: function (updatedAt) {
                    return updatedAt
                }
            },
            {
                data: "id",
                render: function (id) {
                    return '<a href="/admin/project_additional_and_edit?action=edit&id=' + id + '"><i class="icon-action fa-solid fa-edit"></i></a>\n' +
                        '                            <a href="#delete"><i class="icon-action fa-solid fa-trash-can"></i></a>'
                }
            },
        ],
        // responsive: true,
        // scrollX: true,
        columnDefs: [
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
                "width": "10%",
            },
            {
                "targets": 3,
                "width": "15%",
            },
            {
                "targets": 4,
                "width": "10%",
            },
            {
                "targets": 5,
                "width": "10%",
            },
            {
                "targets": 6,
                "width": "10%",
            },
            {
                "targets": 7,
                "width": "5%",
            },
            {
                "targets": 8,
                "width": "10%",
            },
            {
                "targets": 9,
                "width": "10%",
            },
            {className: "text-center mt-auto mb-auto", targets: "_all"},

        ],
        language: {
            lengthMenu: "Hiển thị _MENU_ dòng",
            zeroRecords: "Không tìm thấy dữ liệu",
            info: "Hiển thị trang _PAGE_ trên _PAGES_",
            infoEmpty: "Không có dữ liệu",
            infoFiltered: "(lọc từ _MAX_ dòng dữ liệu)",
            search: "Tìm kiếm",
            paginate: {
                previous: "Trước",
                next: "Tiếp theo"
            }
        },
        pagingType: "full_numbers",
        lengthMenu: [5, 10, 15, 20],
        order: [[0, "asc"]],
    });
    // $('#project-table').columns.adjust().draw();
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

<script>
    $(document).ready(function () {
        $(".sidebar-btn").click(function () {
            $(".wrapper").toggleClass("mycollapse");
        });
    });
</script>
</body>
</html>

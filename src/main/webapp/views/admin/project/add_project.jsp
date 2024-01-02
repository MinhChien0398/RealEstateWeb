<%--
  Created by IntelliJ IDEA.
  User: Clover
  Date: 04/12/2023
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@include file="/layout/common.jsp" %>
<html>
<head>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta charset="UTF-8">
    <meta content="application/x-www-form-urlencoded;charset=utf-8" http-equiv="Content-Type">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%@include file="/layout/public/link.jsp" %>
    <link href=" <c:url value="/template/css/admin-nav-bar.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/css/fileInput.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/css/addProjectPage.css"/>" rel="stylesheet">

    <style>
        .select-wrapper input.select-dropdown, .custom-file-label {
            z-index: 0;
        }

        div.picker.datepicker .picker__box {
            border: 1px solid;
            box-shadow: none;
        }

    </style>
    <title>Title</title>
</head>
<body>

<!-- Sidebar navigation -->
<div class="wrapper">
    <div class="header fixed-top">
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
                <img src="<c:url value="/template/img/logo/logo.png"></c:url>" alt="logo" style="">
            </center>
            <li class="sidebar-item">
                <a href="dashboard.html" class="menu-btn">
                    <i class="fas fa-desktop"></i><span>Thống kê</span>
                </a>
            </li>
            <li class="sidebar-item" id="user">
                <a href="admin-userManage.html" class="menu-btn">
                    <i class="fas fa-user-circle"></i><span>QL Người dùng</span>
                </a>
            </li>
            <li class="sidebar-item" id="project">
                <div class="menu-btn">
                    <i class="fa-solid fa-building"> </i>
                    <a href="admin-projectsManage.html">
                        <span>QL Dự án</span>
                    </a> <i
                        class="m-0 fas fa-chevron-circle-down drop-down"></i></div>
                <div class="sub-menu d-none">
                    <a href="admin-TypeOfProject.html" class="menu-btn">
                        <i class="fa-solid fa-building m-0"> </i> <i class="fa-solid fa-folder-tree"></i><span>QL loại dự án</span>
                    </a>
                    <a href="admin-PostProject.html" class="menu-btn">
                        <i class="fa-solid fa-newspaper"></i><span>QL Bài viết dự án</span>
                    </a>
                    <a href="admin-ProjectSchedule.html" class="menu-btn">
                        <i class="fa-solid fa-bars-progress"></i><span>QL Dự án thi công</span>
                    </a>
                </div>
            </li>

            <li class="sidebar-item" id="type-project">
                <div class="menu-btn">
                    <a href="servicesManager.html">
                        <i class="fa-solid fa-toolbox"></i><span>QL Dịch vụ</span>
                    </a><i
                        class="m-0 fas fa-chevron-circle-down drop-down"></i></div>
                <div class="sub-menu d-none">
                    <a href="servicePostsManage.html" class="menu-btn">
                        <i class="fa-solid fa-newspaper"></i><span>QL Bài viết dịch vụ</span>
                    </a>
                </div>
            </li>
            <li class="sidebar-item" id="contact">
                <a href="admin-contactManagement.html" class="menu-btn">
                    <i class="fa-solid fa-file-contract"></i></i><span>QL tương tác</span>
                </a>
            </li>
            <li class="sidebar-item" id="slide">
                <a href="admin-slideManagement.html" class="menu-btn">
                    <i class="fa-regular fa-clone"></i><span>QL slide</span></span>
                </a>
            </li>
        </div>
    </div>

    <div class="main-container">
        <div class="container p-0">
            <nav class="" aria-label="breadcrumb">
                <ol class="breadcrumb p-0 bg-white">
                    <li class="breadcrumb-item"><a class="black-text" href="dashboard.html">Thống kê</a></li>
                    <li><i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i></li>
                    <li class="breadcrumb-item"><a class="black-text" href="admin-projectsManage.html">QL Dự án</a></li>
                    <li><i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i></li>
                    <li class="breadcrumb-item"><a class="main-color" href="addProjectsPage.html">Thêm dự án</a></li>
                </ol>
            </nav>
            <main class="container shadow border p-3 h-auto">
                <form action="api/project?action=add" enctype="multipart/form-data" method="post"  id="add-project">
                    <div class="border-bottom pb-3 mb-3 ml-1 mr-1 d-flex justify-content-between align-items-center">
                        <div class="d-flex align-items-center p-0">
                            <h3 class="font-weight-bold main-color m-0">Thêm Dự án</h3>
                        </div>
                        <div class="d-flex">
                            <ul class="nav nav-pills  d-flex font-weight-bold align-items-center" id="pills-tab"
                                role="tablist">
                                <li class="">
                                    <a class="nav-link active " id="pills-home-tab" data-toggle="pill"
                                       href="#pills-home"
                                       role="tab"
                                       aria-controls="pills-home" aria-selected="true">Thông tin</a>
                                </li>
                                <li class="">
                                    <a class="nav-link " id="pills-profile-tab" data-toggle="pill"
                                       href="#pills-profile"
                                       role="tab"
                                       aria-controls="pills-profile" aria-selected="false">Bài viết</a>
                                </li>
                            </ul>
                        </div>
                        <div class="btn-save flex-center">
                            <button id="save" form="add-project" class="btn btn-warning p-2 waves-effect waves-light"
                                    type="button"> LƯU
                            </button>
                        </div>
                    </div>

                    <div class="tab-content pt-2 pl-1" id="pills-tabContent" style="height: fit-content">
                        <div class="tab-pane fade show active" id="pills-home" role="tabpanel"
                             aria-labelledby="pills-home-tab">
                            <div class="edit-profile flex-center">
                                <div class="col-md-8 mb-4">
                                    <!-- Card -->
                                    <div class="card card-cascade cascading-admin-card user-card">
                                        <!-- Card content -->
                                        <div class="card-body card-body-cascade">
                                            <div class="row flex-center">
                                                <div class="col-lg-11 mb-4">
                                                    <div class="card-body">
                                                        <div class="mb-4">
                                                            <label for="OwnEmail" class="labels">Chủ đầu tư</label>
                                                            <input id="OwnEmail" type="email" class="form-control"
                                                                   name="OwnEmail" placeholder="Email chủ đầu tư"
                                                                   value="">
                                                        </div>
                                                        <div class="mb-4">
                                                            <label for="title" class="labels">Tiêu đề</label>
                                                            <input id="title" type="text" class="form-control"
                                                                   name="title" placeholder="Tiêu đề" value="">
                                                        </div>
                                                        <div class="mb-4">
                                                            <label for="categoryId" class="labels">Loại dự án</label>
                                                            <select name="categoryId" id="categoryId" name="categoryId"
                                                                    class="form-control">
                                                                <option value="" disabled selected>Loại dự án</option>


                                                            </select>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-6 mb-4">
                                                                <label for="price" class="labels">Kinh phí</label>
                                                                <input id="price" type="number" name="price"
                                                                       class="form-control"
                                                                       placeholder="Kinh phí" value="">
                                                            </div>
                                                            <div class="col-6 mb-4">
                                                                <label for="acreage" class="labels">Diện tích</label>
                                                                <input id="acreage" type="number" class="form-control"
                                                                       placeholder="Diện tích" name="acreage" value="">
                                                            </div>
                                                        </div>
                                                        <div class="mb-4">
                                                            <label for="provinceId" class="labels">Địa chỉ</label>
                                                            <select name="provinceId" id="provinceId"
                                                                    class="form-control">
                                                                <option value="" disabled selected>Chọn tỉnh thành
                                                                </option>


                                                            </select>
                                                        </div>
                                                        <div class="mb-4">
                                                            <div class="form-group green-border-focus">
                                                                <label for="description">Mô tả</label>
                                                                <textarea class="form-control"
                                                                          id="description"
                                                                          name="description"
                                                                          rows="3" placeholder="Mô tả dự án"></textarea>
                                                            </div>
                                                        </div>
                                                        <div class="mb-4">
                                                            <label class="mdb-main-label">Dịch vụ</label>
                                                            <select class="mdb-select md-form" name="service[]"
                                                                    multiple>
                                                                <option value="1" selected>Xây dựng phần thô</option>
                                                            </select>
                                                        </div>
                                                        <div class="mb-4 ">
                                                            <div class="d-flex">
                                                                <label>Tiến độ dự án:</label>
                                                                <div class="form-check">
                                                                    <input type="checkbox" checked="false"
                                                                           name="isComplete" onclick="conpleteProject()"
                                                                           class="form-check-input"
                                                                           id="isComplete">
                                                                    <label class="form-check-label"
                                                                           for="isComplete">Hoàn thành</label>
                                                                </div>
                                                            </div>
                                                            <div id="projectProgressText">
                                                                <input type="text" class="form-control  mb-3"
                                                                       placeholder="Tiến độ dự án" id="schedule"
                                                                       name="schedule" value="">
                                                                <div id="date-picker-example"
                                                                     class="md-form md-outline
                                                                     input-with-post-icon datepicker"
                                                                     style="outline: none " inline="true">
                                                                    <input placeholder="Dự kiến ngày hoàng thành"
                                                                           type="text" id="estimated_complete"
                                                                           name="estimated_complete"
                                                                           class="form-control">
                                                                    <i class="fas fa-calendar input-prefix"></i>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="mb-4">
                                                            <div class="d-flex">
                                                                <label for="status" class="labels">Trạng thái: </label>
                                                                <div class="form-check">
                                                                    <input type="checkbox" checked="true"
                                                                           name="isAccepted"
                                                                           onclick="userAccepted()"
                                                                           class="form-check-input" id="isAccepted">
                                                                    <label class="form-check-label"
                                                                           for="isAccepted">Người dùng chấp nhận đăng
                                                                        bài</label>
                                                                </div>
                                                            </div>
                                                            <select id="status" name="status" class="custom-select">
                                                                <option value="1">Đăng bài</option>
                                                                <option value="2">Ẩn</option>
                                                            </select>
                                                        </div>

                                                        <div class="mb-4">
                                                            <div class="input-group mt-2 d-flex align-items-center">
                                                                <label>Chọn hình đại diện</label>
                                                                <div class="file-field d-flex align-items-center">
                                                                    <div class="btn btn-primary btn-sm float-left waves-effect waves-light">
                                                                        <span>chọn ảnh</span>
                                                                        <input type="file" name="avatar[]" id="avatar">
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <div class="upload-wrapper d-none avatar">
                                                                <div class="border d-flex img-container">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- Card content -->
                                    </div>
                                    <!-- Card -->
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="pills-profile" role="tabpanel"
                             aria-labelledby="pills-profile-tab">
                            <div class="edit-profile flex-center">
                                <div class="col-md-12 mb-12">
                                    <div class="card card-cascade cascading-admin-card user-card">
                                        <div class="card-body card-body-cascade">
                                            <div class=" col-12 mb-4">
                                                <div class="input-group mt-2 d-flex align-items-center">
                                                    <label>Hình ảnh mô tả dự án</label>
                                                    <div class="file-field d-flex align-items-center">
                                                        <div class="btn btn-primary btn-sm float-left waves-effect waves-light">
                                                            <span>chọn ảnh</span>
                                                            <input type="file"  name="groupImage[]" id="file_input1"
                                                                   multiple>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="upload-wrapper d-none avatar">
                                                    <div class="border d-flex img-container1">
                                                    </div>
                                                </div>
                                            </div>

                                        </div>

                                        <div class="col-12 p-0">
                                            <div class="form-group">
                                                    <textarea class="form-control rounded-0" name="post" id="post"
                                                              rows="10"></textarea>
                                            </div>
                                        </div>
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
<script src="<c:url value="/template/js/inputFile.js"/>"></script>
<script>
    function savePost(id) {
        $.ajax({
            url: "http://localhost:8080/api/project?action=add",
            type: "POST",
            dataType: "json",
            data: {
                post: CKEDITOR.instances.post.getData(),
                id: id
            },
            success: function (data) {
                console.log(data)
            },
            error: function (data) {
                console.log(data)
            }
        })
    }
</script>
<script>
    function uploadGroupImage() {
        var file_data = $('#file_input1').prop('files');
        var form_data = new FormData();
        for (let i = 0; i < file_data.length; i++) {
            form_data.append('file', file_data[i]);
        }
        $.ajax({
            url: 'http://localhost:8080/api/uploadImage?action=groupImage',
            dataType: 'text',
            cache: false,
            contentType: false,
            processData: false,
            data: form_data,
            type: 'POST',
            success: function (res) {
                console.log(res)
            },
            error: function (res) {
                console.log(res)
            }
        });
    }
</script>
<script>
    $('#save').click(function () {
        let form = new FormData();
        form.append('ownEmail',$("#OwnEmail").val())
        form.append('title', $("#title").val());
        form.append('categoryId', $("#categoryId").val());
        form.append('price', $("#price").val());
        form.append('acreage', $("#acreage").val());
        form.append('provinceId', $("#provinceId").val());
        form.append('description', $("#description").val());
        form.append('service', $("#service").val());
        form.append('schedule', $("#schedule").val());
        form.append('estimated_complete', $("#estimated_complete").val());
        form.append('status', $("#status").val());
        form.append('avatar', $("#avatar").prop('files')[0]);
        form.append('isAccepted', $("#isAccepted").is(":checked") ? 1 : 0);
        form.append('isComplete', $("#isComplete").is(":checked") ? 1 : 0);
        $.ajax({
            url: "/api/project?action=add",
            type: "POST",
            // dataType: "json",
            processData: false,
            contentType: false,
            data:  form,
            success: function (data) {
                if(data.status === 200){
                    // uploadAvatar()
                    // uploadGroupImage()
                    // savePost(data.data)
                }
            },
            error: function (data) {
                console.log(data)
            }
        })
    })
</script>
<script>
    CKEDITOR.replace('post', {
        width: "100%",
        height: "400px",
    });

</script>
<script>
    let allFiles1 = [];
    let input1 = document.getElementById("file_input1");
    let container1 = document.getElementsByClassName("img-container1");
    // console.log(input.files)
    if (input1.files.length !== 0 || allFiles1.length !== 0) {
        container1[0].parentElement.classList.add('d-block')
        container1[0].parentElement.classList.remove('d-none')
    } else {
        container1[0].parentElement.classList.add('d-none')
        container1[0].parentElement.classList.remove('d-block')
    }
    input1.addEventListener('change', function () {
        let files1 = this.files;
        for (let i = 0; i < files1.length; i++) {
            allFiles1.push(files1[i])
        }
        showImage1();
    })
    const showImage1 = () => {
        if (input1.files.length !== 0) {
            container1[0].parentElement.classList.add('d-block')
            container1[0].parentElement.classList.remove('d-none')
        } else {
            container1[0].parentElement.classList.add('d-none')
            container1[0].parentElement.classList.remove('d-block')
        }
        let images1 = ' ';
        allFiles1.forEach((e, i) => {
            images1 += '<div class="image1 position-relative border-radius"><img src="' + URL.createObjectURL(e) + '" alt="" class="border"> ' +
                '<div class="position-absolute " > <i class="fa-solid fa-xmark" onclick="delImage1(' + i + ')" style=""></i></div></div>'
        })
        container1[0].innerHTML = images1
    }
    let dt1 = new DataTransfer();
    const delImage1 = index => {
        let dt1 = new DataTransfer();
        for (let i = 0; i < input1.files.length; i++) {
            if (index !== i)
                dt1.items.add(input1.files[i]) // here you exclude the file. thus removing it.
        }
        input1.files = dt1.files
        allFiles1 = Array.from(input1.files)
        showImage1()
    }
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
        format: 'yyyy-mm-dd',
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
    userAccepted()

    function userAccepted() {
        var status = document.getElementById('status');
        if (!document.getElementById('isAccepted').checked) {
            status.classList.add('d-none');
            status.classList.remove('d-block');
        } else {
            status.classList.add('d-block');
            status.classList.remove('d-none');
        }
    }
</script>
<script>
    conpleteProject()

    function conpleteProject() {
        var projectProgressText = document.getElementById('projectProgressText');
        if (document.getElementById('isComplete').checked) {
            projectProgressText.classList.add('d-none');
            projectProgressText.classList.remove('d-block');
        } else {
            projectProgressText.classList.add('d-block');
            projectProgressText.classList.remove('d-none');
        }
    }
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
        $('.mdb-select').materialSelect();
    });
</script>
</body>
</html>

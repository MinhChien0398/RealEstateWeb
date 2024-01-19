<%--
  Created by IntelliJ IDEA.
  User: Clover
  Date: 11/12/2023
  Time: 1:54 PM
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
    <link href=" <c:url value="/template/css/admin-nav-bar.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/css/fileInput.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/lib/DataTables/DataTables-1.13.6/css/jquery.dataTables.min.css"/>" rel="stylesheet">
    <link href=" <c:url value="/template/lib/DataTables/DataTables-1.13.6/css/dataTables.bootstrap4.css"/>" rel="stylesheet">

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
                <a href="../project/project_manage.jsp" >
                    <span>QL Dự án</span>
                </a> <i
                    class="m-0 fas fa-chevron-circle-down drop-down"></i> </div>
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
                    <i class="fa-solid fa-file-contract"></i></i><span>QL tương tác</span>
                </a>
            </li>
            <li class="sidebar-item" id="slide">
                <a href="slide_manage.jsp" class="menu-btn">
                    <i class="fa-regular fa-clone"></i><span>QL slide</span></span>
                </a>
            </li>
        </div>
    </div>

    <div class="main-container">
        <div class="container p-0">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb p-0 bg-white">
                    <li class="breadcrumb-item"><a class="black-text" href="/admin/dashboard">Thống kê</a></li>
                    <li>
                        <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                    </li>
                    <li class="breadcrumb-item">
                        <a class="black-text" href="/admin/slide">QL slide</a>
                    </li>
                    <li>
                        <i class="fas fa-caret-right mx-2 black-brown-text" aria-hidden="true"></i>
                    </li>
                    <li class="breadcrumb-item">
                        <a class="main-color" href="#">Chỉnh sửa Slide</a>
                    </li>
                </ol>
            </nav>

            <main class="container shadow border p-3 h-auto">
                <form>
                    <div class="row border-bottom pb-3 mb-3 ml-1 mr-1  justify-content-lg-between">
                        <div class="col-6 d-flex align-items-center p-0">
                            <h3 class="font-weight-bold main-color m-0">Chỉnh sửa Slide</h3>
                        </div>
                        <div class="col-6 d-flex justify-content-end align-items-center p-0">
                                <button class="btn btn-warning p-2 waves-effect waves-light" id="save" type="button">LƯU
                                </button>
                        </div>
                    </div>
                    <div>
                        <div class="row flex-center h-auto">
                            <div class="card col-lg-10 mb-4">
                                <div class="card-body">
                                    <div class="mb-4">
                                        <label for="title" class="labels">Tiêu đề</label>
                                        <input id="title" type="text" class="form-control"
                                               placeholder="Tiêu đề" value="${slider.title}">
                                    </div>
                                    <div class="mb-4">
                                        <label for="status" class="labels">Trạng thái</label>
                                        <select id="status" class="browser-default custom-select">
                                            <c:choose>
                                                <c:when test="${slider.status == 1}">
                                                    <option value="1" selected>Kích hoạt</option>
                                                    <option value="0">Ẩn</option>
                                                </c:when>
                                                <c:otherwise>
                                                    <option value="1">Kích hoạt</option>
                                                    <option value="0" selected>Ẩn</option>
                                                </c:otherwise>
                                            </c:choose>
                                        </select>
                                    </div>
                                    <div class="mb-4">
                                        <label for="sequence" class="labels">STT</label>
                                            <input id="sequence" type="number" class="form-control"
                                                   placeholder="STT" value="${slider.sequence}">
                                    </div>
                                    <div class="mb-4">
                                        <div class="input-group mt-2 d-flex align-items-center">
                                            <label>Chọn hình đại diện</label>
                                            <div class="file-field d-flex align-items-center">
                                                <div class="btn btn-primary btn-sm float-left waves-effect waves-light">
                                                    <span>chọn ảnh</span>
                                                    <input type="file" name="avatar"
                                                           id="avatar"
                                                           accept="image/*">
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
                </form>
            </main>
        </div>
    </div>
</div>
<!--/. Sidebar navigation -->
</body>


<%@include file="/layout/public/script.jsp" %>
<script src="<c:url value="/template/lib/DataTables/DataTables-1.13.6/js/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/template/lib/DataTables/DataTables-1.13.6/js/dataTables.bootstrap4.min.js"/>"></script>
<script>
    $('#save').click(function () {
        let form = new FormData();
        form.append('id',${slider.id});
        form.append('title', $('#title').val());
        form.append('status', $('#status').val());
        form.append('sequence', $('#sequence').val());
    if ($("#avatar").prop('files').length != 0)
        form.append('avatar', $("#avatar").prop('files')[0]);
    else form.append('notHave', '1');;
        $.ajax({
            url: "/api/slider/edit?id=${slider.id}",
            type: 'POST',
            dataType: "json",
            contentType: false,
            processData: false,
            data: form,
            success: function (data) {
                console.log(data.responseText)
            },
            error: function (data) {
                console.log(data.responseText)
                // saveService(data.data.id);
            }
        });
    });

</script>
<script>
    let allFiles = [];
    let input = document.getElementById("avatar");
    let container = document.getElementsByClassName("img-container");
    // console.log(input.files)
    if (input.files.length == 0 && allFiles.length == 0) {
        let images = ' ';
        container[0].parentElement.classList.add('d-block')
        container[0].parentElement.classList.remove('d-none')
        images += '<div class="image position-relative border-radius"><img src="${slider.avatar}" alt="" class="border"> ' +
            '<div class="position-absolute " ></div></div>'
        container[0].innerHTML = images;
    }

    input.addEventListener('change', function () {
        let files = this.files;
        allFiles = [];
        for (let i = 0; i < files.length; i++) {
            allFiles.push(files[i])
        }
        showImage();
    })

    const showImage = () => {
        container[0].parentElement.classList.add('d-block')
        container[0].parentElement.classList.remove('d-none')
        if (input.files.length == 0) {
            let images = ' ';
            images += '<div class="image position-relative border-radius"><img src="${slider.avatar}" alt="" class="border"> ' +
                '<div class="position-absolute " ></div></div>'
            container[0].innerHTML = images;
        } else {
            let images = ' ';
            allFiles.forEach((e, i) => {
                images += '<div class="image position-relative border-radius"><img src="' + URL.createObjectURL(e) + '" alt="" class="border"> ' +
                    '<div class="position-absolute " > <i class="fa-solid fa-xmark" onclick="delImage(' + i + ')" style=""></i></div></div>'
            })
            container[0].innerHTML = images
        }
    }
    let dt = new DataTransfer();
    const delImage = index => {
        let dt = new DataTransfer();
        for (let i = 0; i < input.files.length; i++) {
            if (index !== i)
                dt.items.add(input.files[i]) // here you exclude the file. thus removing it.
        }
        input.files = dt.files
        allFiles = Array.from(input.files)
        showImage()
    }
    // document.onload = function () {
    //         if(input.files.length!== 0) {
    //         input.files
    //         }
    // };

</script>
<script>
    $(document).ready(function () {
        $(".sidebar-btn").click(function () {
            $(".wrapper").toggleClass("mycollapse");
        });
    });</script>
<script>
    let cur ;
    for (let item of  $('.sidebar-item')) {
        item.addEventListener('click', function (){
            if(cur!=null) {
                cur.classList.remove('d-block');
                cur.classList.add('d-none');
            }
            if(this.children.length===2){
                this.children[1].classList.remove('d-none')
                this.children[1].classList.add('d-block')
                cur=this.children[1];
            }
        })
    }

</script>

</body>
</html>

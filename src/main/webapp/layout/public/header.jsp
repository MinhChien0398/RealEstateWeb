<%@include file="/layout/common.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<nav class="navbar navbar-expand-lg navbar-light sticky-top nav-property ">
    <div class="container">
        <a class="navbar-brand "
           href="#">
            <div class="navbar-brand flex-center justify-content-between ">
                <img class="mr-3 ml-4 " src="<c:url value="/template/img/logo/logo.png" />" style="width: 50px">
                <h5 class=" text-uppercase mb-2 mt-2 font-weight-bold main-color">XÂY DỰNG NHÀ ĐẸP</h5>
            </div>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-555"
                aria-controls="navbarSupportedContent-555" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse border-left row  align-items-center" id="navbarSupportedContent-555">
            <ul class="navbar-nav  col-9 border-right">
                <li class="nav-item nav-menuItem font-weight-bolder " id="nav-menuItem-active">
                    <a class="nav-link" href="#">Trang Chủ
                    </a>
                </li>
                <li class="nav-item nav-menuItem font-weight-bolder">
                    <a class="nav-link " href="#">Giới Thiệu</a>
                </li>
                <li class="nav-item nav-menuItem position-relative font-weight-bolder nav-dropdownItem d-flex align-items-center"
                >
                    <a class="nav-link justify-content-center text-center"
                       href="#"
                       role="link"
                    >Dịch vụ
                    </a>
                    <i class="fa-solid fa-angle-down position-absolute  " style="color: #000000;"></i>
                    <div class="dropdown-menu mt-1 w-100">
                        <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Trọn Gói</a>
                        <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Thô</a>
                        <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Biệt Thự</a>
                        <a class="dropdown-item text-center" style="font-size: 16px" href="#">Xây Nhà Xưởng</a>
                    </div>
                </li>
                <li class=" nav-item
                nav-menuItem position-relative font-weight-bolder nav-dropdownItem d-flex align-items-center"
                >
                <a class="nav-link justify-content-center text-center"
                   href="#"
                   role="link"
                >Dự án
                </a>
                <i class="fa-solid fa-angle-down position-absolute  " style="color: #000000;"></i>

                <div class="dropdown-menu mt-1 w-100">
                    <a class="dropdown-item text-center" style="font-size: 16px" href="#">Biệt Thự</a>
                    <a class="dropdown-item text-center" style="font-size: 16px" href="#">Nhà Phố</a>
                    <a class="dropdown-item text-center" style="font-size: 16px" href="#">Văn Phòng</a>
                </div>
                </li>
                <li class="nav-item nav-menuItem font-weight-bolder">
                    <a class="nav-link" href="contact.jsp">Liên Hệ</a>
                </li>
                <li class="nav-item nav-menuItem font-weight-bolder">
                    <a class="nav-link" href="login.jsp">Đăng nhập</a>

                </li>
            </ul>
            <!--icon font ring-->
            <div class="phone-contain flex-center justify-content-center col-3">

                <div class="icon-phone-ring col-lg-6 col-md-6 col-sm-12 ">
                    <div class="w-100 h-100 d-flex justify-content-center align-items-center">
                        <i class="fa-solid fa-phone"></i>
                        <i class="circle-1"></i>
                    </div>
                </div>
                <div>
                    <a class=" col-lg-6 col-md-6">0352033199</a>
                </div>
            </div>
        </div>
    </div>
</nav>

<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    @include('layout.web.header')
</head>
<body>
<!--start header-->
<header>


</header>
<!--start Navigation-->
<nav class="navbar navbar-expand-lg navbar-light white sticky-top"
     style="padding-bottom: 0; padding-top: 0; display: flex; justify-content: center">
    <div class="flex-center justify-content-between navbar-con-logo pl-3 pr-2 pt-1 pb-1 border-right">
        <img class="mr-3" src="{{asset('/img/logo.svg')}}" style="width: 60px">

        <h3 class=" text-uppercase mb-2 mt-2 font-weight-bold" style="color: #E90808">Real
            Estate
            Gig</h3>
    </div>

    <div class="btn-group" data-toggle="buttons">
        <label class="btn btn-light-blue form-check-label active">
            <input class="form-check-input" type="radio" name="options" id="option1" autocomplete="off" checked>
            Preselected
        </label>
        <label class="btn btn-light-blue form-check-label">
            <input class="form-check-input" type="radio" name="options" id="option2" autocomplete="off"> Radio
        </label>
        <label class="btn btn-light-blue form-check-label">
            <input class="form-check-input" type="radio" name="options" id="option3" autocomplete="off"> Radio
        </label>

    </div>
    </div>
    {{--    <div class="container nav-con" style="padding: 10px; margin: 0">--}}
    {{--        <div class="collapse navbar-collapse">--}}
    {{--            <ul class="navbar-nav align-items-center ms-5 mb-2 mb-lg-0 text-uppercase">--}}
    {{--                <li class="nav-item">--}}
    {{--                    <a class="nav-link" href="#">Trang chủ</a>--}}
    {{--                </li>--}}
    {{--                <li class="nav-item">--}}
    {{--                    <a class="nav-link" href="#">Giới thiệu</a>--}}
    {{--                </li>--}}
    {{--                <li class="nav-item">--}}
    {{--                    <a class="nav-link" href="#">Dịch vụ và báo giá</a>--}}
    {{--                    <ul class="subNav">--}}
    {{--                        <li class="nav-item-sub">--}}
    {{--                            <a class="nav-link" href="#">Dự án</a>--}}
    {{--                        </li>--}}
    {{--                        <li class="nav-item-sub">--}}
    {{--                            <a class="nav-link" href="#">Liên hệ</a>--}}
    {{--                        </li>--}}
    {{--                        <li class="nav-item-sub">--}}
    {{--                            <a class="nav-link" href="#">Bài viết dự án</a>--}}
    {{--                        </li>--}}
    {{--                    </ul>--}}

    {{--                </li>--}}
    {{--                <li class="nav-item">--}}
    {{--                    <a class="nav-link" href="#">Dự án</a>--}}
    {{--                </li>--}}
    {{--                <li class="nav-item">--}}
    {{--                    <a class="nav-link" href="#">Liên hệ</a>--}}
    {{--                </li>--}}
    {{--                <li class="nav-item">--}}
    {{--                    <a class="nav-link" href="#">Bài viết dự án</a>--}}
    {{--                </li>--}}
    {{--                <li class="nav-item">--}}
    {{--                    <a class="nav-link" href="#">Bài viết dịch vụ</a>--}}
    {{--                </li>--}}
    {{--            </ul>--}}
    {{--        </div>--}}

    {{--    </div>--}}

    {{--    <div class="icon-phone"><a class="phone-link text-white" href="#"><i class="fa fa-volume-control-phone"></i></a>--}}
    {{--    </div>--}}
</nav>
<!--end Navigation-->

<!--end header-->


<!--start content-->
@yield('content')

<div id="intro" class="bg-image shadow-1-strong" style="
                                                          background-image: url(https://mdbootstrap.com/img/new/slides/310.jpg);
                                                          height: 500px;
                                                          ">
    <div class="mask text-white" style="background-color: rgba(0, 0, 0, 0.6)">
        <div class="container d-flex align-items-center justify-content-center text-center h-100">

        </div>
    </div>
</div>
<div id="intro" class="bg-image shadow-1-strong" style="
                                                          background-image: url(https://mdbootstrap.com/img/new/slides/310.jpg);
                                                          height: 500px;
                                                          ">
    <div class="mask text-white" style="background-color: rgba(0, 0, 0, 0.6)">
        <div class="container d-flex align-items-center justify-content-center text-center h-100">

        </div>
    </div>
</div>
<div id="intro" class="bg-image shadow-1-strong" style="
                                                          background-image: url(https://mdbootstrap.com/img/new/slides/310.jpg);
                                                          height: 500px;
                                                          ">
    <div class="mask text-white" style="background-color: rgba(0, 0, 0, 0.6)">
        <div class="container d-flex align-items-center justify-content-center text-center h-100">

        </div>
    </div>
</div>


<!--end content-->

<!--start footer-->
<footer class="page-footer font-small pt-2">

    <!-- Footer Links -->
    <div class="container text-center text-md-left" style="max-width: 90%">

        <!-- Footer links -->
        <div class="row text-center text-md-left mt-3 pb-3">

            <!-- Grid column -->
            <div class="col-md-3 col-lg-3 col-xl-4 mx-auto mt-3">
                <div class="row ">
                    <img class="col-auto" src="{{asset('/img/logo.svg')}} ">
                    <h5 class="col-auto  text-uppercase mb-2 mt-2 font-weight-bold" style="color: #E90808">Real
                        Estate
                        Gig</h5>
                </div>
                <p style="color: #656565">Real Estate Gig là đơn vị chuyên thi công thiết kế xây dựng, trang trí nội
                    ngoại thất công trình với nhiều năm kinh nghiệm.</p>
                <!-- Social buttons -->
                <div class="text-center text-md-right">
                    <ul class="list-unstyled list-inline">
                        <li class="list-inline-item">
                            <a class="btn-floating btn-fb mx-1">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a class="hoverable btn-floating btn-email mx-1">
                                <i class="fas fa-envelope"></i>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a class="hoverable btn-floating mx-1">
                                <img class="hoverable mx-1" src="{{asset('/img/icons8-zalo-96.png')}}"
                                     style="width: 40px; margin-top: 4px">
                            </a>

                            {{--                                <i  class="fab fa-google-plus-g"></i>--}}
                        </li>
                    </ul>
                </div>
                <!-- end Social Buttons -->
            </div>
            <!-- Grid column -->

            <hr class="w-100 clearfix d-md-none">

            <!-- Grid column -->
            <div class="col-md-2 col-lg-2 col-xl-3 mx-auto mt-3">
                <h6 class="text-uppercase mb-4 font-weight-bold" style="color: #4A4A4A">Thông tin liên
                    <hệ></hệ>
                </h6>
                <p>
                    <span style="color: #656565">Địa chỉ: 254/5/41 Lê Văn Thọ, P.11, Q. Gò Vấp, TP. HCM</span>
                </p>
                <p>
                    <span style="color: #656565">Số Điện Thoại: 0935 671 886</span>
                </p>
                <p>
                    <span style="color: #656565">Email: RealEstateGig@gmail.com</span>
                </p>
                <p>
                    <span style="color: #656565">Website: RealEstateGig.com</span>
                </p>
            </div>
            <!-- Grid column -->

            <hr class="w-100 clearfix d-md-none">

            <!-- Grid column -->
            <div class="col-md-3 col-lg-2 col-xl-3 mx-auto mt-3">
                <h6 class="text-uppercase mb-4 font-weight-bold" style="color: #4A4A4A">Thông tin dịch vụ</h6>
                <p class="">
                    <a class="f-link" href="#!">Thiết kế, xây dựng nội thất</a>
                </p>
                <p class="">
                    <a class="f-link" href="#!">Xây nhà thô</a>
                </p>
                <p class="">
                    <a class="f-link" href="#!">Xây biệt thự</a>
                </p>
                <p class="">
                    <a class="f-link " href="#!">Xây hầm</a>
                </p>
            </div>

            <!-- Grid column -->
            <hr class="w-100 clearfix d-md-none">

            <!-- Grid column -->

            <!-- Grid column -->

        </div>
        <!-- Footer links -->


    </div>
    <!-- Footer Links -->

</footer>
<!--end footer-->

@include('layout.web.footer')
@yield('script')
</body>
</html>

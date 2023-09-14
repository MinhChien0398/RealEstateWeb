<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    @include('layout.web.header')
</head>
<body>
<!--start header-->

<!--end header-->

<!--start Navigation-->
<nav class="navbar navbar-expand-lg navbar-dark">
    <a class="navbar-brand" href="#"><img class="col-auto" src="{{asset('/img/logo.svg')}} "></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
            aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link text-dark" href="#">Trang chủ
                    <span class="sr-only">(current)</span>
                </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link text-dark" href="#">Giới thiệu</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link  text-dark" id="navbarDropdownMenuLink" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">Dịch vụ & Báo giá</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Xây nhà thô</a>
                    <a class="dropdown-item" href="#">Xây hầm</a>
                    <a class="dropdown-item" href="#">Nội thất</a>
                </div>
            </li>
            {{--project items--}}
            <li class="nav-item dropdown">
                <a class="nav-link  text-dark" id="navbarDropdownMenuLink" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">Dự án</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Chuẩn bị thi công</a>
                    <a class="dropdown-item" href="#">Đang thi công</a>
                    <a class="dropdown-item" href="#">Đã thi công</a>
                </div>
            </li>
            <li>
                <a class="nav-link text-dark" href="#">Liên hệ</a>
            </li>
        </ul>
        <span class="navbar-text text-dark">
        HOTLINE  0347220480
    </span>
    </div>
</nav>
<!--end Navigation-->

<!--start content-->
@yield('content')
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
                    <h5 class="col-auto  text-uppercase mb-2 mt-2 font-weight-bold" style="color: #E90808">Real Estate
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
                            <img class="hoverable mx-1" src="{{asset('/img/snapedit_1694631625483.png')}}"
                                 style="width: 50px">
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
                <h6 class="text-uppercase mb-4 font-weight-bold" style="color: #4A4A4A">
                    Thông tin liên hệ
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
                <p class="f-link">
                    <a class="f-link" href="#!">Thiết kế, xây dựng nội thất</a>
                </p>
                <p class="f-link">
                    <a class="f-link" href="#!">Xây nhà thô</a>
                </p>
                <p class="f-link">
                    <a class="f-link" href="#!">Xây biệt thự</a>
                </p>
                <p class="f-link">
                    <a class="f-link " href="#!">Xây hầm</a>
                </p>
            </div>

            <!-- Grid column -->
            <hr class="w-100 clearfix d-md-none">

            <!-- Grid column -->
            {{--            <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mt-3">--}}
            {{--                <h6 class="text-uppercase mb-4 font-weight-bold">Contact</h6>--}}
            {{--                <p>--}}
            {{--                    <i class="fas fa-home mr-3"></i> New York, NY 10012, US</p>--}}
            {{--                <p>--}}
            {{--                    <i class="fas fa-envelope mr-3"></i> info@gmail.com</p>--}}
            {{--                <p>--}}
            {{--                    <i class="fas fa-phone mr-3"></i> + 01 234 567 88</p>--}}
            {{--                <p>--}}
            {{--                    <i class="fas fa-print mr-3"></i> + 01 234 567 89</p>--}}
            {{--            </div>--}}
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

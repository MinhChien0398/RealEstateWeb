<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    @include('layout.web.header')
</head>
<body>
<!--start header-->

<!--end Navigation-->

<!--end header-->


<!--start content-->
@yield('content')

<!--end content-->

<!--start footer-->
<!--end footer-->

@include('layout.web.footer')
@yield('script')
</body>
</html>

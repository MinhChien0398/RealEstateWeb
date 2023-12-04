<%--
  Created by IntelliJ IDEA.
  User: Clover
  Date: 04/12/2023
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../../../../RealEstateWeb/public/lib/MDB_4_pro/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../../../RealEstateWeb/public/lib/MDB_4_pro/css/mdb.lite.min.css" rel="stylesheet">
    <link href="../../../../RealEstateWeb/public/lib/MDB_4_pro/css/mdb.min.css" rel="stylesheet">
    <link href="../../../../RealEstateWeb/public/lib/MDB_4_pro/css/style.css" rel="stylesheet">
    <link href="../../../../RealEstateWeb/resources/views/template/css/projectPost.css" rel="stylesheet">

    <!--<link href="/lib/fontawesome-free-6.4.2-web/css/fontawesome.min.css" rel="stylesheet"> -->
    <link href="../../../../RealEstateWeb/public/lib/fontawesome-free-6.4.2-web/css/all.min.css" rel="stylesheet">
    <link href="../../../../RealEstateWeb/resources/views/template/css/swiper-bundle.min.css" rel="stylesheet">
    <style>
        .hover-image:before {
            left: -92%;
        }

        .projectCard-content p {
            padding: 0 1.5rem !important;
        }

        .projectCard-container:hover .projectCard-content {
            transform: translateY(-75%);

        }

        .projectCard-container:hover .projectCard-content div div {
            justify-content: center;
        }

        .projectCard-container:hover .projectCard-content p {
            padding: 1.5rem !important;
        }

        .recommend-box img {
            object-fit: cover;
            height: 370px;
            transition: all 0.4s cubic-bezier(0.2, 0.3, 0.8, 0.7);
        }
        .recommend-box button{
            border-radius: 10px;
        }
        .projectCard-container:hover img {
            transform: scale(1.1);
        }

        .projectCard-content {
            top: 75%;
            left: 0;
            height: 100%;
            transition: all .75s ease-in-out;
        }

        .projectCard-content img {
            object-fit: cover;
        }
        .projectCard-content h6{
            font-size: 16px;
        }
        .projectCard-content p{
            font-size: 13px;
        }
        .projectCard-content .projectTitle-center {
            font-size: 18px;
            font-weight: 600;
            margin-bottom: 10px;
        }

        .projectCard-content .projectTitle-center::after {
            content: "";
            display: block;
            width: 65px;
            height: 2px;
            border-bottom: 2px solid #fff;
            margin: 12px auto 0px auto !important;
        }
    </style>
    <title>Title</title>
</head>
<body>

</body>
</html>


    // Add active class to the current button (highlight it)
    var header = document.getElementById("navbarSupportedContent-555");
    var btns = header.getElementsByClassName("nav-menuItem");
    for (var i = 0; i < btns.length; i++) {
    btns[i].addEventListener("click", function() {
        var current = document.getElementById("nav-menuItem-active");
        current.removeAttribute('id');
        this.setAttribute('id', 'nav-menuItem-active');
        var checkingElement=document.getElementById("nav-menuItem-active").parentElement;
    });
}

    // var toggler = document.getElementsByClassName("navbar-toggler");
    // if(toggler[0].getAttribute("aria-expanded").endsWith("true")){
    //
    // }

    // $('carousel').carousel({
    //     interval: 2000
    // })
    // import Swiper from 'https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.mjs'
    // import Swiper from './swiper-bundle.min';
    var swiper = new Swiper(".slide-content", {
        slidesPerView: 3,
        spaceBetween: 30,
        pagination: {
            el: ".swiper-pagination",
            clickable: true,
        },
    });


    var categorylist = document.getElementById("HomeProjectCategory");
    var btns = categorylist.getElementsByClassName("category-item");

    for (var i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function() {
            for (var j = 0; j < btns.length; j++) {
                if(btns[j].classList.contains("active")){
                    btns[j].classList.remove(["active"]);
                }
            }
            this.classList.add(["active"]);
        });
    }

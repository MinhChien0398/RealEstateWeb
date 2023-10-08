let button = document.getElementById("button");
let menu = document.querySelector(".menu-listItem");
button.addEventListener("click", function () {
    if (menu.classList.contains("menu-show")) {
        menu.classList.replace("menu-show", "menu-close")
        return;
    }
    if (menu.classList.contains("menu-close")) {
        menu.classList.replace("menu-close", "menu-show");
        return;
    }
});

$('.toc-list').find('a').click(function (e) {

    e.preventDefault();

    var x = $(this).attr('data-rel');

    goToByScroll(x);


});

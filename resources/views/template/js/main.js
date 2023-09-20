
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

    var toggler = document.getElementsByClassName("navbar-toggler");
    if(toggler[0].getAttribute("aria-expanded").endsWith("true")){

    }
    console.log();

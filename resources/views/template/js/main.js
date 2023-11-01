// Add active class to the current button (highlight it)
let header = document.getElementById("navbarSupportedContent-555");
let btns = header.getElementsByClassName("nav-menuItem");
for (let i = 0; i < btns.length; i++) {
    btns[i].addEventListener("click", function () {
        let current = document.getElementById("nav-menuItem-active");
        current.removeAttribute('id');
        this.setAttribute('id', 'nav-menuItem-active');
    });
}

let swiper = new Swiper(".slide-content", {
    slidesPerView: 3,
    spaceBetween: 30,
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },
});


let categorylist = document.getElementById("HomeProjectCategory");
let categoryBtns = categorylist.getElementsByClassName("category-item");

for (let i = 0; i < categoryBtns.length; i++) {
    categoryBtns[i].addEventListener("click", function () {
        for (let j = 0; j < categoryBtns.length; j++) {
            if (categoryBtns[j].classList.contains("active")) {
                categoryBtns[j].classList.remove(["active"]);
            }
        }
        this.classList.add(["active"]);
    });
}

function myFunction(x) {
    if (x.matches) {
        let drBtns = document.querySelectorAll(".nav-dropdownItem");
        for (let i = 0; i < drBtns.length; i++) {
            drBtns[i].addEventListener("click", function () {
                for (let j = 0; j < drBtns.length; j++) {
                    if (drBtns[j].children[2].classList.contains("d-block")) {
                        drBtns[j].children[2].classList.remove("d-block");
                        if(drBtns[i].body===drBtns[j].body)
                            return;
                    };


                }
                    drBtns[i].children[2].classList.add("d-block");

            });
        }
    }
}

var x = window.matchMedia("(max-width: 992px)")
myFunction(x) // Call listener function at run time


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

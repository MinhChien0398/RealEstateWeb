let swiper = new Swiper(".slide-content", {
    slidesPerView: 3,
    spaceBetween: 30,
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },
});

let items= document.querySelectorAll('.item-selector');

let cur=document.getElementsByClassName('item-selector active')
for (const item of items) {
    item.addEventListener('click',function () {
      for(const i of items){
          if(i!=item){
              i.classList.remove('active')
            document.getElementById(i.getAttribute('type')).classList.remove('active')
          }
      }
      item.classList.add('active')
        document.getElementById(item.getAttribute('type')).classList.add('active')
    })
}

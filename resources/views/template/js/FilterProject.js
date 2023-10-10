var listImgProject = document.getElementById("imageProjects");
var listButton = document.querySelectorAll(".item-selector");
var listProjects = [
    {
        id: 1,
        title: "PHỐI CẢNH AN THIÊN",
        img: "public/img/project-img/screenshot-20230819-165117-8274.png",
        type: "villa", href: "http://localhost/RealEstateWeb/projectPost",
        detail: "Là một không gian làm việc đẳng cấp, tạo môi trường khuyến khích " +
            " sự sáng tạo và đổi mới."
    }, {
        id: 2,
        title: "NHÀ ANH HƯNG GÒ VẤP",
        img: "public/img/project-img/nhaanhchung-4935.jpg",
        type: "villa", href: "http://localhost/RealEstateWeb/projectPost",
        detail: "Nằm trong khu vực có nhiều tiện ích như trường học, " +
            "trung tâm thương mại, nhà hàng và giao thông thuận tiện."
    },
    {
        id: 3,
        title: "NHÀ ANH TIẾN Q.6",
        img: "public/img/project-img/screenshot-20230819-164028-776.png",
        type: "factory", href: "http://localhost/RealEstateWeb/projectPost",
        detail: "Là không gian làm việc độc đáo và đầy sáng tạo, tọa lạc tại trung tâm " +
            "Thành Phố Sài Gòn. Với thiết kế hiện đại, tiện nghi tiên tiến và không gian " +
            "mở, văn phòng này tạo nên môi trường làm việc thú vị và tràn đầy ý tưởng mới."
    },
    {
        id: 4,
        title: "NHÀ CÔ NGHỆ",
        img: "public/img/project-img/screenshot-20230819-164628-3831.png",
        type: "office", href: "http://localhost/RealEstateWeb/projectPost",
        detail: "Nằm trong khu vực có nhiều tiện ích như trường học, " +
            "trung tâm thương mại, nhà hàng và giao thông thuận lợi."
    },
    {
        id: 5,
        title: "NHÀ ANH DƯƠNG",
        img: "public/img/project-img/screenshot-20230819-165318-2198.png",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "townhouse",
        detail: "Khuôn viên của ngôi nhà này không quá rộng nhưng đã được sắp xếp " +
            "hợp lý. Với một khu vực sân trước có thể trồng cây cảnh, và một " +
            "khu vực sân sau làm nơi thư giãn và tiếp khách ngoài trời."
    },
    {
        id: 6,
        title: " BIỆT THỰ CHÂU ÂU",
        img: "public/img/project-img/Mau-thiet-ke-biet-thu-Chau-Au-e1672026132195.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "villa",
        detail: "Thiết kế biệt thự theo phong cách Châu Âu đang " +
            "khá được ưa chuộng hiện nay. Những mẫu biệt thự đẹp theo phong cách Châu Âu thể " +
            "hiện được sự quý tộc, và nguy nga trong từng đường lối thiết kế."
    },
    {
        id: 7,
        title: " BIỆT THỰ PHÁP",
        img: "public/img/project-img/thiet-ke-biet-thu-13-1-e1672026065491.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "villa",
        detail: "Thiết kế kiến trúc của Pháp rất phổ biến ở Châu Âu và nhiều quốc gia trên " +
            "thế giới. Những mẫu biệt thự đẹp theo phong cách kiến trúc Pháp thể hiện vẻ đẹp, sự cố kính ở mọi góc nhìn." +
            " Người nhìn bị choáng ngớp trước sự tráng lệ, nguy nga của những đường nét kiến trúc độc đáo."
    },
    {
        id: 8,
        title: " PHONG CÁCH GẦN GŨI VỚI THIÊN NHIÊN",
        img: "public/img/project-img/thiet-ke-biet-thu-20-1.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "villa",
        detail: "Một ý tưởng độc đáo thiết kế biệt thự đẹp và sang trọng bạn không nên bỏ " +
            "qua đó là tạo không gian sống gần gũi với thiên nhiên. Bạn chỉ cần bố trí một vài bồn hoa mini, chậu cây cảnh nhỏ để phủ xanh ngôi nhà. Cây xanh không chỉ có tác dụng điều hòa không khí " +
            "mà nó còn giúp cho cơ thể bạn cảm thấy thoải mái, giảm stress, mệt mỏi mỗi khi về nhà. "
    },
    {
        id: 9,
        title: "NHÀ PHỐ HIỆN ĐẠI",
        img: "public/img/project-img/thiet-ke-nha-3-3.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "townhouse",
        detail: "Thiết kế nhà phố vẫn luôn là xu hướng được yêu thích nhất trong những năm gần đây bởi vẻ đẹp sang trọng, hiện đại." +
            "Khác với những mẫu nhà đẹp khác, mẫu nhà nhà phố hiện đại trở nên nổi bật hơn nhờ thiết kế phóng khoáng, cởi mở tạo nên nét đặc trưng của loại nhà này. "
    },
    {
        id: 10,
        title: "THIẾT KẾ NHÀ ỐNG",
        img: "public/img/project-img/thiet-ke-nha-5-3.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "townhouse",
        detail: "Xu hướng thiết kế nhà ống vẫn luôn chiếm được cảm tình đông đảo của các gia chủ. Bởi với mẫu nhà đẹp này dù bạn có diện tích" +
            " đất nhỏ đến đâu thì vẫn có thể xây dựng được ngôi nhà mái thái hiện đại, đầy đủ tiện nghi. "
    },
    {
        id: 11,
        title: "THIẾT KẾ NHÀ ỐNG",
        img: "public/img/project-img/thiet-ke-nha-6-3.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "townhouse",
        detail: "Xu hướng thiết kế nhà ống vẫn luôn chiếm được cảm tình đông đảo của các gia chủ. Bởi với mẫu nhà đẹp này dù bạn có diện tích" +
            " đất nhỏ đến đâu thì vẫn có thể xây dựng được ngôi nhà mái thái hiện đại, đầy đủ tiện nghi. "
    },
    {
        id: 12,
        title: "THIẾT KẾ NHÀ MÁI THÁI",
        img: "public/img/project-img/thiet-ke-nha-7-2.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "townhouse",
        detail: "Thiết kế nhà mái thái đang ngày một thịnh hành ở Việt Nam. Mẫu nhà này thường được " +
            "xây dựng trên khu đất có diện tích từ 1000m2 trở lên. Vì thế với các vùng nông thôn " +
            "đất rộng kiểu nhà này được ví như làn gió mới thổi hồn vào nền kiến trúc nông thôn Việt Nam. "
    },
    {
        id: 13,
        title: "THIẾT KẾ NHÀ MÁI THÁI",
        img: "public/img/project-img/thiet-ke-nha-11-2.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "townhouse",
        detail: "Thiết kế nhà mái thái đang ngày một thịnh hành ở Việt Nam. Mẫu nhà này thường được " +
            "xây dựng trên khu đất có diện tích từ 1000m2 trở lên. Vì thế với các vùng nông thôn " +
            "đất rộng kiểu nhà này được ví như làn gió mới thổi hồn vào nền kiến trúc nông thôn Việt Nam. "
    },
    {
        id: 14,
        title: "THIẾT KẾ NHÀ KẾT HỢP KINH DOANH",
        img: "public/img/project-img/thiet-ke-nha-1-3.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "townhouse",
        detail: "Thiết kế nhà ở kết hợp kinh doanh đang là xu hướng nổi bật được xây dựng rất nhiều cho các lô nhà ở có vị trí trung tâm, đông người qua lại." +
            "Đối với xu hướng này, mẫu nhà ở thường được thiết kế từ 2-3 tầng trở lên. Không gian tầng 1 sẽ được tận dụng để kinh doanh bán shop quán áo, quán cafe, không gian tầng 2 trở lên sẽ là diện tích sử dụng phục vụ sinh hoạt của chủ nhà."
    },
    {
        id: 15,
        title: "NHÀ PHỐ HIỆN ĐẠI TẠI HẢI DƯƠNG",
        img: "public/img/project-img/z3904713175018_2c57fb9ac39d925179c2278269912155_1671524950.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "villa",
        detail: "Thiết kế kiến trúc nhà phố này không quá cầu kì, tiết kiệm chi phí nhưng vẫn tạo được điểm nhấn thu hút, tính thẩm mỹ cao. Công trình này đã làm gia chủ vô cùng hài lòng và nhận được sự đánh giá cao của nhiều người."
    },
    {
        id: 16,
        title: "biệt thự 3 tầng tân cổ điển tại Hưng Yên",
        img: "public/img/project-img/z3847844894352_7861e6b4d68f074f93d76fa303b57940_1671166352-1229x1536.jpg",
        href: "http://localhost/RealEstateWeb/projectPost",
        type: "villa",
        detail: "Sự hòa quyện giữa kiến trúc và ánh sáng giúp cho căn biệt thự thêm phần xa hoa, lộng lẫy, nổi bật. Chắc chắn sẽ thu hút tất cả ánh nhìn khi đi qua nó. Đây cũng là lúc để cho gia chủ thể hiện sự đẳng cấp và sang trọng."
    },
];

let projectFilter = listProjects;


listButton.forEach(item => {
    item.addEventListener("click", function () {
        event.preventDefault();
        let type = item.getAttribute("type");
        projectFilter = listProjects.filter(project => {
            if (project.type != type) {
                // console.log(project.type);
                return false;
            }
            return true;
        })
        showList(projectFilter);
    })

});

function showList(projectFilter) {
    listImgProject.innerHTML = "";
    projectFilter.forEach(item => {

        let col = document.createElement("div");
        col.classList.add('col-lg-3', 'col-md-4', 'col-sm-6', 'mb-4',
            'overflow-hidden', 'position-relative', 'projectCard-container');

        let a = document.createElement("a");
        a.classList.add('bg-image', 'position-relative', 'hover-image', 'hover-zoom'
            , 'ripple', 'shadow-1-strong', 'rounded-5', 'w-100', 'd-block');
        a.href = item.href;

        let newImage = new Image();
        newImage.src = item.img;
        newImage.classList.add('w-100');

        let newDiv = document.createElement("div");
        newDiv.classList.add('w-100', 'position-absolute', 'projectCard-content');

        let mask = document.createElement("div");
        mask.classList.add('mask', 'justify-content-center', 'd-flex', 'h-100');
        mask.style.backgroundColor = "rgba(48, 48, 48, 0.72)";

        let newDiv3 = document.createElement("div");
        newDiv3.classList.add('align-items-center', 'flex-column', 'd-flex', 'w-100');

        let h6 = document.createElement("h6");
        h6.innerHTML = item.title;
        h6.classList.add('text-white', 'text-center', 'pt-4', 'projectTitle-center', 'text-uppercase');

        let p = document.createElement("p");
        p.innerHTML = item.detail;
        p.classList.add('text-white', 'p-4');

        newDiv3.appendChild(h6);
        newDiv3.appendChild(p);

        mask.appendChild(newDiv3);

        newDiv.appendChild(mask);

        a.appendChild(newImage);
        a.appendChild(newDiv);

        col.appendChild(a);

        listImgProject.appendChild(col);
    });
}

window.onload = function () {
    listButton[0].click();
}

// ---------------------------------------------------------------------------------------------------------------------

let list = document.getElementById('list');
let filter = document.querySelector('.filter');


let subProductFilter = listProjects;

showProduct(subProductFilter);

filter.addEventListener('submit', function (event) {
    event.preventDefault();
    let valueFilter = event.target.elements;
    subProductFilter = listProjects.filter(item => {
        // check category
        if (valueFilter.category.value !== '') {
            if (item.type !== valueFilter.category.value) {
                return false;
            }
        }
        // // check color
        // if (valueFilter.color.value != '') {
        //     if (!item.nature.color.includes(valueFilter.color.value)) {
        //         return false;
        //     }
        // }
        // // check name
        // if (valueFilter.name.value != '') {
        //     if (!item.name.includes(valueFilter.name.value)) {
        //         return false;
        //     }
        // }
        // // check min price
        // if (valueFilter.minPrice.value != '') {
        //     if (item.price < valueFilter.minPrice.value) {
        //         return false;
        //     }
        // }
        // //  check max price
        // if (valueFilter.maxPrice.value != '') {
        //     if (item.price > valueFilter.maxPrice.value) {
        //         return false;
        //     }
        // }
        return true;
    })
    showProduct(subProductFilter);
})

function showProduct(subProductFilter) {
    // count.innerText = productFilter.length;
    list.innerHTML = '';

    subProductFilter.forEach(item => {
        // let row = document.createElement('div');
        // row.list.add('row');

        // create col
        let col = document.createElement("div");
        col.classList.add('col-lg-3', 'col-md-6', 'mb-4');

        // create bg-image
        let bg = document.createElement("div");
        bg.classList.add('bg-image', 'hover-zoom', 'ripple', 'shadow-1-strong', 'rounded-5', 'bg-img');
        // bg.style.position = "relative";
        // bg.style.overflow = "hidden";
        // bg.style.height = "100%";
        // bg.style.width = "100%";

        // create a
        let a = document.createElement("a");
        a.href = item.href;

        // create hover
        let hover = document.createElement("div");
        hover.classList.add('hover-img', 'position-relative', 'w-100', 'h-100', 'overflow-hidden');
        // hover.style.overflow = "hidden";
        // hover.style.position = "relative";
        // hover.style.width = "100%";
        // hover.style.height = "100%";


        // create image
        let newImage = new Image();
        newImage.src = item.img;
        newImage.classList.add('w-100', 'h-100', 'object-fit-cover', 'transition-0-8s', 'imgProduct');
        // newImage.style.transition = "all 0.8s";
        // newImage.style.width = "100%";
        // newImage.style.height = "100%";
        // newImage.style.objectFit = "cover";


        // create overplay
        let overplay = document.createElement("div");
        overplay.classList.add('overplay');
        // overplay.style.position = "absolute";
        // overplay.style.top = "100%";
        // overplay.style.left = "0";
        // overplay.style.width = "100%";
        // overplay.style.height = "100%";
        // overplay.style.background = "rgba(0, 0, 0, 0.6)";
        // overplay.style.transition = "top 0.5s ease";


        //create text
        let text = document.createElement("div");
        text.classList.add('text');
        // text.style.position = "absolute";
        // text.style.top = "50%";
        // text.style.left = "50%";
        // text.style.transform = "translate(-50%, -50%)";
        // text.style.textAlign = "center";
        // text.style.width = "100%";
        // text.style.color = "white";
        // text.style.transition = "top 0.3s ease";
        // text.style.padding = "20px";
        // text.style.boxSizing = "border-box";
        // text.style.opacity = "0";

        // create h2
        let h2 = document.createElement("h2");
        h2.innerHTML = item.title;
        h2.classList.add('titleProduct');
        // h2.style.fontSize = "20px";
        // h2.style.marginBottom = "10px";
        // h2.style.transform = "translateY(1%)";

        // create p
        let p = document.createElement("p");
        p.innerHTML = item.detail;
        p.classList.add('contentProduct');

        // p.style.fontSize = "14px";


        text.appendChild(h2);
        text.appendChild(p);

        hover.appendChild(newImage);
        overplay.appendChild(text);

        a.appendChild(hover);
        a.appendChild(overplay);

        bg.appendChild(a);
        col.appendChild(bg);
        // row.appendChild(col);

        list.appendChild(col);

    });
}

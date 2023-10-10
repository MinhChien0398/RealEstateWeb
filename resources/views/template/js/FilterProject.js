var listImgProject = document.getElementById("imageProjects");
var listButton = document.querySelectorAll(".item-selector");
var listProjects = [
    {
        id: 1,
        title: "PHỐI CẢNH AN THIÊN",
        img: "public/img/project-img/screenshot-20230819-165117-8274.png",
        type: "villa", href: "#",
        detail: "Là một không gian làm việc đẳng cấp, tạo môi trường khuyến khích " +
            " sự sáng tạo và đổi mới."
    }, {
        id: 2,
        title: "NHÀ ANH HƯNG GÒ VẤP",
        img: "public/img/project-img/nhaanhchung-4935.jpg",
        type: "villa", href: "#",
        detail: "Nằm trong khu vực có nhiều tiện ích như trường học, " +
            "trung tâm thương mại, nhà hàng và giao thông thuận tiện."
    },
    {
        id: 3,
        title: "NHÀ ANH TIẾN Q.6",
        img: "public/img/project-img/screenshot-20230819-164028-776.png",
        type: "factory", href: "#",
        detail: "Là không gian làm việc độc đáo và đầy sáng tạo, tọa lạc tại trung tâm " +
            "Thành Phố Sài Gòn. Với thiết kế hiện đại, tiện nghi tiên tiến và không gian " +
            "mở, văn phòng này tạo nên môi trường làm việc thú vị và tràn đầy ý tưởng mới."
    },
    {
        id: 4,
        title: "NHÀ CÔ NGHỆ",
        img: "public/img/project-img/screenshot-20230819-164628-3831.png",
        type: "office", href: "#",
        detail: "Nằm trong khu vực có nhiều tiện ích như trường học, " +
            "trung tâm thương mại, nhà hàng và giao thông thuận lợi."
    },
    {
        id: 5,
        title: "NHÀ ANH DƯƠNG",
        img: "public/img/project-img/screenshot-20230819-165318-2198.png",
        href: "#",
        type: "townhouse",
        detail: "Khuôn viên của ngôi nhà này không quá rộng nhưng đã được sắp xếp " +
            "hợp lý. Với một khu vực sân trước có thể trồng cây cảnh, và một " +
            "khu vực sân sau làm nơi thư giãn và tiếp khách ngoài trời."
    },
    {
        id: 6,
        title: "NHÀ ANH SANG",
        img: "https://nhaxinh.asia/upload/baiviet/screenshot-20230819-164628-3831.png",
        href: "#",
        type: "townhouse",
        detail: "Khuôn viên của ngôi nhà này không quá rộng nhưng đã được sắp xếp " +
            "hợp lý. Với một khu vực sân trước có thể trồng cây cảnh, và một " +
            "khu vực sân sau làm nơi thư giãn và tiếp khách ngoài trời."
    }
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
        newDiv3.classList.add('justify-content-center', 'align-items-center', 'flex-column', 'd-flex', 'w-100');

        let h6 = document.createElement("h6");
        h6.innerHTML = item.title;
        h6.classList.add('text-white', 'text-center', 'pt-4', 'projectTitle-center');

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

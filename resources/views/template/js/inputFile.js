let fileInput = document.getElementById("inputGroupFile01");
let fileInput1 = document.getElementById("inputGroupFile0");
let imageContainer = document.getElementById("images");
let imageContainer1 = document.getElementById("GroupImage");
let numOfFiles = document.getElementById("num-of-files")    ;
let numOfFiles1 = document.getElementById("num-of-files1");

function preview(){
    imageContainer.innerHTML = "";
    numOfFiles.textContent = `Đã chọn ${fileInput.files.length} `;

    for(i of fileInput.files){
        let reader = new FileReader();
        let figure = document.createElement("figure");
        let figCap = document.createElement("figcaption");
        figCap.innerText = i.name;
        figure.appendChild(figCap);
        reader.onload=()=>{
            let img = document.createElement("img");
            img.setAttribute("src",reader.result);
            console.log(URL.createObjectURL(reader.result));
            figure.insertBefore(img,figCap);
        }
        imageContainer.appendChild(figure);
        reader.readAsDataURL(i);
    }
}
function preview1(){
    imageContainer1.innerHTML = "";
    numOfFiles1.textContent = `Đã chọn ${fileInput1.files.length}`;

    for(i of fileInput1.files){
        let reader = new FileReader();
        let figure = document.createElement("figure");
        let figCap = document.createElement("figcaption");
        figure.classList.add("col-lg-4");
        figure.classList.add("col-md-6");
        figure.classList.add("col-sm-12");
        figure.classList.add("mb-4");
        figCap.innerText = i.name;
        figCap.classList.add('text-center')
        figure.appendChild(figCap);
        reader.onload=()=>{
            let img = document.createElement("img");
            img.setAttribute("src",reader.result);
            img.classList.add("w-100");
            img.classList.add("h-auto");
            figure.insertBefore(img,figCap);
        }
        imageContainer1.appendChild(figure);
        reader.readAsDataURL(i);
    }
}

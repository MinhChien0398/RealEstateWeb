let fileInput = document.getElementById("inputGroupFile01");
let fileInput1 = document.getElementById("inputGroupFile0");
let imageContainer = document.getElementById("images");
let imageContainer1 = document.getElementById("images1");
let numOfFiles = document.getElementById("num-of-files");
let numOfFiles1 = document.getElementById("num-of-files1");

function preview(){
    imageContainer.innerHTML = "";
    numOfFiles.textContent = `${fileInput.files.length} Files Selected`;

    for(i of fileInput.files){
        let reader = new FileReader();
        let figure = document.createElement("figure");
        let figCap = document.createElement("figcaption");
        figCap.innerText = i.name;
        figure.appendChild(figCap);
        reader.onload=()=>{
            let img = document.createElement("img");
            img.setAttribute("src",reader.result);
            figure.insertBefore(img,figCap);
        }
        imageContainer.appendChild(figure);
        reader.readAsDataURL(i);
    }
}
function preview1(){
    imageContainer1.innerHTML = "";
    numOfFiles1.textContent = `${fileInput1.files.length} Files Selected`;

    for(i of fileInput1.files){
        let reader = new FileReader();
        let figure = document.createElement("figure");
        let figCap = document.createElement("figcaption");
        figCap.innerText = i.name;
        figure.appendChild(figCap);
        reader.onload=()=>{
            let img = document.createElement("img");
            img.setAttribute("src",reader.result);
            figure.insertBefore(img,figCap);
        }
        imageContainer1.appendChild(figure);
        reader.readAsDataURL(i);
    }
}

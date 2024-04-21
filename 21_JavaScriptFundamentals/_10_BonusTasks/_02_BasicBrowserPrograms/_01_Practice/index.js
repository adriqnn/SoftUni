console.log(`Hello`);
// window.alert(`This is an alert`);

// let h1 = document.getElementById("myH1");
// let p= document.getElementById("myP");

// h1.textContent = `Hello`;
// p.textContent = `new site`;

let username;

document.getElementById("submit").onclick = function (){
    let title = document.getElementById("text").value;

    document.getElementById("text").textContent = "";
    document.getElementById("myH1/2").textContent = title;
}


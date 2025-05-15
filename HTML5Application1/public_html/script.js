let metodo = document.getElementById("metodo");
let codice = document.getElementById("codice");
let nome = document.getElementById("nome");
let cognome = document.getElementById("cognome");
let mansione = document.getElementById("mansione");
let container = document.getElementById("container");

function sendRequest(event) {
    event.preventDefault();

    let method = metodo.value;
    let code = codice.value;
    let name = nome.value;
    let lastname = cognome.value;
    let job = mansione.value;

    let headers = {"Access-Control-Allow-Origin": "*"};

    let base = {codice: code, nome: name, cognome: lastname, mansione: job};
    let params = JSON.stringify(base);
    if (method === "post") {
        headers = {
            "Access-Control-Allow-Origin": "*",
            "Content-Type": "application/x-www-form-urlencoded"
        };
        params = new URLSearchParams(base);
    }

    if (method === "get" || method === "delete") {
        fetch("http://localhost:8000/?codice=" + code, {
            method: method,
            headers: headers
        }).then(response => {
            return response.json();
        }).then(json => {
            let obj = JSON.parse(json);
            let keys = Object.keys(obj);
            let values = Object.values(obj);
            let str = "<table><tr>";

            keys.forEach(element => {
                str += `<td>${element}</td>`;
            });

            str += "</tr><tr>";

            values.forEach(element => {
                str += `<td>${element}</td>`;
            });

            container.innerHTML = str + "</tr></table>";
        });
    } else {
        fetch("http://localhost:8000/", {
            method: method,
            headers: headers,
            body: params
        }).then(response => {
            return response.json();
        }).then(json => {
            let obj = JSON.parse(json);
            let keys = Object.keys(obj);
            let values = Object.values(obj);
            let str = "<table><tr>";

            keys.forEach(element => {
                str += `<td>${element}</td>`;
            });

            str += "</tr><tr>";

            values.forEach(element => {
                str += `<td>${element}</td>`;
            });

            container.innerHTML = str + "</tr></table>";
        });
    }

}

function methodChanged() {
    if (metodo.value === "get" || metodo.value === "delete") {
        codice.disabled = false;
        nome.disabled = true;
        cognome.disabled = true;
        mansione.disabled = true;
    } else if (metodo.value === "post" || metodo.value === "put") {
        codice.disabled = false;
        nome.disabled = false;
        cognome.disabled = false;
        mansione.disabled = false;
    }
}
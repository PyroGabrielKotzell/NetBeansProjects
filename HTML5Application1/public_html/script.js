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

    let headers = {};

    let base = {codice: code, nome: name, cognome: lastname, mansione: job};
    let params = JSON.stringify(base);
    if (method === "post") {
        headers = {
            "Content-Type": "application/x-www-form-urlencoded"
        };
        params = new URLSearchParams(base);
    }

    let str = "<table>";
    if (method === "get" || method === "delete") {
        fetch("http://localhost:8000/?codice=" + code, {
            method: method,
            headers: headers
        }).then(response => {
            return response.json();
        }).then(json => {
            if (code !== "") {
                let keys = Object.keys(json);
                str += printKeys(keys, str);
                str += printCon(json, str);
            } else {
                let stato = json.stato;
                delete json.stato;
                let keys = Object.keys(json[0]);
                let values = Object.values(json);

                keys.push("stato");
                values[values.length - 1].stato = stato;

                str += printKeys(keys);
                values.forEach(element => {
                    str += printCon(element);
                });
            }

            str += "</table>";
            container.innerHTML = str;
        });
    } else {
        fetch("http://localhost:8000/", {
            method: method,
            headers: headers,
            body: params
        }).then(response => {
            return response.json();
        }).then(json => {
            let keys = Object.keys(json);
            str += printKeys(keys, str);
            str += printCon(json, str);
            str += "</table>";
            container.innerHTML = str;
        });
    }
}

function printKeys(json) {
    let keys = Object.values(json);
    let str = "<tr>";

    keys.forEach(element => {
        str += `<td>${element}</td>`;
    });

    return str += "</tr>";
}

function printCon(json) {
    let values = Object.values(json);
    let str = "<tr>";

    values.forEach(element => {
        str += `<td>${element}</td>`;
    });

    return str += "</tr>";
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
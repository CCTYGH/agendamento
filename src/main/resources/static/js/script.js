function buscarCep() {

    let cep = document.getElementById("cep").value.replace(/\D/g, "");

    if (cep === "") {
        alert("Digite um CEP.");
        return;
    }

    let validaCep = /^[0-9]{8}$/;

    if (!validaCep.test(cep)) {
        alert("CEP inválido! Use 8 números.");
        return;
    }

    document.getElementById("logradouro").value = "...";
    document.getElementById("bairro").value = "...";
    document.getElementById("estadoCidade").value = "...";

    fetch(`https://viacep.com.br/ws/${cep}/json/`)
        .then(response => response.json())
        .then(dados => {

            if (dados.erro) {
                alert("CEP não encontrado.");
                limparCampos();
                return;
            }

            document.getElementById("logradouro").value = dados.logradouro;
            document.getElementById("bairro").value = dados.bairro;


            document.getElementById("estadoCidade").value = `${dados.localidade} - ${dados.uf}`;
        })
        .catch(error => {
            alert("Erro ao buscar CEP.");
            limparCampos();
        });

}

function limparCampos() {
    document.getElementById("logradouro").value = "";
    document.getElementById("bairro").value = "";
    document.getElementById("estadoCidade").value = "";
}

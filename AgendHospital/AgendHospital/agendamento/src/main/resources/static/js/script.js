 function buscarCep() {
        var cep = document.getElementById("cep").value;
        var url = "https://viacep.com.br/ws/" + cep + "/json/";

        if (cep.length !== 8) {
            alert("Por favor, insira um CEP válido.");
            return;
        }

        fetch(url)
            .then(response => response.json())
            .then(data => {
                if (!data.erro) {
                    document.getElementById("logradouro").value = data.logradouro;
                    document.getElementById("bairro").value = data.bairro;
                    document.getElementById("estadoCidade").value = data.localidade + " - " + data.uf;
                } else {
                    alert("CEP não encontrado.");
                }
            })
            .catch(error => {
                console.error("Erro ao buscar o CEP:", error);
            });
        }
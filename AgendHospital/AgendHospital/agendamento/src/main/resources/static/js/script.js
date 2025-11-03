function buscarCep() {
let cep   = document.getElementById('cep').value
let url   = `https://viacep.com.br/ws/${cep}/json/`

if (cep.length != 8) {
    alert("CEP inválido! Deve conter 8 dígitos.")
    return
}
}


function getDataAtual() {
    const agora = new Date();

    const ano = agora.getFullYear();
    const mes = String(agora.getMonth() + 1).padStart(2, '0');
    const dia = String(agora.getDate()).padStart(2, '0');
    const hora = String(agora.getHours()).padStart(2, '0');
    const minuto = String(agora.getMinutes()).padStart(2, '0');


    return `${ano}-${mes}-${dia}T${hora}:${minuto}`;
}

document.addEventListener("DOMContentLoaded", function () {
    const inputData = document.getElementById("datahoraConsulta");
    inputData.min = getDataAtual();
});

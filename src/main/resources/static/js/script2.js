
const telefone = document.getElementById('telefone');

telefone.addEventListener('input', function(e) {
  let valor = e.target.value.replace(/\D/g, '');

if (valor.length > 11){
  valor = valor.slice(0,11);
}


  valor = valor.replace(/^(\d{2})(\d)/g, '($1) $2');
  valor = valor.replace(/(\d{5})(\d)/, '$1-$2');
  e.target.value = valor;
});

const cpf = document.getElementById('cpf');

cpf.addEventListener('input', function(e) {
    let valor = e.target.value.replace(/\D/g, '');


    if (valor.length >11){
        valor = valor.slice(0,11);
    }

    valor = valor.replace(/^(\d{3})(\d)/, '$1.$2');     
    valor = valor.replace(/^(\d{3})\.(\d{3})(\d)/, '$1.$2.$3'); 
    valor = valor.replace(/^(\d{3})\.(\d{3})\.(\d{3})(\d{1,2})$/, '$1.$2.$3-$4');
    e.target.value = valor;

});

const cep = document.getElementById('cep');

cep.addEventListener('input', function(e) {
let valor = e.target.value.replace(/\D/g, '');

if(valor.length > 8) {
    valor = valor.slice(0,8);
}

valor = valor.replace(/^(\d{5})(\d)/, '$1-$2');     
e.target.value = valor;

});

const numero = document.getElementById('numero');

numero.addEventListener('input', function(e) {
let valor = e.target.value.replace(/\D/g, '');


if (valor.length > 6) {
    valor = valor.slice(0,6);
}
e.target.value = valor;
});

const form = document.querySelector('form');

const calcular = () => {
    //declaração de variáveis locais
    let x =document.querySelector('#valorx').value;
    let y =document.querySelector('#valory').value;
    let operador = document.querySelector('#operacao').value;
    let result = 0;

    //verifica a operação selecionada
    switch(operador){
        case 'soma':
            result = Number(x) + Number(y);
            document.querySelector('#resultado').innerHTML = result;
            break;
        }

}

form.addEventListener('submit', function(event){
    event.preventDefault();
    calcular();
});
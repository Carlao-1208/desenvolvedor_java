const form = document.querySelector('form');

const calcularImc = (peso, altura) => {
    let imc = peso/(altura*altura);
    result = (imc < 18.5) ? "abaixo do peso" :
    (imc < 25) ? "peso normal" :
    (imc < 30) ? "acima do peso" :
    (imc < 35) ? "obeso" :
    (imc < 40) ? "obesidade nível 2" : "obesidade mórbida";

    return `Seu IMC é ${imc.toFixed(2)}, estando assim, ${result}.`;
}

const exibirInfo = () => {
    // declaração de variáveis locais
    let nome = document.querySelector('#nome').value;
    let nascimento = document.querySelector('#nascimento').value;
    let genero = document.querySelector('#genero').value;
    let email = document.querySelector('#email').value;
    let telefone = document.querySelector('#telefone').value;
    let peso = document.querySelector('#peso').value.replace(",",".");
    let altura = document.querySelector('#altura').value.replace(",",".");

    // saída de dados
    document.querySelector('#nomeResult').innerHTML = `Nome: ${nome}`;
    document.querySelector('#nascimentoResult').innerHTML = `Data de nascimento: ${nascimento}`;
    document.querySelector('#generoResult').innerHTML = `Gênero: ${genero}`;
    document.querySelector('#emailResult').innerHTML = `E-mail: ${email}`;
    document.querySelector('#telefoneResult').innerHTML = `Telefone: ${telefone}`;
    document.querySelector('#pesoResult').innerHTML = `Peso: ${peso} kg`;
    document.querySelector('#alturaResult').innerHTML = `Altura: ${altura} m`;
    document.querySelector('#imcResult').innerHTML = calcularImc(peso, altura);
}

// evento
form.addEventListener('submit', function(event) {
    event.preventDefault();
    exibirInfo();
})
const form = document.querySelector('form');

const exibirInfo = () => {
    // declaração de variáveis locais
    let nome = document.querySelector('#nome').value;
    let email = document.querySelector('#email').value;
    let nascimento = document.querySelector('#nascimento').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let endereco = document.querySelector('#endereco').value;

    // saída de dados
    document.querySelector('#nomeResult').innerHTML = `<br>${nome}<br><br>`;
    document.querySelector('#emailResult').innerHTML = `<b>E-mail:</b> ${email}<br>`;
    document.querySelector('#nascimentoResult').innerHTML = `<b>Data de Nascimento:</b> ${nascimento}<br>`;
    document.querySelector('#cpfResult').innerHTML = `<b>CPF:</b> ${cpf}<br>`;
    document.querySelector('#telefoneResult').innerHTML = `<b>Telefone:</b> ${telefone}<br>`;
    document.querySelector('#cepResult').innerHTML = `<b>CEP:</b> ${cep}`;
    document.querySelector('#enderecoResult').innerHTML = `<b>Endereço:</b> ${endereco}<br>`;

    // apaga os dados de todo o formulário
    form.reset();
}

// TODO: criar funções de máscara de entrada para cep, cpf, telefone e data

form.addEventListener('submit', function(event) {
    event.preventDefault();
    exibirInfo();
});
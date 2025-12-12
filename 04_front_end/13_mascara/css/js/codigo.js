const form = document.querySelector("form");
const exibirInfo = () => {
    //declaração de variáveis
    let nome = document.querySelector('#nome').value;
    let email = document.querySelector('#email').value;
    let nascimento = document.querySelector('#nascimento').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let endereco = document.querySelector('#endereco').value;

    //saída de dados
    Document.querySelector(#nomeResult).innerHTML =  <b>nome:</b> ${nome};
    Document.querySelector(#emailResult).innerHTML =  '<b>email:</b> ${email}';
    Document.querySelector(#nascimentoResult).innerHTML =  '<b>data de nascimento:</b> ${nascimento}';
    Document.querySelector(#cpfResult).innerHTML =  '<b>cpf:</b> ${cpf}';
    Document.querySelector(#telefoneResult).innerHTML =  '<b>telefone:</b> ${telefone}';
    Document.querySelector(#cepResult).innerHTML =  '<b>cep:</b> ${cep};' 
}
form.addEventListener('submit',function(event){
    event.preventDefault();
})
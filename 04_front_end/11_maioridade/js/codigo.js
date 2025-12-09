const form = document.querySelector('form');

//função para caulcular a maioridade
const maioridade = () => {
    //declaração de variáveis locais
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;
    const result =(idade >= 18) ? 'maior de idade' : 'menor de idade';

    //saída de dados
    document.querySelector('#idresult').innerHTML = `${nome} é ${result}.`;

    //limpar os campos
    document.querySelector('#nome').value = '';
    document.querySelector('#idade').value = '';
}

//evento
form.addEventListener('submit',function(event){
    event.preventDefault();
    maioridade();
});
//declaração de variáveis
const form = document.querySelector("form");

form.addEventListener("submit", function (event) {
// desatuva osubmit
    event.preventDefault();

    //declaração de variáveis locais
    let texto = document.queryselector("#texto").value;

    //exibe texto em forma de caixa de diálogo
    alert(texto);
});
import java.time.LocalDate;

public class Usuario {

    private long idUsuario;
    private String nome;
    private LocalDate dataNascimento;
    protected String email;

    public Usuario(long idUsuario, String nome, LocalDate dataNascimento, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public Usuario(long idPessoa, String email2, String telefone) {
        //TODO Auto-generated constructor stub
    }

    public String fazerLogin(String login, String senha) {

        if (login.equals(this.email) && senha.equals("1234")) {
            return "Login realizado com sucesso";
        } else {
            return "Login ou senha incorretos";
        }
    }

    public void exibirDados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirDados'");
    }
}
import java.time.LocalDate;

public class Usuario {

    private long idUsuario;
    private String nome;
    private LocalDate dataNascimento;
    private String email;

    public Usuario(long idUsuario, String nome, LocalDate dataNascimento, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String fazerLogin(String login, String senha) {

        if (login.equals(this.email) && senha.equals("1234")) {
            return "Login realizado com sucesso";
        } else {
            return "Login ou senha incorretos";
        }
    }
}
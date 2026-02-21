

public class PessoaFisica extends Usuario {

    private String nome;
    private String dataNascimento;
    private String cpf;

    public PessoaFisica(long idPessoa, String email, String telefone,
                        String nome, String fantasia, String cpf) {
        super(idPessoa, email, telefone);
        this.nome = nome;
        this.dataNascimento = fantasia;
        this.cpf = cpf;
    }

   /// public PessoaFisica(long id, String email, String telefone, String razao, String fantasia, String cnpj) {
        //TODO Auto-generated constructor stub
   // }

   // public PessoaFisica(long id, String email, String telefone, String nome2, LocalDate data, String cpf2) {
		//TODO Auto-generated constructor stub
	//}

	@Override
    public void exibirDados() {
        System.out.println("----- Pessoa Física -----");
        String idPessoa = null;
        System.out.println("ID: " + idPessoa);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
        String telefone = null;
        System.out.println("Telefone: " + telefone);
        System.out.println("-------------------------");
    }
}
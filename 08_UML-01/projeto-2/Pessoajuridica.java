public class Pessoajuridica extends Usuario {

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    public Pessoajuridica(long idPessoa, String email, String telefone,
                          String razaoSocial, String nomeFantasia, String cnpj) {
        super(idPessoa, email, telefone);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados() {
        System.out.println("----- Pessoa Jurídica -----");
        String idPessoa = null;
        System.out.println("ID: " + idPessoa);
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Email: " + email);
        String telefone = null;
        System.out.println("Telefone: " + telefone);
        System.out.println("---------------------------");
    }
}
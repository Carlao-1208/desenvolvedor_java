public abstract class Usuario2 {

    protected long idPessoa;
    protected String email;
    protected String telefone;

    public Usuario2(long idPessoa, String email, String telefone) {
        this.idPessoa = idPessoa;
        this.email = email;
        this.telefone = telefone;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    // Método abstrato obrigatório
    public abstract void exibirDados();

    // ✅ Método padrão de sucesso no cadastro
    public void mensagemSucesso() {
        System.out.println("✅ Usuário ID " + idPessoa + " cadastrado com sucesso!");
    }
}
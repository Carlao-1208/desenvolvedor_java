import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main22 {

    static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n==== SISTEMA DE CADASTRO ====");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Listar Usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();



           // switch (opcao) {
             //   case 1 -> cadastrarPessoaFisica();
               // case 2 -> cadastrarPessoaJuridica();
                //case 3 -> listarUsuarios();
                //case 0 -> System.out.println("Encerrando...");
                //default -> System.out.println("Opção inválida!");
            //}

        } while (opcao != 0);
    }

    private static void cadastrarPessoaFisica() {

        System.out.print("ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data nascimento (AAAA-MM-DD): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

      //  PessoaFisica pf = new PessoaFisica(id, email, telefone, nome, data, cpf);
       // listaUsuarios.add(pf);

        // ✅ Mensagem de sucesso padronizada
       // pf.mensagemSucesso();
    }

    private static void cadastrarPessoaJuridica() {

        System.out.print("ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Razão Social: ");
        String razao = scanner.nextLine();

        System.out.print("Nome Fantasia: ");
        String fantasia = scanner.nextLine();

        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        var pj = new PessoaFisica(id, email, telefone, razao, fantasia, cnpj);
        listaUsuarios.add(pj);

        // ✅ Mensagem de sucesso padronizada
       // pj.mensagemSucesso();
   // }

   // private static void listarUsuarios() {
       // if (listaUsuarios.isEmpty()) {
        //    System.out.println("Nenhum usuário cadastrado.");
        //} else {
          //  for (Usuario u : listaUsuarios) {
              //  u.exibirDados();
            //}
        }

    @Override
    public String toString() {
        return "Main22 []";
    }
    }
//}
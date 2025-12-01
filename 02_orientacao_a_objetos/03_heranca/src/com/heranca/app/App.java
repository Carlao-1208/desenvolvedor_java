package com.heranca.app;

//classe java importada
import java.util.Scanner;

//classe criadas por mim
import com.heranca.models.PessoaJuridica;
import com.heranca.models.PessoaFisica;
public class App {
    public static void main(String[] args) throws Exception {
        //instancias
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(
            null,
            null,
            0
            );
            PessoaJuridica corp = new PessoaJuridica(
                null,
                null,
                null,
                null,
                null
             );

             //Entrada de dados
             System.out.println("Informe os dados do usuário:"\n);
             dados
             System.out.println("INforme o nome:");
             System.out.println("");
             usuario.nome = leia.nextLine();
             System.out.println("onforme o CPF:");
             usuario.cpf = leia.nextLine();
             System.out.println("Informe o email");
             usuario.email = leia nextLine();
             System.out.println("informe o telefone");
             usuario.telefone = leia.nexLine();
             System.out.print("informe a idade:");
             usuario.idade = leia.nextLine();

             //Limpeza de buffer
             leia.nextLine();

             //entrada de dados  da empresa
             System.out.println("\nInforme os dados da empesa:\n");
             System.out.println("Informe o nome da empresa:");
             corp.nomeFantasia = nextLine();
             System.out.println("\ninforme a razão social da empresa:\n");
             corp.razaoSocial = nextLine();
             System.out.println("\Informe o cnpj :\n");
             corp.cnpj = nextLine();
             System.out.println("\nInforme o e-mail:\n");
             corp.email = nextLine();
             System.out.println("\ninforme o telefone da empresa:\n");
             corp.telefone = nextLine();

             //saída de dados
             System.out.println("\nDados do usuário:\n");
             usuario.exibirDados();
             System.out.println("\n dadis da enoresa:\n");
             corp.exibirDados();




        //fecha objeto leia
        leia.close();

    }
}

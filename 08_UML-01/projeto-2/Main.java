import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario(
                1L,
                "Carlos",
                LocalDate.of(2000, 5, 10),
                "carlos@email.com"
        );

        System.out.println("=== LOGIN ===");

        System.out.print("Digite o login (email): ");
        String login = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        String resultado = usuario.fazerLogin(login, senha);

        System.out.println(resultado);

        scanner.close();
    }
}
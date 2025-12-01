package loop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //instacia o Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variaveis
        double x;
        double y;
        double resultado = 0.0;
        
        String operacao;

        //fixme: loop
        do{
            //menu
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multipicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto da divisão");
            System.out.println("6 - Potência");
            System.out.println("7 - Sair do programa");
            System.out.println("informe a opção desejada:");
            operacao = leia.nextLine();

            if(!operacao.equals("7")){
                //Entrada de dados
                System.out.println("Informe o valor de x:");
                x = leia.nextDouble();
                System.out.println("Informe o valor de y:");
                y = leia.nextDouble();

                leia.nextLine();

                switch (operacao) {
                    case "1":
                        resultado = x+y;
                        break;
                    case "2":
                        resultado = x-y;
                        break;

                    case "3":
                        resultado = x*y;
                        break;

                    case"4":
                        resultado = x/y;
                        break;
                    case"5":
                        resultado = x%y;
                        break;
                    case"6":
                        resultado = Math.pow(x,y);
                        break;
                        
                    default:
                    System.out.println("operador inválido");    
                    
                
            }
            //mostra o resultado
            System.out.println(" Resultado:" + resultado);
        }
            
        } while(!operacao.equals("7"));



        //fecha objeto leia
        leia.close();
        
    }
}

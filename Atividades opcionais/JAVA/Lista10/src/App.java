
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        do {
            Operacoes op = new Operacoes();
            int opcao;
            op.exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:// Lógica para soma
                    int num1, num2;
                    System.out.print("Digite o primeiro número: ");
                    num1 = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = sc.nextInt();
                    op.soma(num1,num2);
                    break;
                case 2:// Lógica para verificar paridade
                    num1 = 0;
                    System.out.print("Digite um número: ");
                    num1 = sc.nextInt();
                    op.verificaPar(num1);
                    break;
                case 3:// Lógica para calcular fatorial
                    num1 = 0;
                    System.out.print("Digite um número: ");
                    num1 = sc.nextInt();
                    op.fatorial(num1);
                    break;
                case 4:// Lógica para inverter string
                    break;
                case 5:
                    // Lógica para calcular média
                    break;
                case 6:
                    // Lógica para contar vogais
                    break;
                case 7:
                    // Lógica para encontrar maior número
                    break;
                case 8:
                    // Lógica para verificar número primo
                    break;
                case 9:
                    // Lógica para converter Celsius para Fahrenheit
                    break;
                case 10:
                    // Lógica para calcular potência
                    break;
                case 11:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 11);
        // Fechando o scanner
        sc.close();
    }
}

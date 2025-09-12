
/* 4.	Comparação de Três Números:○	Peça ao usuário três números inteiros e determine qual é o maior usando */
import java.util.Scanner;

public class Ex4RecebaMaior {
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner sc = new Scanner(System.in);
        // Declarando variaveis
        int num1, num2, num3;
        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        num3 = sc.nextInt();
        // Usando if/else para determinar o maior número
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
        // Fechando instancia do scanner
        sc.close();
    }
}
/*
○	Escreva um programa que peça ao usuário uma nota entre 0 e 100. Se a nota for maior ou igual a 90, exiba "A"; 
se for entre 80 e 89, exiba "B"; entre 70 e 79, exiba "C"; entre 60 e 69, exiba "D"; e abaixo de 60, exiba "F".
*/
import java.util.Scanner;

public class Ex5ClassificaNota {
    public static void main(String[] args) {
        // Declarando variaveis
        int nota;
        // Instanciando a classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota entre 0 e 100:");
        nota = sc.nextInt();
        // Usando if/else para determinar a classificação da nota
        if (nota >= 90 && nota <= 100) {
            System.out.println("Sua nota é A");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("Sua nota é B");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("Sua nota é C");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("Sua nota é D");
        } else if (nota >= 0 && nota < 60) {
            System.out.println("Sua nota é F");
        } else {
            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 100.");
        }
        // Fechando instancia do scanner
        sc.close();
    }
}

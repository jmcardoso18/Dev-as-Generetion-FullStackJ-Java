/*○	Escreva um programa que peça um número de 1 a 7 e 
use switch-case para exibir o dia da semana correspondente (1 para Domingo, 2 para Segunda, etc.). */
import java.util.Scanner;

public class Ex7DiaSemana {
    public static void main(String[] args) {
        // Declarando variaveis
        int dia;
        // Instanciando a classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 7 para saber o dia da semana correspondente:");
        dia = sc.nextInt();
        // Usando switch-case para determinar o dia da semana
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Por favor, insira um número entre 1 e 7.");
                break;
        }
        // Fechando instancia do scanner
        sc.close();
    }
}
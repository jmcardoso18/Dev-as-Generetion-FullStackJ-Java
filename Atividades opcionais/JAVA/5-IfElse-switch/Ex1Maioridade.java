/*
Escreva um programa que peça ao usuário para digitar sua idade. Se a idade for 18 ou mais,
o programa deve exibir "Você é maior de idade". Caso contrário, exiba "Você é menor de idade".
*/
import java.util.Scanner;

public class Ex1Maioridade{
public static void main(String[] args) {
    //Declarando variáveis
    int idade;
    //Recebendo informação do usuário
    System.out.println("Qual sua idade?");
    //Instanciando a classe de scanner
    Scanner sc = new Scanner(System.in);
    idade = sc.nextInt();
    //Usando if/else para determinar maioridade e imprimindo resultado
    if (idade>=18) {
        System.out.println("Você tem "+idade+" anos e é maior de idade.");
    }else{
        System.out.println("Você tem "+idade+" anos e é menor de idade.");
    } 
    //Fechando a classe scanner
    sc.close();
}
}


/*
Crie um programa que solicite ao usuário sua idade e se ele é cidadão.
 Se ele for maior de 18 anos e cidadão, o programa deve informar que ele pode votar; 
 caso contrário, indique que ele não pode votar.*/
import java.util.Scanner;

public class Ex3Voto {
    public static void main(String[] args) {
        // Declarando variáveis
        int idade, cidadao;
        // Instanciando a classe de scanner
        Scanner sc = new Scanner(System.in);
        // Recebendo informação do usuário
        System.out.println("Qual sua idade?");
        idade = sc.nextInt();
        System.out.println("Você é cidadão?\n1-Sim\n2-Não");
        cidadao = sc.nextInt();
        // Usando if/else para determinar maioridade e imprimindo resultado
        if (idade >= 18 && cidadao == 1) {
            System.out.println("Você tem " + idade + " anos, é um cidadão. Pode votar.");
        } else if (cidadao == 1 && idade < 18) {
            System.out.println("Você tem " + idade + " anos,15 é cidadão mas não pode votar por ser menor de idade.");
        } else {
            System.out.println("Você tem " + idade + " anos, não é um cidadão, portanto não pode votar.");
        }
        // Fechando a classe scanner
        sc.close();
    }
}

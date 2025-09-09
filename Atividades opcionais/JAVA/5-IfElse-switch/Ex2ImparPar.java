/*
 Peça ao usuário que insira um número inteiro e use if-else para determinar se o número é par ou ímpar
 */

import java.util.Scanner;

public class Ex2ImparPar {
public static void main(String[] args) {
    //Instânciando classe scanner
    Scanner sc = new Scanner(System.in);
    //Declarando a variável
    int numero;
    System.out.println("Digite um numero");
    numero=sc.nextInt();
    if(numero%2==0){
        System.out.println(numero+" é um número par!!");
    }else{
        System.out.println(numero+" é um número impar!!");
    }

    //fechando classe scanner
    sc.close();
    
}
    
}
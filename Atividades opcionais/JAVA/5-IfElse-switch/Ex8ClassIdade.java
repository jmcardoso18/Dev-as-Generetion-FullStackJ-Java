import java.util.Scanner;

public class Ex8ClassIdade {
    public static void main(String[] args) {
        // Declarando variaveis
        int idade;
        // Instanciando a classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        if(idade < 0){
            System.out.println("Idade inválida.");
            sc.close();
            return;
        }else if(idade <= 12){
            idade = 0; // Criança
        }else if(idade <= 17){
            idade = 1; // Adolescente
        }else if(idade <= 59){
            idade = 2; // Adulto
        }else{
            idade = 3; // Idoso
        }

        // Usando switch-case para determinar a categoria de idade
        switch (idade) {
            case 0:
                System.out.println("Criança");
                break;
            case 1:
                System.out.println("Adolescente");
                break;
            case 2:
                System.out.println("Adulto");
                break;
            case 3: 
                System.out.println("Idoso");
                break;
            default:
                break;
        }
        // Fechando instancia do scanner
        sc.close();
    }
}
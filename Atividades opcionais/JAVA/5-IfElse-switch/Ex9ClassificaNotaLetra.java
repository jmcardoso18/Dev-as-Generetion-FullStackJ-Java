import java.util.Scanner;

public class Ex9ClassificaNotaLetra {

    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner sc = new Scanner(System.in);    
        // Declarando variaveis
        char nota;
        System.out.println("Digite uma nota entre A e F:");
        nota = sc.next().toUpperCase().charAt(0);   
        // Usando switch-case para determinar a classificação da nota
        switch (nota) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Médio");
                break;
            case 'D':
                System.out.println("Ruim");
                break;
            case 'E':
                System.out.println("Insuficiente");
                break;
            case 'F':
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Nota inválida.");
                break;
        }
    
        // Fechando instancia do scanner
        sc.close();
    }
}
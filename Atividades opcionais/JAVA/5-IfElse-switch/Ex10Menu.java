import java.util.Scanner;

public class Ex10Menu {
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner sc = new Scanner(System.in);
        // Declarando variaveis
        int escolha;
        
        // Exibindo o menu
        System.out.println("Menu de curiosidade sobre mim:");
        System.out.println("1. Uma sobremesa favorita");
        System.out.println("2. Uma cor favorita");
        System.out.println("3. Uma curiosidade sobre mim");
        System.out.println("4. Um hobby favorito");
        System.out.println("Escolha uma opção (1-4):");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Minha sobremesa favorita é pudim de leite.");
                break;
            case 2:
                System.out.println("Minha cor favorita é roxo.");
                break;
            case 3:
                System.out.println("Uma curiosidade sobre mim... A primeira vez que voei de avião não pousei nele.");
                break;
            case 4:
                System.out.println("Meu hobby favorito é jogar jogos de tabuleiro.");    
                break;
            default:
                break;
        }
        // Fechando instancia do scanner
        sc.close();
    }
}

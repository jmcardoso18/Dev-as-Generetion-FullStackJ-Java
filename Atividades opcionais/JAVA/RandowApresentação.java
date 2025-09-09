
//Importando biblioteca para classe random
import java.util.Random;

public class RandowApresentação {
    public static void main(String[] args) {
        // Declarando variaveis
        int[] numeros = new int[36];
        int i = 0, z = 0, j, aleatorio;
        // Atribuindo os nomes
        String[] nome = new String[36];
        nome[0] = "Alessandra Benedito da Silva";
        nome[1] = "Aline Romanini da Silva";
        nome[2] = "Ana Lemos";
        nome[3] = "Andressa Funes";
        nome[4] = "Bianca Maria da Silva";
        nome[5] = "Carina Bentlin";
        nome[6] = "Cintia Dourado";
        nome[7] = "Claudia Cleto";
        nome[8] = "Cristina Martins Coelho";
        nome[9] = "Geisielly Vasques da Silva";
        nome[10] = "Geovana Cazali";
        nome[11] = "Jamila Cardosoa";
        nome[12] = "Jessica Ghirardelli Tinguely";
        nome[13] = "Jessica Talman (possível desistência)";
        nome[14] = "Laís Bigotto";
        nome[15] = "Lauren Fogaça";
        nome[16] = "Leticia Fernandes Camargo de Campos";
        nome[17] = "Luana Borghetti Vicaria";
        nome[18] = "Marcia Condarco";
        nome[19] = "Maria Medeiros";
        nome[20] = "Milena Svitras";
        nome[21] = "Myriam Liston Ferreira Perdiza";
        nome[22] = "Nádia Piccinin Caricatto";
        nome[23] = "Nayara Kiyota Prado";
        nome[24] = "Nicolly Jesus";
        nome[25] = "Patricia Eliseu";
        nome[26] = "Priscila Alves Lins Mrozinski";
        nome[27] = "Queren Alves";
        nome[28] = "Rafaela Imiani";
        nome[29] = "Rafaela Lemes";
        nome[30] = "Rayssa Costa Rezende Ferraz";
        nome[31] = "Sofia Gomes";
        nome[32] = "Stefanie Glória da Silva";
        nome[33] = "Stella Watson Manhães de Andrade Brum";
        nome[34] = "Thalita da Silva Lima";
        nome[35] = "Thuany Aline da Silva";

        // Instânciando classe randomico
        Random r = new Random();
        // Usando uma estrutura de repetição para receber dados no array
        while (i < 36) {
            // Aleatorio recebe numero do random
            aleatorio = r.nextInt(36) + 1;
            boolean repetido = false;
            // For passa por toda a lista
            for (j = 0; j < i + 1; j++) {
                // If verifica se numero já existe na lista
                if (aleatorio == numeros[j]) {// se existe sai do for e volta pro while para fornecer novo random
                    repetido = true;
                    break;
                }
            }
            // se repetido for false, adiciona ao array
            if (!repetido) {
                numeros[i] = aleatorio;
                i++;
            }
        }
        // Imprimindo a sequência do array
        for (z = 0; z < 36; z++) {
            
            System.out.println(numeros[z] +"-"+nome[numeros[z]-1]);
        }
    }
}
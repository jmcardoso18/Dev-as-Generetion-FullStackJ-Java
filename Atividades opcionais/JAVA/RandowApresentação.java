//Importando biblioteca para classe random
import java.util.Random;

public class RandowApresentação{
    public static void main(String[] args) {
        //Declarando variaveis
        int[] numeros= new int[36];
        int i=0,z=0,j,aleatorio;

        String[] nome = new String[36];
        nome[0]="Alessandra Benedito da Silva";
        //Instânciando classe randomico
        Random r = new Random();
        //Usando uma estrutura de repetição para receber dados no array
        while(i<36){
            //Aleatorio recebe numero do random
            aleatorio = r.nextInt(36)+1;
            boolean repetido=false;
            //For passa por toda a lista
            for(j=0;j<i+1;j++){
                //If verifica se numero já existe na lista
                if(aleatorio==numeros[j]){//se existe sai do for e volta pro while para fornecer novo random
                    repetido=true;
                    break;
                }
            } 
            //se repetido for false, adiciona ao array
            if(!repetido){
                numeros[i]=aleatorio;
                i++;
            }
        }
        //Imprimindo a sequência do array
        for(z=0;z<36;z++){
            System.out.println(numeros[z]+","+nome[z]);
        }  
    }
}
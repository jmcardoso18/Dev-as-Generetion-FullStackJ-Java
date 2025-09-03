/*Crie uma função capaz de processar um número e verificar se é superior a 10. 
O resultado verdadeiro (verdadeiro) deve ser emitido para o console se o número for superior. 
Caso não seja, o resultado deve ser falso (falso). 
*/
programa {

  funcao inicio() {
    inteiro x
    escreva("Escreva um número:")
    leia(x)
    se(x>10){
      escreva("Verdadeiro, "+ x +" é maior que 10")
    }senao {
      se(x==10){
    
        escreva("Falso, "+ x +" é igual a 10")
      }senao{
  
        escreva("Falso, "+x +" é menor que 10")
      }
    }
  }
}


/*Crie uma fun��o capaz de processar um n�mero e verificar se � superior a 10. 
O resultado verdadeiro (verdadeiro) deve ser emitido para o console se o n�mero for superior. 
Caso n�o seja, o resultado deve ser falso (falso). 
*/
programa {

  funcao inicio() {
    inteiro x
    escreva("Escreva um n�mero:")
    leia(x)
    se(x>10){
      escreva("Verdadeiro, "+ x +" � maior que 10")
    }senao {
      se(x==10){
    
        escreva("Falso, "+ x +" � igual a 10")
      }senao{
  
        escreva("Falso, "+x +" � menor que 10")
      }
    }
  }
}


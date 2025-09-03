/* Crie uma função capaz de processar um número e verificar se é divisível por 4 ou 9. 
O resultado verdadeiro (verdadeiro) deve ser emitido para o console se o número for divisível por 4 ou 9, 
e falso (falso) se o número não for divisível.
*/
programa {
  funcao inicio() {
    inteiro x
    escreva("Escreva um número:")
    leia(x)
    se(x%4==0 ou x%9==0){
      escreva("Verdade "+ x+" é divisível por 4 ou 9.")
    }senao{
      escreva("Falso "+ x+ " não é divisível por 4 ou 9.")
    }
  }
}

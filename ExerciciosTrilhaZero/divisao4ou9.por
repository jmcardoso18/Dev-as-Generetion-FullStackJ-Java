/* Crie uma fun��o capaz de processar um n�mero e verificar se � divis�vel por 4 ou 9. 
O resultado verdadeiro (verdadeiro) deve ser emitido para o console se o n�mero for divis�vel por 4 ou 9, 
e falso (falso) se o n�mero n�o for divis�vel.
*/
programa {
  funcao inicio() {
    inteiro x
    escreva("Escreva um n�mero:")
    leia(x)
    se(x%4==0 ou x%9==0){
      escreva("Verdade "+ x+" � divis�vel por 4 ou 9.")
    }senao{
      escreva("Falso "+ x+ " n�o � divis�vel por 4 ou 9.")
    }
  }
}

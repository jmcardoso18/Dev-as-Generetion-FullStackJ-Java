programa {
  funcao inicio() {
    inteiro num[5] = {-1, 3,4,2,6}
    inteiro aux,i
    aux=num[0]
    para(i=0;i<5;i++){
      se (num[i]< aux){
        aux=num[i]
      }
    }
    escreva("O menor número é: ",aux)
  }
}
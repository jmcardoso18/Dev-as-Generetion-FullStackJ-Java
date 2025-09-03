
programa {

  funcao inicio() {
    inteiro numero[10]= {2,5,1,3,4,9,7,8,10,6}
    inteiro i, j, aux

    // Mostrando o vetor original
    escreva("Vetor Original: ")
    para(i=0; i<10; i++) {
      escreva(""+numero[i] + " ")
    }

    /*usando duas estruras de 'para' para garantir que passe por todos os vetores verificando a posição de comparação a posição seguinte do vetor
    e utilizando uma variavel auxiliar para não perder o dado anterior, depois de subescrever o vetor*/
    para(i=0; i<9; i++) {
      para(j=0; j<9-i; j++) {
        se(numero[j] < numero[j+1]) {
          aux = numero[j]
          numero[j] = numero[j+1]
          numero[j+1] = aux
        }
      }
    }
    // Mostrando o vetor ordenado em ordem decrescente
    escreva("\nVetor Ordenado: ")
    para(i=0; i<10; i++) {
      escreva(""+numero[i] + " ")
    }
  }
}

programa {
  funcao inicio() {
    inteiro numero[10]= {2,5,1,3,4,9,7,8,10,6}
    inteiro impar[5],par[5],soma=0,media=0,i,im=0,p=0
    // Mostrando o vetor original,fazendo a soma de todos os valores e atribuindo o valor aos vetores impar e par
    escreva("Vetor Original: ")
    para(i=0; i<10; i++) {
      escreva(""+ numero[i] + " ")
      soma=soma+numero[i]
      se(numero[i]%2==0){
        par[p]=numero[i]
        p++
      }senao{
        impar[im]=numero[i]
        im++
      }
    }
    // Mostrando numero impares
    escreva("\nElementos nos índices impares:\n")
    para(im=0; im<5; im++) {
      escreva(""+impar[im] + " ")
    }
    // Mostrando numero pares
    escreva("\nElementos pares:\n")
    para(p=0; p<5; p++) {
      escreva(""+par[p] + " ")
    }
    // Calculando a média da soma 
    media=soma/10
    escreva("\nA Soma é: "+ soma +"\nA média é:"+ media)
  }
}


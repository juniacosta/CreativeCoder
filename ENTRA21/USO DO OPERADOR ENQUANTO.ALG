Algoritmo "Uso do operador Enquanto"
//proway - entra21
//lógica de programação
Var

qtdEntrevistados, maisNovo, maisVelho, idadeInformada : inteiro
porcentagemMenorIdade, mediaIdade, qntdMenorIdade, somaIdades: real

Inicio

qtdEntrevistados <- 0
qntdMenorIdade <- 0
maisNovo <- 999
maisVelho <- 0
idadeInformada <- 0
somaIdades <- 0

enquanto qtdEntrevistados <5 faca
         Escreval ("Informe sua idade: ")
         leia (idadeInformada)
         
         se idadeInformada  >= maisVelho então
         maisVelho <- idadeInformada
         fimse
         
         se idadeInformada <= maisNovo então
         maisNovo <- idadeInformada
         fimse
         
         se idadeInformada < 18 então
         qntdMenorIdade <- qntdMenorIdade + 1
         fimse
         
somaIdades <- somaIdades+idadeInformada
qtdEntrevistados <- qtdEntrevistados+1
fimenquanto

Escreval ("Mais novo idade: ", maisNovo)
Escreval ("Mais velho idade: ", maisVelho)
porcentagemMenorIdade <- ((qntdMenorIdade/5) * 100)
Escreval ("A porcentagem de menores de idade é:", porcentagemMenorIdade, "%.")
mediaIdade <- somaIdades/5
Escreval ("A média das idades é de ", mediaIdade, "anos")

Fimalgoritmo
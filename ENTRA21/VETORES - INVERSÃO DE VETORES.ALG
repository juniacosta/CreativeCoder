Algoritmo "vetores2"
// Disciplina   : ENTRA 21 - L�GICA DE PROGRAMA��O E ALGORITMOS II
// Professor   : Marcelo
// Descri��o   : Programa para estudo da fun��o Vetor
// Autor(a)    : J�nia Costa
// Data atual  : 23/06/2022
Var
// Entrada de vetor e invers�o dos valores dos �ndices dentro do vetor

numeros, numerosReverso : vetor[1..10] de inteiro
i, aux : inteiro


Inicio
para i de 1 ate 10 faca
     escreval (i)
     leia (numeros[i])
fimpara

aux <- 11

para i de 1 ate 10 faca
     numerosReverso[aux-i] <- numeros[i]
fimpara

para i de 1 ate 10 faca
    escreval (numerosReverso[i])
fimpara


Fimalgoritmo
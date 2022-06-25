Algoritmo "vetores2"
// Disciplina   : ENTRA 21 - LÓGICA DE PROGRAMAÇÃO E ALGORITMOS II
// Professor   : Marcelo
// Descrição   : Programa para estudo da função Vetor
// Autor(a)    : Júnia Costa
// Data atual  : 23/06/2022
Var
// Entrada de vetor e inversão dos valores dos índices dentro do vetor

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
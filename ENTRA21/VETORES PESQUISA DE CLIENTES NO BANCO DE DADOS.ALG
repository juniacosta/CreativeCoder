Algoritmo "semnome"
// Disciplina   : ENTRA 21 - L�GICA DE PROGRAMA��O E ALGORITMOS II
// Professor   : Marcelo
// Descri��o   : Programa para estudo da fun��o Vetor
// Autor(a)    : J�nia Costa
// Data atual  : 23/06/2022
Var
// Cadastro de usu�rios

//nome1, nome2, nome3, nome4 = literal   � poss�vel substituir vari�veis unit�rias
// por uma vari�vel do tipo vetor

vetorNome : vetor[1..5] de caractere
vetorIdade : vetor [1..5] de inteiro
i : inteiro
pesquisa : caractere
encontrado : logico

Inicio
para i de 1 ate 5 faca
     escreval ("Informe seu nome: ")
     leia (vetorNome[i])
fimpara
limpatela

escreval ("Informe um nome para procura no banco de dados: ")
leia (pesquisa)

para i de 1 ate 5 faca
     se vetorNome[i] = pesquisa entao
     encontrado <- verdadeiro
     fimse
fimpara

se encontrado = verdadeiro entao
   escreval ("Cliente encontrado no banco de dados.")
senao
     escreval ("Cliente n�o encontrado no banco de dados.")
fimse

Fimalgoritmo
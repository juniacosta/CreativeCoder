Algoritmo "semnome"
// Disciplina   : ENTRA 21 - LÓGICA DE PROGRAMAÇÃO E ALGORITMOS II
// Professor   : Marcelo
// Descrição   : Programa para estudo da função Vetor
// Autor(a)    : Júnia Costa
// Data atual  : 23/06/2022
Var
// Cadastro de usuários

//nome1, nome2, nome3, nome4 = literal   é possível substituir variáveis unitárias
// por uma variável do tipo vetor

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
     escreval ("Cliente não encontrado no banco de dados.")
fimse

Fimalgoritmo
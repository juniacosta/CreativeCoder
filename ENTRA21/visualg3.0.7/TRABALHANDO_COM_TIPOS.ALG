Algoritmo "Trabalhando_com_tipos"

Var
nota1, nota2, nota3, media : real

Inicio
Escreval("Digite o a primeira nota")
Leia (nota1)
Escreval("Digite o a segunda nota")
Leia (nota2)
Escreval("Digite o a terceira nota")
Leia (nota3)

media <- (nota1+nota2+nota3)/3

Escreval("Sua m�dia foi ", media)

se media >= 7 entao
   Escreval("Voc� foi aprovado")
senao
     Escreval("Voc� foi reprovado")
fimse

Fimalgoritmo
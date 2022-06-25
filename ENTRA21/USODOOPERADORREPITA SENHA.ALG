Algoritmo "UsoDoOperadorRepita Senha"

Var
senha, resposta : caractere
i : inteiro

Inicio
i <- 0
Escreval ("Informe sua senha:")
leia (senha)
limpatela

repita
      Escreval ("Digite a senha para sair do programa")
      leia (resposta)
      i <- i+1

      se i=5 entao
      Escreval ("Foram reqalizadas 5 tentativas incorretas, sua conta foi bloqueada")
      fimse
      
ate (resposta = senha) ou (i=5)




Fimalgoritmo
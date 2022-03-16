package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
// A base e altura da escada devem ser iguais ao valor de n.
// A última linha não deve conter nenhum espaço.

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numeroDeDegraus = 0;

        System.out.println("Digite o número desejado de degraus, sabendo que o número inserido deverá ser do tipo INTEIRO");
        try {
            numeroDeDegraus = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //inversão da direção de degraus
        int regressao = numeroDeDegraus;

        // i=Número de interações (linhas impressas)
        for (int i = 0; i < numeroDeDegraus; i++) {
            String doisEspacos = " ";
            String asterisco = "*";

            String textoDaLinha = "";

            // j=Número de interações (formatação)
            for (int j = 0; j < regressao * 2 - 2; j++) {
                if (textoDaLinha.length() < regressao * 2 - 2) {
                    textoDaLinha = textoDaLinha.concat(doisEspacos);
                }
            }

            // k=Asteriscos
            for (int k = 0; k < i+1 ; k++) {
                textoDaLinha = textoDaLinha.concat(asterisco);
                }

           // }
            regressao = regressao - 1;
            System.out.println(textoDaLinha);
        }
    }
}

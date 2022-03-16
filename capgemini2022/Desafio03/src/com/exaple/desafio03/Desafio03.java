package com.exaple.desafio03;

// Desafio 03 Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
// podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo
// que encontre o número de pares de substrings que são anagramas.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "Digite uma palavra:\n");

        //s = string inicial
        String s = input.nextLine();

        // Retorno da contagem do número total de anagramas na substring
        HashMap<String, Integer> map = new HashMap<>();

        //loop para iniciar o índice da substring
        for (int i = 0; i < s.length(); i++) {
            // loop para o comprimento da substring
            for (int j = i; j < s.length(); j++) {
                char[] valC = s.substring(i, j + 1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val))
                    map.put(val, map.get(val) + 1);
                else
                    map.put(val, 1);
            }
        }

        //Contador para o número de anagramas
        int contagemAnagramas = 0;
        for (String key : map.keySet()) {
            int n = map.get(key);
            contagemAnagramas += (n * (n - 1)) / 2;
        }
        System.out.println("Existem "+ contagemAnagramas + " anagramas na palavra "+ s + ".");
    }
}

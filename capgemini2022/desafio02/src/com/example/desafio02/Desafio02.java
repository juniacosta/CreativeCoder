package com.example.desafio02;

//Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
// A página de cadastro exigia o preenchimento dos campos de nome e senha, // porém a senha precisa ser forte.
// O site considera uma senha forte quando ela satisfaz os seguintes critérios:
    //Possui no mínimo 6 caracteres.
    //Contém no mínimo 1 digito.
    //Contém no mínimo 1 letra em minúsculo.
    //Contém no mínimo 1 letra em maiúsculo.
    //Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
//Débora digitou uma string aleatória no campo de senha,
// porém ela não tem certeza se é uma senha forte.
// Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
// para uma string qualquer ser considerada segura.

import java.util.Scanner;

// Class para exceção de Senha Inválida
class InvalidPasswordException extends Exception {

    int passwordConditionViolated = 0;

    public InvalidPasswordException(int conditionViolated)
    {
        super("Senha inválida, motivo: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage()
    {
        // Chamada de acordo com o tipo de exceção violada
        switch (passwordConditionViolated) {

            //Caso a senha não atenda ao critério 1. No mínimo 6 caracteres.
            case 1:
                return ("A senha deve conter mais de 6 caracteres");

            //Caso a senha não atenda ao critério 2. No mínimo 1 número de 0 a 9
            case 2:
                return ("A senha deve conter pelo menos um número");

            //Caso a senha não atenda ao critério 3. No mínimo 1 letra minúscula.
            case 3:
                return ("A senha deve conter no mínimo 1 letra minúscula");

            //Caso a senha não atenda ao critério "4. No mínimo 1 letra maiúscula
            case 4:
                return ("A senha deve conter no mínimo 1 letra maiúscula");

            //Caso a senha não atenda ao critério 5. No mínimo 1 dos caracteres especiais a seguir: !@#$%^&*-+();
            case 5:
                return ("A senha deve conter no mínimo 1 caractere especial");

        }

        return ("");
    }
}

// Driver Class
public class Desafio02 {

    //função de checagem para senha válida
    public static void isValid(String password)
            throws InvalidPasswordException {

        //Check de pelo menos mais de 6 caracteres
        if (!((password.length() >= 6)
                && (password.length() <= 99))) {
            throw new InvalidPasswordException(1);
        }

        if (true) {
            int count = 0;

            // check de pelo menos um número
            for (int i = 0; i <= 9; i++) {

                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(2);
            }
        }


        if (true) {
            int count = 0;

            // check de pelo menos uma letra minúscula
            for (int i = 90; i <= 122; i++) {


                char c = (char) i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(3);
            }
        }

        if (true) {
            int count = 0;

            //check de pelo menos uma letra maiúscula
            for (int i = 65; i <= 90; i++) {


                char c = (char) i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(4);
            }
        }

        //check de pelo menos um símbolo !@#$%^&*-+()
        if (!(password.contains("!") || password.contains("@")
                || password.contains("#") || password.contains("$")
                || password.contains("%") || password.contains("^")
                || password.contains("&") || password.contains("*")
                || password.contains("-") || password.contains("+")
                || password.contains(")") || password.contains("(") ))
        {

            throw new InvalidPasswordException(5);
        }

        //Senha Válida (:
    }

    // Código de driver

    public static final int tamanhoSenha = 6;

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.print(
                        "Digite uma senha que contenha:\n" +
                                "1. No mínimo 6 caracteres.\n" +
                                "2. No mínimo 1 número de 0 a 9. \n" +
                                "3. No mínimo 1 letra minúscula. \n" +
                                "4. No mínimo 1 letra maiúscula \n" +
                                "5. No mínimo 1 dos caracteres especiais a seguir: !@#$%^&*-+();\n" +
                                "6. Espaços não são contabilizados \n");

                //password = Senha digitada
                String password = input.nextLine();

                int contador = 0;

                //Contabilizar cada caractere (exceto espaços)
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) != ' ')
                        contador++;
                }

                if (contador - tamanhoSenha < 0) {
                    int numeroNecessario = -(contador - tamanhoSenha);

                    //Informar quantos caracteres ainda são necessários
                    System.out.println("São necessários mais " + numeroNecessario + " caracteres");
                }

                try {
                    isValid(password);
                    System.out.println("Senha forte!");
                } catch (InvalidPasswordException e) {
                    System.out.print(e.getMessage());
                    System.out.println(e.printMessage());
                }

    } // Falta: fazer looping do driver até que senha seja válida;
}

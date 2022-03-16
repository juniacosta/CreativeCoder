package com.example;

// Java Program to check the validity
// of a Password using User-Defined Exception

import java.util.Scanner;

// Class for user-defined InvalidPasswordException
class InvalidPasswordException extends Exception {

    int passwordConditionViolated = 0;

    public InvalidPasswordException(int conditionViolated)
    {
        super("Invalid Password: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage()
    {
        // Call constructor of parent Exception
        // according to the condition violated
        switch (passwordConditionViolated) {

            // Password length should be
            // between 8 to 15 characters
            case 1:
                return ("A senha deve conter mais de 6 caracteres");

            // Password should not contain any space
            case 2:
                return ("Password should not"
                        + " contain any space");

            // Password should contain// at least one digit(0-9)
            case 3:
                return ("Password should contain"
                        + " at least one digit(0-9)");

            // Password should contain at least
            // one special character ( @, #, %, &, !, $ )
            case 4:
                return ("Password should contain at "
                        + "least one special character");

            // Password should contain at least
            // one uppercase letter(A-Z)
            case 5:
                return ("Password should contain at"
                        + " least one uppercase letter(A-Z)");

            // Password should contain at least
            // one lowercase letter(a-z)
            case 6:
                return ("Password should contain at"
                        + " least one lowercase letter(a-z)");
        }

        return ("");
    }
}

// Driver Class
public class untitled1 {
    // A utility function to check
    // whether a password is valid or not
    public static void isValid(String password)
            throws InvalidPasswordException
    {

        // for checking if password length
        // is between 8 and 15
        if (!((password.length() <= 8)
                && (password.length() <= 99))) {
            throw new InvalidPasswordException(1);
        }

        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(3);
            }
        }

        // for special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            throw new InvalidPasswordException(4);
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(5);
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 90; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(6);
            }
        }

        // The password is valid
    }

    // Driver code

    public static final int tamanhoSenha = 6;

    public static void main(String[] args)
    {

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
        }
        catch (InvalidPasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }

    }
}
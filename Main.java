package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        System.out.println("Input the length of the secret code:");
        String checkValue = reader.nextLine();

        int codeLength = ErrorHandling.errorCodeLength(checkValue);

        System.out.println("Input the number of possible symbols in the code:");
        int numberPossibleSymbols = reader.nextInt();

        boolean goOn = ErrorHandling.checkLengthBoth(codeLength, numberPossibleSymbols);

        if (goOn == true) {

            System.out.println("The secret is prepared: " + Display.displayStars(codeLength) + " " + "(0-9, a-" + Display.displayHeadline(numberPossibleSymbols) + ")");

            String randomNumber = GenerateSecretCode.generateRandomNumber(codeLength, numberPossibleSymbols);

            System.out.println("Okay, let's start a game!");

            Grader.grade(randomNumber);

            if (goOn == false) {
                System.exit(0);
            }
        }
    }
}
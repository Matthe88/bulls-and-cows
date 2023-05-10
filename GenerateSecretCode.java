package bullscows;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class GenerateSecretCode {

    public static String generateRandomNumber(int codeLength, int numberPossibleSymbols) {

        long pseudoRandomNumber = System.nanoTime();
        String typeCastRandomNumber = String.valueOf(pseudoRandomNumber) + "123456789";


        if (codeLength > 36) {
            System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
        }

        String randomNumber = "";

        if (codeLength <= 36 && codeLength > 10) {

            String abc = "abcdefghijklmnopqrstuvwxyz";

            for (int i = 0; i < typeCastRandomNumber.length(); i++) {
                for (int j = 0; j < numberPossibleSymbols; j++) {
                    if (!randomNumber.contains(typeCastRandomNumber.charAt(i) + "") && randomNumber.length() < codeLength) {
                        randomNumber += abc.charAt(i);
                        randomNumber += typeCastRandomNumber.charAt(i);
                    }
                }
            }
        }

        if (codeLength <= 9 && codeLength > 0) {

            for (int i = 0; i < typeCastRandomNumber.length(); i++) {
                if (!randomNumber.contains(typeCastRandomNumber.charAt(i) + "") && randomNumber.length() < codeLength) {
                    randomNumber += typeCastRandomNumber.charAt(i);
                }
            }
        }

        // System.out.println(randomNumber);
        return randomNumber;
    }
}
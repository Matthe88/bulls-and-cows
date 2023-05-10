package bullscows;

import java.rmi.server.RemoteRef;

public class Display {


    public static boolean Display(int cows, int bulls, String actualSolution) {

        if (actualSolution.length() == bulls) {
            System.out.println("Grade: " + bulls + " bull(s) and 0 cow(s). The secret code is " + actualSolution+".");
            return true;

        }

        if (cows > 0 && bulls == 0) {
            System.out.println("Grade: " + cows + " cow(s) and 0 bull(s). The secreet code is " + actualSolution+".");
        }


        if (cows > 0 && bulls > 0) {
            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). The secreet code is " + actualSolution+".");
        }

        if (bulls > 0 && cows == 0) {
            System.out.println("Grade: " + bulls + " bull(s) and 0 cow(s). The secreet code is " + actualSolution+".");
        }

        if (cows == 0 && bulls == 0) {
            System.out.println("Grade: None. The secreet code is " + actualSolution+".");
        }

        return false;
    }

    public static String displayHeadline(int numberPossibleSymbols) {

        String abc = "abcdefghijklmnopqrstuvwxyz";
        String returnString = "";

        if (numberPossibleSymbols - 11 < 0) {
            return "a";
        } else {
            return returnString += abc.charAt(numberPossibleSymbols - 11);
        }
    }


    public static String displayStars(int codeLength) {

        String returnStars = "";

        for (int i = 0; i<codeLength;i++) {
            returnStars += "*";
        }
        return returnStars;
    }
}



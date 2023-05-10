package bullscows;

import java.util.Scanner;

public class Grader {
    public static void grade(String actualSolution) {

        Scanner reader = new Scanner(System.in);
        int turn = 1;
        int cows = 0;
        int bulls = 0;


        while (true) {

            System.out.println("Turn " + turn + ":");
            String typedAnswer = reader.nextLine();


            for (int i = 0; i < typedAnswer.length(); i++) {

                if (typedAnswer.charAt(i) == actualSolution.charAt(i)) {
                    bulls++;
                }

                if (actualSolution.contains(typedAnswer.charAt(i) + "") && (typedAnswer.charAt(i) != actualSolution.charAt(i))) {
                    cows++;
                }
            }

            boolean endLoop = Display.Display(cows, bulls, actualSolution);
            cows = 0;
            bulls = 0;

            if (endLoop == true) {
                break;
            }
            turn++;

        }
    }
}


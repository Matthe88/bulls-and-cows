package bullscows;

public class ErrorHandling {

    public static int errorCodeLength(String checkValue) {

        int codeLength = 0;

        try {
            codeLength = Integer.valueOf(checkValue);

        } catch (Exception e) {
            System.out.println("Error \"" + checkValue + "\" isn't a valid number. ");
            System.exit(0);
        }
        return codeLength;
    }

    public static boolean checkLengthBoth(int codeLength, int numberPossibleSymbols) {

        boolean goOn = false;

        if (numberPossibleSymbols < 10 || codeLength - 10 > 0) {
            System.out.println("Error: it's not possible to generate a code with a length of " + codeLength + " with " + numberPossibleSymbols + " unique symbols.");
            goOn = false;
        } else if (numberPossibleSymbols > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z)");

        } else {
            goOn = true;
        }

        return goOn;
    }


}

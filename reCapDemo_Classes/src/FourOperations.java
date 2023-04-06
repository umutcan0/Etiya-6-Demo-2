public class FourOperations {
    public static int plus(int number1, int number2) {
        int total = 0;
        total = number1 + number2;
        return total;

    }

    public static int extraction(int number1, int number2) {
        int minus = 0;
        int theBiggest = number1;
        if (theBiggest < number2) {
            theBiggest = number2;
            minus = theBiggest - number1;
            return minus;
        } else {
            minus = theBiggest - number2;
            return minus;
        }


    }

    public static int multip(int number1, int number2) {
        int multiplication = 1;
        multiplication = number1 * number2;
        return multiplication;

    }

    public static double split(double number1, double number2) {
        double division = 1;
        double theBiggest = number1;
        if (theBiggest < number2) {
            theBiggest = number2;
            division = theBiggest / number1;
            return division;
        } else {
            division = theBiggest / number2;
            return division;
        }
    }
}

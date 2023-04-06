public class Main {

    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 15;
        int number3 = 14;
        int smallest = number1;
        int theBiggest = number3;

        if (smallest < number2) {
            smallest = smallest;
        } else {
            smallest = number2;
        }

        if (smallest < number3) {
            smallest = smallest;
        } else {
            smallest = number3;
        }

        System.out.println("Smallest number:" + smallest);

// If blokları ile çeşitli kontroller yapılarak 3 sayıdan en küçüğü bulundu.

        if (theBiggest < number2) {
            theBiggest = number2;
        }
        if (theBiggest < number1) {
            theBiggest = number1;
        }

        System.out.println("En büyük sayı:" + theBiggest);

// If blokları ile çeşitli kontroller yapılarak 3 sayıdan en büyüğü bulundu.

    }
}

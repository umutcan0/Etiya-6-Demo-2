public class Main {

    public static void main(String[] args) {
        double[] myList = {1.3, 1.2, 4.3, 5.6};
        double total = 0;
        double multiplication = 1;
        double smallest = myList[0];
        double theBiggest = myList[1];
        for (double number : myList) {
            total = total + number;
            multiplication = multiplication * number;
            System.out.println(number);
            if (number < myList[0]) {
                myList[0] = number;
            }
            if (number > myList[1]) {
                myList[1] = number;
            }
        }
        System.out.println("---------------------");
        System.out.println("Total: " + total);
        System.out.println("---------------------");
        System.out.println("Multiplication: " + multiplication);
        System.out.println("---------------------");
        System.out.println("Smallest: " + myList[0]);
        System.out.println("---------------------");
        System.out.println("The biggest: " + myList[1]);
    }
}

// For dögüsü ile dizi oluşturularak toplam, çarpım, en küçük sayı, en büyük sayı
// bulundu.

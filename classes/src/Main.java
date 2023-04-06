public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager2 = customerManager;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        customerManager2.Add();
        customerManager2.Remove();
        customerManager2.Update();


        int number1 = 20;
        int number2 = 15;
        number1 = number2;
        number2 = 30;
        System.out.println(number1);


        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};
        numbers1 = numbers2;
        numbers2[0] = 10;
        System.out.println(numbers1[0]);
    }

}

// Classları birbirinden çağırmakla ilgili örnek yapıldı.
public class Main {

    public static void main(String[] args) {
        int total = plus(2, 5);
        System.out.println(total);
        String names = getName("Ayşe", "Fatma");
        System.out.println(names);
        int total2 = plus2(3, 5, 6, 7, 1, 2);
        System.out.println(total2);

    }

    public static int plus(int number1, int number2) {
        return number1 + number2;
    }

    public static String getName(String name1, String name2) {
        return name1 + " " + name2;
    }

    public static int plus2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

}

//Metotlarlar (fonksiyonler) ile çalışıldı ve mainden çağırıldı. Değişken içeren fonksiyonların nasıl kullanıldığı ile örnekler yapıldı.

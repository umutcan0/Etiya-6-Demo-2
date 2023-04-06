public class Main {

    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        int sonuc = fourOperations.plus(5, 6);
        System.out.println(sonuc);
        System.out.println(fourOperations.extraction(8, 3));
        System.out.println(fourOperations.multip(2, 4));
        System.out.println(fourOperations.split(3, 2));
    }

}

// Dört işlem örneği yapıldı. Dört işlem örneğinin işlem kısmı için ayrı bir class oluşturuldu. Daha sonra mainden
// bu classın gerekli fonksiyonu çağrılarak istenilen iki sayı için dört işlem gerçekleştirilmiş oldu.
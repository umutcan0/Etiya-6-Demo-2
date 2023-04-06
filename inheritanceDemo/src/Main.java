public class Main {

    public static void main(String[] args) {

        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit1(new SoldierCreditManager());
        creditUI.calculateCredit2(new StudentCreditManager());

    }
}

// Inheritance durumu için daha kapsamlı bir örnek oluşturuldu. Öncelikle attribute açısından benzer olan birden fazla class için tek bir
// class oluşturulup oradan extend edilme işlemi yapıldı(miras alındı). Daha sonra bir UI(User Interface: kullanıcı arayüzü)classı oluşturulup
// oradan benzer özellikte olan classlar tek tek çağırılabildi.
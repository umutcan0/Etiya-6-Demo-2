public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Phone", "Iphone Phone", 4500, 35, "Blue");
        /*product.setId(1);
        product.setName("Phone");
        product.setDescription("Iphone Phone");
        product.setPrice(4500);
        product.setStockAmount(35);
        product.setRenk("Blue");*/
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
        System.out.println(product.getCode());
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("Color of the product: " + product.getColour());
    }
}
// Attribute (field) ile çalışıldı ve farklı classlar oluşturuldu.(Her class tek işi yapmalıdır düşüncesiyle
// hareket edildi. Constructer yapısı ile ilgili örnek yapıldı.

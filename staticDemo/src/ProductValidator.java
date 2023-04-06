public class ProductValidator {
    static {
        System.out.println("Constructor block created.");
    }

    public boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else
            return false;
    }

}

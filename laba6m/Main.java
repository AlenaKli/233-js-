public class Main {
    public static void main(String[] args) {
        Store.Product[] products = {
                new Store.Product(1.2, 10),
                new Store.Product(2.5, 20),
                new Store.Product(0.8, 5)
        };

        Supermarket supermarket = new Supermarket(5, products, 10, 500, new String[]{"Food", "Electronics", "Clothing"});
        System.out.println(supermarket);
    }
}

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Random random = new Random();

        // Возможные названия продуктов
        String[] productNames = {"Apple", "Banana", "Orange", "Mango", "Grape", "Cherry"};

        // Генерация корзины
        for (int i = 0; i < 10; i++) {
            String name = productNames[random.nextInt(productNames.length)];
            double price = 100 + random.nextDouble() * 10000; // Цена от 100 до 10000
            double weight = 0.5 + random.nextDouble() * 10;   // Вес от 0.5 до 10 кг
            Product product = new Product(name, price, weight);

            // Проверка на уникальность
            boolean exists = cart.stream().anyMatch(p -> p.name.equals(product.name));
            if (!exists) cart.add(product);
        }

        System.out.println("Корзина после генерации:");
        cart.forEach(System.out::println);

        // Удаление тяжелых или дорогих продуктов
        cart.removeIf(p -> p.weight > 5 || p.price > 10000);
        System.out.println("\nКорзина после удаления тяжелых или дорогих продуктов:");
        cart.forEach(System.out::println);

        // Добавление любимого продукта
        Product favorite = new Product("Cherry", 500, 1.2);
        cart.add(0, favorite);
        System.out.println("\nКорзина после добавления любимого продукта:");
        cart.forEach(System.out::println);

        // Вывод продуктов с ценой < 10 и весом > 2
        System.out.println("\nПродукты с ценой < 10 и весом > 2:");
        cart.stream()
                .filter(p -> p.price < 10 && p.weight > 2)
                .forEach(System.out::println);
    }
}
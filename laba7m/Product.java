

public class Product{
        String name;    // Название продукта
        double price;   // Цена
        double weight;  // Вес

        public Product(String name, double price, double weight) {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return String.format("Product{name='%s', price=%.2f, weight=%.2f}", name, price, weight);
        }
    }

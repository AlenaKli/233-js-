class Store {
    private int numberOfCashRegisters;
    private Product[] products;
    private int numberOfSellers;

    // Конструктор по умолчанию
    public Store() {
        this.numberOfCashRegisters = 0;
        this.products = new Product[0];
        this.numberOfSellers = 0;
    }

    // Конструктор с параметрами
    public Store(int numberOfCashRegisters, Product[] products, int numberOfSellers) {
        this.numberOfCashRegisters = numberOfCashRegisters;
        this.products = products;
        this.numberOfSellers = numberOfSellers;
    }

    // Мутаторы и аксессоры
    public int getNumberOfCashRegisters() {
        return numberOfCashRegisters;
    }

    public void setNumberOfCashRegisters(int numberOfCashRegisters) {
        this.numberOfCashRegisters = numberOfCashRegisters;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getNumberOfSellers() {
        return numberOfSellers;
    }

    public void setNumberOfSellers(int numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }

    // Метод для расчета среднего веса продукта
    public double calculateAverageProductWeight() {
        double totalWeight = 0;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        return products.length > 0 ? totalWeight / products.length : 0;
    }

    // Метод для расчета эффективности кассы
    public double calculateCashRegisterEfficiency() {
        return numberOfCashRegisters > 0 ? (double) numberOfSellers / numberOfCashRegisters : 0;
    }

    // Метод для расчета общей эффективности магазина
    public double calculateEfficiency() {
        double averageWeight = calculateAverageProductWeight();
        double cashRegisterEfficiency = calculateCashRegisterEfficiency();
        return averageWeight * cashRegisterEfficiency < 1 ? averageWeight * cashRegisterEfficiency : 0.99;
    }

    // Метод для вывода данных о магазине
    @Override
    public String toString() {
        return "Store {" +
                "numberOfCashRegisters=" + numberOfCashRegisters +
                ", numberOfSellers=" + numberOfSellers +
                ", averageProductWeight=" + calculateAverageProductWeight() +
                ", efficiency=" + calculateEfficiency() +
                '}';
    }

    // Вложенный класс Product
    static class Product {
        private double weight;
        private double price;

        // Конструктор по умолчанию
        public Product() {
            this.weight = 0;
            this.price = 0;
        }

        // Конструктор с параметрами
        public Product(double weight, double price) {
            this.weight = weight;
            this.price = price;
        }

        // Мутаторы и аксессоры
        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}

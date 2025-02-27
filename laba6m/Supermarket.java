class Supermarket extends Store {
    private double area;
    private String[] productCategories;

    // Конструктор по умолчанию
    public Supermarket() {
        super();
        this.area = 0;
        this.productCategories = new String[0];
    }

    // Конструктор с параметрами
    public Supermarket(int numberOfCashRegisters, Product[] products, int numberOfSellers, double area, String[] productCategories) {
        super(numberOfCashRegisters, products, numberOfSellers);
        this.area = area;
        this.productCategories = productCategories;
    }

    // Мутаторы и аксессоры
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String[] getProductCategories() {
        return productCategories;
    }
    public void setProductCategories(String[] productCategories) {
        this.productCategories = productCategories;
    }

    // Переопределение метода расчета эффективности
    @Override
    public double calculateEfficiency() {
        double cashRegisterEfficiency = calculateCashRegisterEfficiency();
        double categoryEfficiency = productCategories.length > 0 ? area / productCategories.length : 0;
        double totalEfficiency = categoryEfficiency * cashRegisterEfficiency;
        return totalEfficiency < 1 ? totalEfficiency : 0.99;
    }

    // Переопределение метода для вывода данных
    @Override
    public String toString() {
        return "Supermarket {" +
                "area=" + area +
                ", numberOfProductCategories=" + productCategories.length +
                ", efficiency=" + calculateEfficiency() +
                '}';
    }
}
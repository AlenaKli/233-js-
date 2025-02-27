public class KitchenWorker extends Employee {
    private String kitchenType;
    private boolean hasChefCertification;

    public KitchenWorker(String name, String surname, char gender, boolean active, double payment, int experience, String department, String kitchenType, boolean hasChefCertification) {
        super(name, surname, gender, active, "Кухонный работник", payment, experience, department);
        this.kitchenType = kitchenType;
        this.hasChefCertification = hasChefCertification;
    }

    @Override
    public void work() {
        System.out.println(getName() + " готовит еду на кухне типа " + kitchenType);
    }
}

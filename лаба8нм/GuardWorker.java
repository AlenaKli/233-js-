public class GuardWorker extends Employee {
    private String shift;
    private boolean armed;

    public GuardWorker(String name, String surname, char gender, boolean active, double payment, int experience, String department, String shift, boolean armed) {
        super(name, surname, gender, active, "Охранник", payment, experience, department);
        this.shift = shift;
        this.armed = armed;
    }

    @Override
    public void work() {
        System.out.println(getName() + " охраняет здание во время смены: " + shift);
    }
}

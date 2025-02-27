public class OfficeWorker extends Employee {
    private String officeNumber;
    private String specialization;

    public OfficeWorker(String name, String surname, char gender, boolean active, double payment, int experience, String department, String officeNumber, String specialization) {
        super(name, surname, gender, active, "Офисный работник", payment, experience, department);
        this.officeNumber = officeNumber;
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println(getName() + " выполняет офисную работу в офисе " + officeNumber);
    }
}

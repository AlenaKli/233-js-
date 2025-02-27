public class Main {
    public static void main(String[] args) {
        KitchenWorker cook = new KitchenWorker("Иван", "Петров", 'M', true, 50000, 5, "Кухня", "Итальянская", true);
        OfficeWorker manager = new OfficeWorker("Анна", "Иванова", 'F', true, 70000, 10, "Менеджмент", "305", "HR");
        GuardWorker guard = new GuardWorker("Сергей", "Сидоров", 'M', true, 45000, 3, "Охрана", "Ночная", true);

        cook.work();
        manager.work();
        guard.work();

        cook.sleep();
    }
}

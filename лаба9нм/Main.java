import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Показать студента");
            System.out.println("4. Показать всех студентов");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    group.addStudent();
                    break;
                case 2:
                    System.out.print("Введите номер студента для удаления: ");
                    int removeIndex = scanner.nextInt();
                    group.removeStudent(removeIndex);
                    break;
                case 3:
                    System.out.print("Введите номер студента для просмотра: ");
                    int viewIndex = scanner.nextInt();
                    group.getStudent(viewIndex);
                    break;
                case 4:
                    group.showAllStudents();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Некорректный ввод.");
            }
        }
        scanner.close();
    }
}
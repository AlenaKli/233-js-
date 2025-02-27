import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Изменить оценку");
            System.out.println("4. Изменить стипендию");
            System.out.println("5. Добавить отметку о посещении");
            System.out.println("6. Отобразить студентов");
            System.out.println("7. Выйти");
            System.out.print("Выберите действие: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (option) {
                    case 1 -> {
                        System.out.print("Имя: ");
                        String name = scanner.nextLine();
                        System.out.print("Фамилия: ");
                        String surname = scanner.nextLine();
                        System.out.print("Отчество: ");
                        String middle = scanner.nextLine();
                        System.out.print("Возраст: ");
                        int age = scanner.nextInt();
                        System.out.print("Пол (M/F): ");
                        char gender = scanner.next().charAt(0);
                        System.out.print("Оценка: ");
                        double grade = scanner.nextDouble();
                        System.out.print("Стипендия: ");
                        double scholarship = scanner.nextDouble();

                        Student student = new Student(name, surname, middle, age, gender, grade, scholarship);
                        group.addStudent(student);
                    }
                    case 2 -> {
                        System.out.print("Введите номер студента: ");
                        int index = scanner.nextInt();
                        group.removeStudent(index);
                    }
                    case 3 -> {
                        System.out.print("Введите номер студента: ");
                        int index = scanner.nextInt();
                        System.out.print("Введите новую оценку: ");
                        double grade = scanner.nextDouble();
                        group.updateGrade(index, grade);
                    }
                    case 4 -> {
                        System.out.print("Введите номер студента: ");
                        int index = scanner.nextInt();
                        System.out.print("Введите новую стипендию: ");
                        double scholarship = scanner.nextDouble();
                        group.updateScholarship(index, scholarship);
                    }
                    case 5 -> {
                        System.out.print("Введите номер студента: ");
                        int index = scanner.nextInt();
                        System.out.print("Был на занятии? (true/false): ");
                        boolean attended = scanner.nextBoolean();
                        group.addAttendance(index, attended);
                    }
                    case 6 -> {
                        System.out.println("1. По оценке");
                        System.out.println("2. По стипендии");
                        System.out.println("3. По возрасту");
                        System.out.println("4. В исходном порядке");
                        int sortOption = scanner.nextInt();
                        group.showStudentsSorted(sortOption);
                    }
                    case 7 -> System.exit(0);
                    default -> System.out.println("Некорректный ввод.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    private final ArrayList<Student> students = new ArrayList<>();
    private final int MAX_STUDENTS = 15;
    private final int MIN_STUDENTS = 3;

    public void addStudent() {
        if (students.size() >= MAX_STUDENTS) {
            System.out.println("Группа уже заполнена! Нельзя добавить больше " + MAX_STUDENTS + " студентов.");
            return;
        }
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите фамилию: ");
            String lastName = scanner.nextLine();
            System.out.print("Введите имя: ");
            String firstName = scanner.nextLine();
            System.out.print("Введите отчество: ");
            String middleName = scanner.nextLine();
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();
            System.out.print("Введите пол (M/F): ");
            char gender = scanner.next().charAt(0);
            System.out.print("Введите курс: ");
            int course = scanner.nextInt();
            System.out.print("Введите средний балл: ");
            double averageGrade = scanner.nextDouble();
            
            Student student = new Student(firstName, lastName, middleName, age, gender, course, averageGrade);
            students.add(student);
            System.out.println("Студент успешно добавлен!");

        } catch (NotCorrectAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void addStudent(Student student) {
        if (students.size() >= MAX_STUDENTS) {
            System.out.println("Группа уже заполнена! Нельзя добавить больше " + MAX_STUDENTS + " студентов.");
            return;
        }
        students.add(student);
        System.out.println("Студент успешно добавлен!");
    }

    public void removeStudent(int index) {
        if (students.size() <= MIN_STUDENTS) {
            System.out.println("В группе должно оставаться минимум " + MIN_STUDENTS + " студента.");
            return;
        }
        if (index < 0 || index >= students.size()) {
            System.out.println("Некорректный номер студента.");
            return;
        }
        students.remove(index);
        System.out.println("Студент удален.");
    }

    public void getStudent(int index) {
        if (index < 0 || index >= students.size()) {
            System.out.println("Некорректный номер студента.");
            return;
        }
        System.out.println(students.get(index));
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Группа пуста.");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i));
        }
    }
}
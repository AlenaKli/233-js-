import java.util.*;

public class Group {
    private TreeSet<Student> studentsByGrade = new TreeSet<>(StudentComparators.byAverageGrade);
    private TreeSet<Student> studentsByScholarship = new TreeSet<>(StudentComparators.byScholarship);
    private TreeSet<Student> studentsByAge = new TreeSet<>(StudentComparators.byAge);
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsByGrade.add(student);
        studentsByScholarship.add(student);
        studentsByAge.add(student);
        studentList.add(student);
        System.out.println("Студент добавлен!");
    }

    public void removeStudent(int index) {
        if (index < 0 || index >= studentList.size()) {
            System.out.println("Некорректный индекс.");
            return;
        }
        Student student = studentList.remove(index);
        studentsByGrade.remove(student);
        studentsByScholarship.remove(student);
        studentsByAge.remove(student);
        System.out.println("Студент удален.");
    }

    public void updateGrade(int index, double grade) {
        if (index < 0 || index >= studentList.size()) {
            System.out.println("Некорректный индекс.");
            return;
        }
        Student student = studentList.get(index);
        studentsByGrade.remove(student);
        student.setAverageGrade(grade);
        studentsByGrade.add(student);
        System.out.println("Оценка обновлена.");
    }

    public void updateScholarship(int index, double scholarship) {
        if (index < 0 || index >= studentList.size()) {
            System.out.println("Некорректный индекс.");
            return;
        }
        Student student = studentList.get(index);
        studentsByScholarship.remove(student);
        student.setScholarship(scholarship);
        studentsByScholarship.add(student);
        System.out.println("Стипендия обновлена.");
    }

    public void addAttendance(int index, boolean attended) {
        if (index < 0 || index >= studentList.size()) {
            System.out.println("Некорректный индекс.");
            return;
        }
        studentList.get(index).addAttendance(attended);
        System.out.println("Посещаемость обновлена.");
    }

    public void showStudentsSorted(int option) {
        switch (option) {
            case 1 -> studentsByGrade.forEach(System.out::println);
            case 2 -> studentsByScholarship.forEach(System.out::println);
            case 3 -> studentsByAge.forEach(System.out::println);
            case 4 -> studentList.forEach(System.out::println);
            default -> System.out.println("Некорректный вариант!");
        }
    }
}

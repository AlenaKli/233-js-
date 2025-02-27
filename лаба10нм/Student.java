import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private char gender;
    private double averageGrade;
    private double scholarship;
    private int attendedClasses;
    private int missedClasses;

    public Student(String firstName, String lastName, String middleName, int age, char gender, double averageGrade, double scholarship) throws NotCorrectAgeException, InvalidStudentException {
        if (Objects.equals(lastName, "Белоусов") && Objects.equals(firstName, "Алексей") && Objects.equals(middleName, "Юрьевич")) {
            throw new InvalidStudentException("Такой студент не может существовать!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        setAge(age);
        this.gender = gender;
        this.averageGrade = averageGrade;
        this.scholarship = scholarship;
        this.attendedClasses = 0;
        this.missedClasses = 0;
    }

    public void setAge(int age) throws NotCorrectAgeException {
        if (age < 16 || age > 60) {
            throw new NotCorrectAgeException("Возраст должен быть в диапазоне от 16 до 60 лет.");
        }
        this.age = age;
    }

    public double getAttendancePercentage() {
        int totalClasses = attendedClasses + missedClasses;
        return totalClasses == 0 ? 0 : (attendedClasses * 100.0) / totalClasses;
    }

    public void addAttendance(boolean attended) {
        if (attended) {
            attendedClasses++;
        } else {
            missedClasses++;
        }
    }

    public void setAverageGrade(double grade) {
        this.averageGrade = grade;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public double getScholarship() {
        return scholarship;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName +
                ", Возраст: " + age +
                ", Оценка: " + averageGrade +
                ", Стипендия: " + scholarship +
                ", Посещаемость: " + getAttendancePercentage() + "%";
    }
}

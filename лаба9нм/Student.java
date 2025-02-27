public class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private char gender;
    private int course;
    private double averageGrade;

    public Student() {}

    public Student(String firstName, String lastName, String middleName, int age, char gender, int course, double averageGrade) throws NotCorrectAgeException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        setAge(age);
        this.gender = gender;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    public void setAge(int age) throws NotCorrectAgeException {
        if (age < 16 || age > 60) {
            throw new NotCorrectAgeException("Возраст должен быть в диапазоне от 16 до 60 лет.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", " +
               "Возраст: " + age + ", Пол: " + gender + ", Курс: " + course + 
               ", Средний балл: " + averageGrade;
    }
}
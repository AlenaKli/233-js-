import java.util.Comparator;

public class StudentComparators {
    public static Comparator<Student> byAverageGrade = Comparator.comparingDouble(Student::getAverageGrade).reversed();
    public static Comparator<Student> byScholarship = Comparator.comparingDouble(Student::getScholarship).reversed();
    public static Comparator<Student> byAge = Comparator.comparingInt(Student::getAge);
    public static Comparator<Student> byAttendance = Comparator.comparingDouble(Student::getAttendancePercentage).reversed();
}

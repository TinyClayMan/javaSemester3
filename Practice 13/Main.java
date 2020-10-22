import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Фамилия", "Имя"));
        students.add(new Student("Сидоров", "Сидр"));
        students.add(new Student("Федоров", "Федор"));
        students.add(new Student("Германцев", "Герман"));
        students.add(new Student("Сёрнейм", "Форнейм"));

        students.sort(new SortingStudentsByGPA()); //by GPA
        System.out.println(students.toString());

        Collections.shuffle(students);              //shuffled
        System.out.println(students.toString());

        Collections.sort(students, Comparator.comparing(Student::getIdNumber)); //by ID
        System.out.println(students.toString());
    }
}

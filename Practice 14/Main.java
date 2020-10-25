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

        /*
        students.sort(new SortingStudentsByGPA()); //by GPA
        Collections.shuffle(students);             //shuffled
        Collections.sort(students, Comparator.comparing(Student::getIdNumber)); //by ID
         */
        //System.out.println(students.toString());

        //merge sort
        Collections.shuffle(students);
        long startTime = System.nanoTime();
        MergeSort sorter1 = new MergeSort();
        sorter1.mergeSort(students, 0, students.size()-1);
        System.out.println("Merge Sort time: " + (System.nanoTime() - startTime));

        //quick sort
        Collections.shuffle(students);
        startTime = System.nanoTime();
        QuickSort sorter2 = new QuickSort();
        sorter2.quickSort(students, 0, students.size()-1);
        System.out.println("Quick Sort time: " + (System.nanoTime() - startTime));

        BinarySearch searcher1 = new BinarySearch();
        startTime = System.nanoTime();
        searcher1.binaryItSearch(students, 3);
        System.out.println("Iterative binary search time: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        searcher1.binaryRecSearch(students, 0, students.size() - 1, 3);
        System.out.println("Recursive binary search time: " + (System.nanoTime() - startTime));

        LinearSearch searcher2 = new LinearSearch();
        startTime = System.nanoTime();
        searcher2.linearSearch(students, 3);
        System.out.println("Quick Sort time: " + (System.nanoTime() - startTime));
    }
}

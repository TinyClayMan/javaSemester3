import java.util.ArrayList;

public class LinearSearch {
    Student linearSearch(ArrayList<Student> arr, int x) {
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i).getIdNumber() == x)
                return arr.get(i);
        return null;
    }
}

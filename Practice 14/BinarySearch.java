import java.util.ArrayList;

public class BinarySearch {
    // Returns index of x if it is present in object arr,
    // else return -1

    int binaryItSearch(ArrayList<Student> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid 
            if (arr.get(m).getIdNumber() == x)
                return m;

            // If x greater, ignore left half 
            if (arr.get(m).getIdNumber() < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was 
        // not present 
        return -1;
    }

    int binaryRecSearch(ArrayList<Student> arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr.get(mid).getIdNumber() == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr.get(mid).getIdNumber() > x)
                return binaryRecSearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binaryRecSearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
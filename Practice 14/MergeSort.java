import java.util.ArrayList;

public class MergeSort {
    // Merges two subarrays of obj ArrayList.
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(ArrayList<Student> arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        ArrayList<Student> L = new ArrayList<>();
        ArrayList<Student> R = new ArrayList<>();

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L.add(arr.get(l + i));
        for (int j = 0; j < n2; ++j)
            R.add(arr.get(m + 1 + j));

        /* Merge the temp arrays */
        int i = 0, j = 0;   // Initial indexes of first and second subarrays
        int k = l;          // Initial index of merged subarray array
        while (i < n1 && j < n2) {
            if (L.get(i).getIdNumber() <= R.get(j).getIdNumber()) {
                arr.set(k, L.get(i));
                i++;
            }
            else {
                arr.set(k, R.get(j));
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr.set(k, L.get(i));
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr.set(k, R.get(j));
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void mergeSort(ArrayList<Student> arr, int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}

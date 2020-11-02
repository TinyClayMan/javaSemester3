public class MyColl{
    private int[] arr = new int[0];

    public MyColl(int ... ints) {
        for (int i : ints)
            add(i);
    }

    public void add(int num){
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        newArray[arr.length] = num;
        arr = newArray;
    }

    public void remove(int n){
        int index = find(n);
        int[] tmpArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, tmpArray, 0, index);
        System.arraycopy(arr, index+1, tmpArray, index, arr.length-index-1);
        arr = tmpArray;
    }

    public int find(int n){
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == n) return i;
        }
        return 0;
    }

    public int get(int index){
        return arr[index];
    }

    public int getMax(){
        int max = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (arr[i] > max) max=arr[i];
        }
        return max;
    }

    public int getMin(){
        int min = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (arr[i] < min) min=arr[i];
        }
        return min;
    }

    public float getAverage(){
        float sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    @Override
    public String toString() {
        String returnIt = "MyColl{arr =";
        for (int k : arr)
            returnIt += ' ' + String.valueOf(k);
        return returnIt + '}';
    }
}
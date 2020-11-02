public class Main {

    public static void main(String[] args) {
        MyColl myArr = new MyColl();
        myArr.add(99);
        myArr.add(13);
        myArr.add(21453465);
        myArr.add(345645);
        myArr.add(4);
        myArr.remove(13);
        System.out.println(myArr);
        System.out.println(myArr.getMax());
        System.out.println(myArr.getMin());
        System.out.println(myArr.getAverage());        
    }
}

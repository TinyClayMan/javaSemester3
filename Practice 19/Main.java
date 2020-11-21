import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("txt.txt", true);
        fw.write(new Scanner(System.in).nextLine()); //task #1
        fw.write("\n Adding text to the end of the file."); //task #4
        fw.close();

        FileWriter frw = new FileWriter("txt.txt", false);
        frw.write(new Scanner(System.in).nextLine()); //task #3
        frw.close();

        FileReader fr = new FileReader("txt.txt");
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine()); //#task 2
        }
        fr.close();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static HashMap allWords() {
        HashMap<String, Integer> words = new HashMap<>();
        try {
            Scanner fileReader = new Scanner(new File("/home/tinyclayman/IdeaProjects/Practice 20/src/WarNPeaceTweaked.txt"));
            int i = 0;
            String textToString;
            while (fileReader.hasNextLine()) {
                textToString = fileReader.nextLine();
                for (final String word : textToString.split("#")) {
                    Integer qty = words.get(word);
                    qty = (qty == null) ? 1 : ++qty;
                    words.put(word, qty);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        HashMap<String,Integer> topTen =
                words.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return topTen;
    }

    public static void main(String[] args) {
        Map<String, Integer> top = allWords();
        System.out.println(top);

    }
}

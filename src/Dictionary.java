import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Dictionary {


    TreeMap<String, Integer> words;


    public static void main(String[] args) {
        Dictionary dic = new Dictionary();

        File folder = new File("Files/");
        for (File f : Objects.requireNonNull(folder.listFiles())) {
            dic.addFile(f.getPath());
        }



    }

    public Dictionary() {
        words = new TreeMap<>();
    }


    public Dictionary wordsLong(int n) {
        Dictionary newDictionary = new Dictionary();
        words
                .entrySet()
                .stream()
                .filter(e -> e.getKey().length() == n)
                .forEach(e -> {
                    newDictionary.addWord(e.getKey(), e.getValue());
                });
        return newDictionary;
    }


    public void addPhrase(String phrase) {
        stringTokenizer(phrase);
    }

    public Boolean exists(String w) {
        return words.containsKey(w);
    }

    public Integer occurrences(String w) {
        return words.get(w);
    }


    public void addWord(String w) {
        words.merge(clearWord(w), 1, Integer::sum);
    }

     public void addWord(String w, Integer amount) {
        words.merge(clearWord(w), amount, Integer::sum);
    }


    /**
     * Converts a String to uppercase and removes all non alpha characters (a-z)
     *
     * @param str The String to clear
     * @return The String cleared
     */
    public static String clearWord(String str) {
        str = str.toUpperCase();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') output.append(ch);
        }
        return output.toString();
    }


    public void addFile(String path) {
        System.out.println(path);
        try {
            Scanner fileScanner = new Scanner(new File(path));
            while (fileScanner.hasNextLine()) {

                addPhrase(fileScanner.nextLine());
            }
        } catch (FileNotFoundException err) {
            System.out.println("File not found");
        }

    }


    private void stringTokenizer(String phrase) {
        StringTokenizer st = new StringTokenizer(phrase, " ");
        while (st.hasMoreElements()) {
            addWord(st.nextToken());
        }
    }


}

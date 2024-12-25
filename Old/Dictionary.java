import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Dictionary {
    private Word[] words;

    static final private int arrayChunks = 1000000000;
    private int wordsCount;


    public static void main(String[] args) throws FileNotFoundException {

/*

        Scanner fileScanner = new Scanner(new File("Web_scraping.txt"));
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }

*/

        Dictionary dic = new Dictionary();

        File folder = new File("Files/");
        for (File f : Objects.requireNonNull(folder.listFiles())) {
            dic.addFile(f.getPath());

        }



        System.out.print(dic);



    }


    /**
     * Returns an empty Dictionary
     */
    public Dictionary() {
        words = new Word[arrayChunks];
    }

    /**
     * Returns a Dictionary with all the Words in a provided String
     *
     * @param phrase The phrase you want to split into Words
     */
    public Dictionary(String phrase) {

    }

    /**
     * Return a Dictionary with all the Words of a specified length
     *
     * @param l The length of the words you want to search
     */
    public Dictionary wordsLongL(int l) {
        Dictionary newDictionary = new Dictionary();
        try {
            for (Word w : words) {
                if (w.toString().length() == l) {
                    newDictionary.addWord(w.toString());
                }
            }
        } catch (NullPointerException err) {
            System.out.println("Element was null");
        }


        return newDictionary;
    }


    /*==== "ADD" METHODS ====*/

    /**
     * Add the words provided in the phrase to the dictionary
     *
     * @param phrase the phrase you want to add to the dictionary
     */
    public void addPhrase(String phrase) {
        stringTokenizer(phrase);
    }

    public void addWord(String word) {

        for (Word w : words) {
            if (w != null && w.toString().equals(word)) {
                w.addOccurrence();
                return;
            }
        }

        if (wordsCount < words.length) {
            words[wordsCount] = new Word(word);
            wordsCount++;
        } else {
            expandWords();
        }
    }

    public void addWord(Word word) {

    }


    /**
     * Check if a Word is present in the Dictionary
     *
     * @param word The Word you want to know if exists
     */
    public Boolean exists(String word) {
        for (Word w : words) {
            if (w.toString().equals(word)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Returns the number of occurrences of the provided String
     *
     * @param word The word you want to know the occurrences
     */
    public long occurrences(String word) {
        for (Word w : words) {
            if (w != null && w.toString().equals(word)) return w.getOccurrences();
        }


        return 0;
    }


    /**
     * Returns the number of occurrences of the provided Word
     *
     * @param word The word you want to know the occurrences
     */
    public long occurrences(Word word) {
        return 0;
    }




    /*==== MISC METHODS ====*/


    public Dictionary(Dictionary toClone) {
        Dictionary cloned = new Dictionary();
        for (Word w : toClone.words) {
            cloned.addWord(w.toString());
        }
        cloned.wordsCount = toClone.wordsCount;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%15s | %-10s %n", "OCCURRENCES", "WORD"));
        output.append("--------------------------\n");
        for (int i = 0; i < wordsCount; i++) {
            Word w = words[i];
            output.append(String.format("%015d | %s %n", w.getOccurrences(), w));
        }
        return output.toString();
    }


    private static String clearWord(String str) {
        StringBuilder output = new StringBuilder();
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }

    private void stringTokenizer(String phrase) {
        StringTokenizer st = new StringTokenizer(phrase, " ");
        while (st.hasMoreElements()) {
            addWord(clearWord(st.nextToken()));
        }
    }








    /*==== PRIVATE METHODS ====*/


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


    private int getMaxWords() {
        return words.length;
    }

    private int getWordsLength() {
        return words.length;
    }


    private void expandWords() {
        System.out.println("ARRAY FULL");

    }


}

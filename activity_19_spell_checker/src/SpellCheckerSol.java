/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 19 - SpellChecker
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellCheckerSol
{
    private static final int DICTIONARY_SIZE = 127143;

    private static String[] dictionary = new String[DICTIONARY_SIZE];

    /* TODO #1 - write a *loadWords* method to load of the words from the dictionary file into the dictionary array */
    static void loadWords() throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("dictionary.txt"));
        int i = 0;
        while (in.hasNext()) {
            String word = in.nextLine().strip();
            dictionary[i] = word;
            i++;
        }
        in.close();
    }

    /* TODO #2 - write a *print10* method that prints out the first 10 words of the dictionary array. */
    static void print10() {
        for (int i = 0; i < 10; i++)
            System.out.println(dictionary[i]);
    }

    /* TODO #3 - write a *spellcheck* method that takes a word as a parameter and returns true if it is in the dictionary array; false if it is not found. */
    static boolean spellCheck(String word) {
        boolean found = false;
        for (int i = 0; i < dictionary.length; i++)
            if (word.equalsIgnoreCase(dictionary[i])) {
                found = true;
                break;
            }
            else
                // search optimization (optional)
                if (word.compareTo(dictionary[i]) < 0)
                    break;
        return found;
    }

    /* TODO #4 - write a *printStartsWith* method that prints all words that start with a given prefix (hint: use String's method *startsWith*) */
    static void printStartsWith(String prefix) {
        String prefixLower = prefix.toLowerCase();
        for (int i = 0; i < dictionary.length; i++)
            if (dictionary[i].startsWith(prefixLower))
                System.out.println(dictionary[i]);
            else
                // search optimization (optional)
                if (prefixLower.compareTo(dictionary[i]) < 0)
                    break;
    }

    public static void main(String[] args) throws FileNotFoundException {
        /* uncomment to load the words into the dictionary */
        loadWords();

        /* uncomment to test *print10* method */
        // print10();

         /* uncomment to test *spellCheck* method */
        /* Scanner sc = new Scanner(System.in);
        System.out.print("? ");
        String word = sc.nextLine();
        if (spellCheck(word))
            System.out.println(word + " is spelled correctly!");
        else
            System.out.println(word + " is misspelled!"); */

        // uncomment to test *printStartsWith* method */
        printStartsWith("a");
    }
}

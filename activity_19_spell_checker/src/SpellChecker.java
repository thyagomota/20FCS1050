/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 19 - SpellChecker
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellChecker
{
    private static final int DICTIONARY_SIZE = 127143;

    private static String[] dictionary = new String[DICTIONARY_SIZE];

    /* TODO #1 - write a *loadWords* method to load of the words from the dictionary file into the dictionary array */
    static void loadWords() throws FileNotFoundException {

    }

    /* TODO #2 - write a *print10* method that prints out the first 10 words of the dictionary array. */
    static void print10() {

    }

    /* TODO #3 - write a *spellcheck* method that takes a word as a parameter and returns true if it is in the dictionary array; false if it is not found. */
    static boolean spellCheck(String word) {
        boolean found = false;
        return found;
    }

    /* TODO #4 - write a *printStartsWith* method that prints all words that start with a given prefix (hint: use String's method *startsWith*) */
    static void printStartsWith(String prefix) {

    }

    public static void main(String[] args) throws FileNotFoundException {
        /* uncomment to load the words into the dictionary */
        // loadWords();

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
        // printStartsWith("a");
    }
}

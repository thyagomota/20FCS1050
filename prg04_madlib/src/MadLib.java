/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Prg04 - MadLib
 * Student Name(s):
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MadLib {

    private String  story;
    private static final String LIB_FOLDER          = "libs";
    private static final String MAD_LIB_FILE_PREFIX = "madlib";
    public static final String QUESTION_PREFIX     = "Give me a(n)";
    public static final String STORY_NOT_COMPLETED_TEXT = "Sorry, but the story is not completed!";

    /*
    TODO: read the text contained in the Mad Lib file that corresponds to the given number; the contents of the file must be saved to instance variable "story".
     */
    public MadLib(int number) throws FileNotFoundException {

    }

    /*
    TODO: save the given story to instance variable "story"
     */
    public MadLib(String story) {

    }

    /*
    TODO: return true if there aren't any more blanks to fill in the story; false otherwise.
     */
    public boolean isCompleted() {
        return false;
    }

    /*
    TODO: check if the story is completed; if NOT, return the question from the first blank found in the story; if the story is completed, return a blank string.
     */
    public String getQuestion() {
        return "";
    }

    /*
    TODO: replace the first blank found in the story with the given answer.
     */
    public void updateStory(String answer) {

    }

    /*
    TODO: override toString by returning the story (if completed) or a message saying that the story is not completed.
     */
    @Override
    public String toString() {
        return STORY_NOT_COMPLETED_TEXT;
    }
}

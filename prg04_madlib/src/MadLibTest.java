/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Prg04 - MadLibTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MadLibTest {

    @Test
    void mainTest() {
        MadLib madLib = new MadLib("bla ble bli __verb_ending_in_ed__ blo __proper_name__ blu!");
        assertFalse(madLib.isCompleted());
        String question = madLib.getQuestion();
        assertEquals(question, MadLib.QUESTION_PREFIX + " verb ending in ed: " );
        madLib.updateStory("tested");
        assertFalse(madLib.isCompleted());
        assertEquals(madLib.toString(), MadLib.STORY_NOT_COMPLETED_TEXT);
        question = madLib.getQuestion();
        assertEquals(question, MadLib.QUESTION_PREFIX + " proper name: " );
        madLib.updateStory("John Doe");
        assertTrue(madLib.isCompleted());
        assertEquals(madLib.toString(), "bla ble bli tested blo John Doe blu!");
    }

}
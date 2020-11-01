/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Prg03 - SlidingPuzzle
 * Student(s) Name(s):
 */

import javax.swing.*;
import java.io.IOException;

public class SlidingPuzzle extends JFrame {

    static String TITLE        = "CS 1050 - Sliding Puzzle";
    static int    TITLE_HEIGHT = 20;

    private Puzzle puzzle;

    SlidingPuzzle() throws IOException {
        setTitle(TITLE);
        setSize(Puzzle.TILE_SIZE * Puzzle.GRID_SIZE, Puzzle.TILE_SIZE * Puzzle.GRID_SIZE + TITLE_HEIGHT);
        puzzle = new Puzzle();
        setContentPane(puzzle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new SlidingPuzzle();
    }
}

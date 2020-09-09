/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Prg01 - LatinSquare
 * Student(s) Name(s):
 */

import java.util.Scanner;

public class LatinSquareDriver {

    static final int MIN_ORDER = 3;
    static final int MAX_ORDER = 99;

    public static void main(String[] args) {

        // safe checking whether MIN_ORDER < MAX_ORDER and MAX_ORDER < 99
        if (MIN_ORDER >= MAX_ORDER || MAX_ORDER > 99) {
            System.out.println("MIN_ORDER must be < MAX_ORDER!");
            System.out.println("MIN_ORDER = " + MIN_ORDER);
            System.out.println("MAX_ORDER = " + MAX_ORDER);
            System.exit(1); // program exits with an error code
        }

        // TODO: ask the user for the order of the square;
        // the number entered  must be in [MIN_ORDER..MAX_ORDER];
        // the program should continuously ask the user for the
        // order of the square, until a valid number is entered.


        // TODO: ask the user for the first number of the square;
        // the number entered must be in [1..order];
        // the program should continuously ask the user for the
        // first number of the square, until a valid number is entered.


        // TODO: generate the latin square;
        // after you run your code, the output must be saved in a file named latin_square_A_B.txt,
        // where A should be replaced by the order and B by the first number; for example,
        // if order is 5 and the first number is 2, the file should be named latin_square_5_2.txt


    }
}

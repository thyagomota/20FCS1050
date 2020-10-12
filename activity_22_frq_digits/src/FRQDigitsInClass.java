/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 22 - FRQDigits
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FRQDigitsInClass {

    public static void main(String[] args) {

        // TODOd #1: ask the user for an integer number > 0
        Scanner sc = new Scanner(System.in);
        int userNum = -1;
        while (userNum < 0) {
            System.out.print("Please enter a number >= 0: ");
            userNum = sc.nextInt();
        }

        // TODOd #2: declare and initialize an ArrayList of Integer called "digitsList"
        ArrayList<Integer> digitsList = new ArrayList<>();

        // TODOd #3: add the digits from the given number into "digitsList"
        if (userNum == 0)
            digitsList.add(0);
        else
            while (userNum > 0) {
                digitsList.add(userNum % 10);
                userNum = userNum / 10;
            }

        // TODOd #4: reverse "digitsList"
        Collections.reverse(digitsList);

        // TODOd #5: print "digitsList"
        System.out.println(digitsList);

    }
}

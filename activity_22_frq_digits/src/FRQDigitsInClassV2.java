/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 22 - FRQDigits
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FRQDigitsInClassV2 {

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
        String userNumStr = userNum + ""; // converts userNum to a String
        for (int i = 0; i < userNumStr.length(); i++) {
            int digit = Integer.parseInt(userNumStr.charAt(i) + "");
            digitsList.add(digit);
        }

        // TODOd #4: reverse "digitsList"
        // Collections.reverse(digitsList);

        // TODOd #5: print "digitsList"
        System.out.println(digitsList);

    }
}

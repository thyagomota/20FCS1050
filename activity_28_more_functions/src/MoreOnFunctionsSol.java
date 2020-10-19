import java.util.ArrayList;
import java.util.Scanner;

/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 28 - MoreOnFunctions
 */
public class MoreOnFunctionsSol {

    // TODO: write a function called maxOf3 that takes 3 integers and returns the greater of them
    static int maxOf3(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    // TODO: write a function called doublex that takes an integer and returns the given value doubled!
    static int doublex(int x) {
        return 2 * x;
    }

    // TODO: write a function called div that returns an array containing all of the divisors of a given number
    static ArrayList<Integer> div(int number) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                divisors.add(i);
        return divisors;
    }

    // TODO: write a function that tells whether a given number is a prime number or not
    static boolean isPrime(int number) {
        ArrayList<Integer> divisors = div(number);
        return divisors.size() == 2;
    }

    // TODO: write a function call factors that returns all factors of a given number
    static ArrayList<Integer> factors(int number) {
        ArrayList<Integer> divisors = div(number);
        ArrayList<Integer> factors = new ArrayList<>();
        for (int div : divisors)
            if (isPrime(div))
                factors.add(div);
        return factors;
    }

    // TODO: test your functions in main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}

import java.util.Scanner;

/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 26 - GCD
 */
public class GCDSol {

    // TODO: compute the gcd of given numbers a and b
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a? ");
        int a = sc.nextInt();
        System.out.print("b? ");
        int b = sc.nextInt();
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
    }
}

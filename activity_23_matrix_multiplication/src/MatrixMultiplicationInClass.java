/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 23 - MatrixMultiplication
 */

import java.util.Scanner;

public class MatrixMultiplicationInClass {

    public static void main(String[] args) {

        // TODOd #1: read the first matrix A
        Scanner in = new Scanner(System.in);
        System.out.print("Matrix A: nxm? ");
        int nA = in.nextInt();
        int mA = in.nextInt();
        int A[][] = new int[nA][mA];
        for (int i = 0; i < nA; i++) {
            System.out.print("line " + (i + 1) + "? ");
            for (int j = 0; j < mA; j++)
                A[i][j] = in.nextInt();
        }

        // TODOd #2: read the second matrix B
        System.out.print("Matrix B: nxm? ");
        int nB = in.nextInt();
        int mB = in.nextInt();
        int B[][] = new int[nB][mB];
        for (int i = 0; i < nB; i++) {
            System.out.print("line " + (i + 1) + "? ");
            for (int j = 0; j < mB; j++)
                B[i][j] = in.nextInt();
        }

        // TODOd #3: initialize matrix C
        int C[][] = new int[nA][mB];
        for (int i = 0; i < nA; i++)
            for (int j = 0; j < mB; j++)
                C[i][j] = 0;

        // TODOd #4: multiply A x B
        for (int i = 0; i < nA; i++)
            for (int j = 0; j < mB; j++)
                for (int k = 0; k < mA; k++)
                    C[i][j] += A[i][k] * B[k][j];

        // TODOd #5: display matrix C
        for (int i = 0; i < nA; i++) {
            for (int j = 0; j < mB; j++)
                System.out.print(C[i][j] + "\t");
            System.out.println();
        }
    }
}

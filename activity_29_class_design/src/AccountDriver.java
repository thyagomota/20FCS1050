/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 29 - AccountDriver
 */

public class AccountDriver {

    public static void main(String[] args) {
        Account acc1 = new Account(101, "Frank");
        Account acc2 = new Account(202, "Mary");

        System.out.println(acc1);
        acc1.deposit(100);
        System.out.println(acc1);
        System.out.println("trying to withdraw $75");
        if (acc1.withdraw(75))
            System.out.println("Success!");
        else
            System.out.println("Withdraw failed!");
        System.out.println(acc1);
        System.out.println("trying to withdraw $35");
        if (acc1.withdraw(35))
            System.out.println("Success!");
        else
            System.out.println("Withdraw failed!");
        System.out.println(acc1);

        System.out.println(acc2);

    }

}

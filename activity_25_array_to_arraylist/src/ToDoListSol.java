/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 25 - ToDoList
 */

import java.util.*;

public class ToDoListSol {

    public static void main(String[] args) {

        // Rewrite this code to use an ArrayList instead of an array
        // String[] toDoList = new String[3];
        ArrayList<String> toDoList = new ArrayList<>();
        //toDoList[0] = "Do homework";
        toDoList.add("Do homework");
        // toDoList[1] = "Help make dinner";
        toDoList.add("Help make dinner");
        // toDoList[2] = "Call grandma";
        toDoList.add("Call grandma");

        // changing element 1
        // toDoList[1] = "Order pizza";
        toDoList.set(1, "Order pizza");

        // System.out.println(toDoList.length + " things to do!");
        System.out.println(toDoList.size() + " things to do!");

        // System.out.println("Here's the first thing to do: "
        //        + toDoList[0] );
        System.out.println("Here's the first thing to do: "
                + toDoList.get(0) );

        // remove item 0 and move everything down
        //  (this can be done in 1 command with ArrayList)
//        toDoList[0] = toDoList[1];
//        toDoList[1] = toDoList[2];
//        toDoList[2] = "";
        toDoList.remove(0);

//        System.out.println("Here's the next thing to do: "
//                + toDoList[0] );
        System.out.println("Here's the next thing to do: "
                + toDoList.get(0) );

        // Why is an ArrayList better than an array for a toDoList?
        // Answer:
        // * makes it easier to remove elements (don't have to worry about shifting the elements in the list)
        // * it is dynamic so you don't have to worry about estimating the maximum number of items in your to-do list
        // * a to-do list is inherently dynamic; so it makes more sense to use an array list instead of a static array
    }
}

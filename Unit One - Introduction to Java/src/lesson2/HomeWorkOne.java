package lesson2;

import java.util.Scanner; 

public class HomeWorkOne {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println();
        System.out.println("Question: WHat is the lagest planet in our solar system? (1,2,3,4)");
        System.out.println();
        System.out.println("1 - Earth");
        System.out.println("2 - Mars");
        System.out.println("3 - Jupiter");
        System.out.println("4 -Saturn");
        System.out.println();
        System.out.println("What is your choice? (1,2,3,4)");
        int x = myObj.nextInt();
        System.out.println("You chose: "+ x);
        if (x == 3 ) {
            System.out.println("You were correct!");
            System.out.println();
        } else {
            System.out.println("Incorrect");
            System.out.println("The ans is 3, Jupiter");
            System.out.println();
        }
    }

}

package lesson5;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* 
        System.out.println("Enter a whole number"); // prompt a user to enter an intager
        int x = in.nextInt();
        System.out.println(x);

        System.out.println("Enter a double");
        double y = in.nextDouble();
        System.out.println(y);

        System.out.println("Please enter two ints seperated by a space"); // can be enterd in using seperation by a space
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a+b); 
        */

        System.out.println("Enter a number");
        int d = in.nextInt(); // if i give it two numbers seperated by a space, it will take the first one and leave the second in the queue for later.
        System.out.println("Enter another number"); // THE CODE DEVELOPS A QUEUE FOR THE INPUTS 

        int c = in.nextInt();

    }
}

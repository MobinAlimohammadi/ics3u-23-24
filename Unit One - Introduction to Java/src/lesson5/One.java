package lesson5;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Currency Exchange program");
        System.out.println();
        System.out.println("USD TO CAD");
        System.out.println();
        System.out.println("Enter the ammount of USD");
        int x = in.nextInt();
        double CAD = x*1.25;
        System.out.println(x+" USD is "+CAD+" CAD");




    }
}

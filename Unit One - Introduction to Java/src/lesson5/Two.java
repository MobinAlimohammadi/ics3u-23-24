package lesson5;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Circle area and Circumference");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = in.nextInt();
        System.out.println();
        double pi = 3.14;
        double area = pi * r * r;
        double circ = 2 * pi * r;
        System.out.println("The area is "+area+" and the  circumference is "+circ);
        System.out.println();


        
        
    }
}

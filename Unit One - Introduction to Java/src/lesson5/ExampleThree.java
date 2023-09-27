package lesson5;

import java.util.Scanner;

public class ExampleThree {
    public static void main(String[] args) {
       
        
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a temerature in Farenheit");
        int Farenheit = in.nextInt();

        double celcius  = ((double)Farenheit -32) * 5 /9 ;
        System.out.println(celcius);

        in.close(); //removes the yellow 

    }
}

package lesson5;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Speed calculation");
        System.out.println();
        System.out.println("This program will calculate the speed from distance and time provided");
        System.out.println();
        System.out.println("Enter the distance in meters travelled followed by the time in seconds ,, seperated by a space");
        Scanner in = new Scanner(System.in);
        double meters = in.nextDouble();
        double seconds = in.nextDouble();
        double mps = meters/seconds;
        double kmph = mps *60*60/1000;
        System.out.println("The speed in m/s is "+mps+" and the speed in Km/h is "+kmph);
        System.out.println();
        //System.out.println("The speeds rounded to 2 decimal places:");
        //double mps2dp = ((int)(mps*100))/(double)100;
        //double kmph2dp = ((int)(kmph*100))/(double)100;
        //System.out.println("The speed in m/s is "+mps2dp+" and the speed in Km/h is "+kmph2dp);
        

        
    }
    
}

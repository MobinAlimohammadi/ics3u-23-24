package lesson3;

import java.util.Scanner; 

public class HW1 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter the prices of the 3 items seperated by the enter");
        Double item1 = myObj.nextDouble(); //INPUT in double
        Double item2 = myObj.nextDouble(); //INPUT in double
        Double item3 = myObj.nextDouble(); //INPUT in double

        double sum = item1+item2+item3;
        System.out.println(sum);
    }
}

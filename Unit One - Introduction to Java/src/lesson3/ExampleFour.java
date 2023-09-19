package lesson3;

public class ExampleFour {
    public static void main(String[] args) {
        
        int num = 6731;
        int digit1 = num % 10;  // divide by 10 and get the remainder always gets the 1s digit
        int digit4 = num / 1000; //6731 divide by 1000 = 6
        int digit2 = num / 10 % 10;// 6731/10 = 673 mod 10 = 3
        int digit3 = num / 100 % 10 ; // 6731/100 =67  mod 10 = 7
        //or
        digit2 = num % 100 / 10;
        //or 
        digit3 = num % 1000 /100;

        int sum = digit1 + digit2 + digit3 + digit4;
        // sum of the digits
        System.out.println(sum);
        // use mod to find an odd number 

        int oddoreven = num % 2; //if it is one then its odd if its 0 then its even
        System.out.println(oddoreven);

   
    }
    
}

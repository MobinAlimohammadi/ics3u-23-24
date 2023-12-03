package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoopExamples {
    public static void main(String[] args) {
        

        exapleone();

        exampletwo();

        int result = examplethree();

        int resulttwo = examplefour(10, 20);

        int resultval = examplefive(1,100);
        System.out.println(resultval);

        int resultval2 = examplesix(1,100);
        System.out.println(resultval2);
        
        
    }

    private static int examplesix(int min, int max) {
        int i= min;
        int sum = 0;

        while(i <=max){
            sum +=i;
            i++;
        }
        return sum;
    }

    private static int examplefive(int min, int max) {
       int sum = 0;
       
       for( int i =0; i<=max ; i++){
        sum += i;
       }
       return sum;
    }

    private static int examplefour(int min, int max) {
        int result = 0;
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        while (!valid){
            System.out.println("yo number from "+min+" to "+max);

        try{
            result = Integer.parseInt(in.nextLine());
            if (result<min || result >max)
                System.out.println("Not in range");
            else{
                valid = true;
            }
            }catch(NumberFormatException badThing){
                System.out.println("numbers only!");
            }
        }
    

        return result;

    }

    private static int examplethree() {
        int result = -1;
        Scanner in = new Scanner(System.in);

        while(result <1 || result > 10){
            System.out.println("number between 1-10");
            result = in.nextInt();
        }


        return result;
    }

    private static void exampletwo() {

        int y = 0;

        for( int i = 0; i < 100000; i++){
            
            if (((int)(Math.random()*10)+1) % 2 == 0){
                y++;
            }
        }
        System.out.println(y);
    }

    private static void exapleone() {
        for(int i = 0; i<=5 ; i++){
            System.out.println(i);
        }
    }
}

package lesson1;

import java.util.Scanner;

public class ForLoopExamples {
    public static void main(String[] args) {
        //for loop when you know how many times you want to do somthing 

        //exampleOne();
        //exampleTwo();
        //int result = exampleThree("Today is the best day ever!");
        //System.out.println(result);

        //int result = exampleFour("codeycodehhiieefcodeet", "code");
        //System.out.println(result);

        //exampleFive();
        
        
    }


    private static int exampleFive() {
        System.out.println("Please enter a number {1-10}: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(;num<1||num>10;){
           System.out.println("Please enter a number {1-10}: ");
            num = in.nextInt(); 
        }

        return num;
    }

    private static int exampleFour(String bigStr, String smallStr) {
        int num = 0;

        for( int i = 0 ; i <= bigStr.length()-smallStr.length() ; i ++){
            String str = bigStr.substring(i, smallStr.length());

            if(smallStr.equals(str)){
                num++;
            }
        }
        return num;
        
    }

    private static int exampleThree(String str) {
        int numE = 0;
        for(int index = 0; index < str.length() ; index++){
            String letter = str.substring(index, index+1);

            if ("e".equals(letter) || "E".equals(letter)){
                numE++;
            }
        }

        return numE;
    }

    private static void exampleTwo() {
        for(int i = -10; i <= 10; i+=2){

            System.out.println(i);
        }
    }

    private static void exampleOne() {
        // for loop is a counting loop, and is used when we know how many times to execute 
        // some code.
        // it requires 3 things, what to start counting from eg int i = 0
        // it also requires a condition to keep counting if it is true eg i<10
        // and it also needs a method that says how you are going to count eg i ++ aka (i=i+1)
        for(int i = 0; i < 10; i++){

            System.out.println(i);
        }


    }
}

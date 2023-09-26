package lesson4;

public class ExampleThree {
    public static void main(String[] args) {
        //the different types of errors
        int mark1 = 84, mark2 = 91, mark3 = 97;
        int numTests = 3;
        System.out.println(mark1 +mark2+ mark3 +numTests);


        // Three types of errors:



        //Logic Errors: 
        //Program runs, it doesnt crash, but you dont get the expected output.
        //eg: double average = mark1 + mark2 + mark3 / (double)numTests; // <-- it wont do the correct calc


        //Runtime Errors:
        // Program runs, but it does not finish, it encounters an error and crashes.
        //eg: division by 0 <-- it throws an exception
        int number = 7/0;
        System.out.println(number);

        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero <--- This deals with math
        at lesson4.ExampleThree.main(ExampleThree.java:19)
         */



        //Syntax Errors: 
        //Think grammar: error in the java language (forggeting a "" or ; or misspellings in functions), red squiggle, wont run/ compile
        //eg: System.out.println("Hello World);  <-- missing ""




    }
}

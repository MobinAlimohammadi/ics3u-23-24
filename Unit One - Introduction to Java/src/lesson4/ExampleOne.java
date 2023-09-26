package lesson4;

public class ExampleOne {
    public static void main(String[] args) {
        /*casting */
        
        int mark1 = 84, mark2 = 91, mark3 = 97;
        int numTests = 3;

        double average = (mark1 + mark2 + mark3) / (double)numTests; // brackets comes first in the order of operations, then its the casting then the remaining order of operations.
        //double average = ((double)mark1 + mark2 + mark3) / (double)numTests; // double could be any of the numbers in the calculation.
        //double average = (double)(mark1 + mark2 + mark3) / (double)numTests; // this would work too.

        //double average = (double)((mark1 + mark2 + mark3) / (double)numTests); //however this would not work, becuase the casting is after the calculations.
        //when casting from int to double we get more precision, its called a widening conversion.
        System.out.println(average);
    }
}

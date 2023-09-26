package lesson4;

public class ExampleTwo {
    public static void main(String[] args) {
        //int x = 6.7; WOULD NOT WORK, cannot store a double in an int variable

        double y = 7;
        double z = 6.8;

        int number = (int)z; // we lost precision but converted it into an intager temporarily, narrowing conversion.

        System.out.println(number+y);
    }
}

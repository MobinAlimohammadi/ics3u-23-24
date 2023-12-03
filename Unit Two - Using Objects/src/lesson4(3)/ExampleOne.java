public class ExampleOne {
    public static void main(String[] args) {
        for (int i =0; i<15; i++){
            System.out.println((int)(Math.random()*10)+1);

            System.out.println((int)(Math.random()*21)-10); // 21 is the number of possible random values, 0 is also a value -10  -- -1 = 10 values same for possitive and plus 1 for 0 so 21
            int upper =5; 
            int lower = 6;

            System.out.println((int)(Math.random()*upper-lower+1)+lower);
        }
    }

}

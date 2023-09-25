package example;

public class example {
    public static void main(String[] args) {

        String name = ("David");
        System.out.println(name);
        

        int x = 12;
        int age = 18;
        int y = 6;
        double q = 6.0;
        double w = 8.4;

        /* modulus is represented by % */

        System.out.println(x%y);
        System.out.println(x%q);
        System.out.println(age%w);

        int number = 9836; /* to find the different digits and multiply them together */
        int onesdigit = number%10; /* would give us the remainder of number/10 which is the ones digit */
        int tensdigit = number%100/10;
        int hundredsdigit = number%1000/10;
        int thousandsdigit = number%10000;

        System.out.println(onesdigit*tensdigit*hundredsdigit*thousandsdigit);


    }
}

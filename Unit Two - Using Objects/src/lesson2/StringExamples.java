package lesson2;

public class StringExamples {
    public static void main(String[] args) {

        String s1 = new String("Alphabet soup"); // used a constructor

        String s2 = "hello"; // created using a string literal

        String s21 = "happy"; // created using a string literal

        int x = s2.length();

        System.out.println(s2+" HAS " +x+" CHARACTERS");

        System.out.println(s1 + " has a length of "+ s1.length());

        System.out.println("Lester has a length of " + "Lester".length());

        System.out.println("lo in "+s2+" has index of "+ s2.indexOf("lo")); // outputs the index where it starts eg 3
        System.out.println("ello in "+ s2 +" has index of "+ s2.indexOf("ello")); // returns 1
        System.out.println(s2.indexOf("call")); // not in the string so returns -1
        System.out.println(s2.indexOf("Lo")); // returns -1 cus not capital

        String y = "ppy";
        System.out.println(s21.indexOf(y));

        System.out.println(s2.substring(1, s2.length())); // returns from index 1 incl to index number 2 which is lengh non incl so -1.

        String subString1 = s1.substring(5, 8); // we want bet 
        System.out.println(subString1);

        System.out.println(s2.substring(3)); // it automaticlaly goes to the end 

        














    }

}

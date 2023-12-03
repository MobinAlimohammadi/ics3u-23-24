package lesson4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    String s = in.nextLine();

    System.out.println(reverseString(s));

    // String tr = reverseString("abcdefg");
    // System.out.println(tr);
    System.out.println(removeSpaces(s));
    palindromeChecker(s);
    
        
    }

    private static String removeSpaces(String string) {

        return string.replaceAll(" ", "");

    }

    private static void palindromeChecker(String strog) {
        String str="";
        String strrev ="";
        str = removeSpaces(strog);
        strrev = reverseString(str);
        

        if (str.equals(strrev)){
            System.out.println(strog +" is a palindrome");

        }else{
            System.out.println(strog +" is not a palindrome");
        }

    }

    private static String reverseString(String str) {

         String stri = "";

        for(int x = 1; x<= str.length(); x++){
            stri += (String)str.substring(str.length()-x, str.length()-x+1);
    }

    return stri ;
}



}

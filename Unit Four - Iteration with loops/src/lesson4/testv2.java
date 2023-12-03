package lesson4;
import java.util.Scanner;
public class testv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(reverseString(s));
    }
     private static String reverseString(String str) {
        String stri = "";
        for(int x = 1; x<= str.length(); x++){
             stri += (String)str.substring(str.length()-x, str.length()-x+1);
            }
             return stri ;
            }
    }


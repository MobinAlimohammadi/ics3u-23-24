package lesson3;

import java.util.Scanner;

public class ECOOv2 {
    public static void main(String[] args) {
        
        funnipictureframe("Maple");

        Scanner in = new Scanner(System.in);

        System.out.println("");

        System.out.println("enter M for a custom version");
        String M = in.nextLine();
        

        funnipictureframe(M);

    }

    private static void funnipictureframe(String str) {

        System.out.println("");

        System.out.print("*");
        for(int f =1; f<= str.length();f++){
            System.out.print(str.substring(f-1, f));
        }
        System.out.println("*");

        for(int x = 1; x<= str.length(); x++){
            System.out.print(str.substring(str.length()-x, str.length()-x+1));
            for(int xd =1; xd<=str.length();xd++){
                System.out.print("*");
            }
            System.out.print(str.substring(x-1,x));
            System.out.println("");
        }
        System.out.print("*");
        for(int f =1; f<= str.length();f++){
            System.out.print(str.substring(str.length()-f, str.length()-f+1));
        }
        System.out.println("*");

        System.out.println("");
    }

    


}


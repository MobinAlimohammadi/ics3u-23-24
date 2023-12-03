package lesson3;

import java.util.Scanner;

public class ECOO {
    public static void main(String[] args) {
        
        pictureframe(3,4,1,2);

        Scanner in = new Scanner(System.in);

        System.out.println("enter M");
        int M = in.nextInt();
        System.out.println("enter N");
        int N = in.nextInt();
        System.out.println("enter P");
        int P = in.nextInt();
        System.out.println("enter Q");
        int Q = in.nextInt();

        pictureframe(M, N, P, Q);

    }

    private static void pictureframe(int M, int N, int P, int Q) {
        //q*(2p+2q+n) of # -- top 

        for( int x = 0; x<Q ; x++){
            for( int y = 0; y< (P+P+Q+Q+N); y++){
                System.out.print("#");
            }
            System.out.println("");
        }

        //middle part 
        for( int xx = 0; xx<P ; xx++){
            for(int yy =0; yy<Q; yy++){
                System.out.print("#");
            }
            for (int r = 0; r<(P+N+P); r++){
                System.out.print("+");
            }
            for(int yy =0; yy<Q; yy++){
                System.out.print("#");
            }
            System.out.println("");

        }
        
        //top of the picture part 
        for( int xyx = 0; xyx<M ; xyx++){

            for(int yy =0; yy<Q; yy++){
                System.out.print("#");
            }
            for (int r = 0; r<(P); r++){
                System.out.print("+");
            }
            for (int r = 0; r<(N); r++){
                System.out.print(".");
            }
            for (int r = 0; r<(P); r++){
                System.out.print("+");
            }
            for(int yy =0; yy<Q; yy++){
                System.out.print("#");
            }
        System.out.println("");
        }
        
        //middle part 
        for( int xx = 0; xx<P ; xx++){
            for(int yy =0; yy<Q; yy++){
                System.out.print("#");
            }
            for (int r = 0; r<(P+N+P); r++){
                System.out.print("+");
            }
            for(int yy =0; yy<Q; yy++){
                System.out.print("#");
            }
            System.out.println("");

        }

        //q*(2p+2q+n) of # -- bottom

        for( int x = 0; x<Q ; x++){
            for( int y = 0; y< (P+P+Q+Q+N); y++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}

package lesson3;

public class nestedLoopsExample {
    public static void main(String[] args) {
        System.out.println("");
        rectangle(5,4, "*");
        System.out.println("");
        tryangle(5, "*");
        System.out.println("");
        tryangle2(5, "*");
        System.out.println("");
        tryangle3(5,"*");
    }

    private static void tryangle3(int height, String tag) {
                for( int i = 1 ; i <= height ; i++){
            System.out.println();
            for(int n = 1; n<= i-1 ; n++){
                System.out.print(" ");
            }
            for(int n = 0; n<= height-i ; n++){
                System.out.print(tag);
            }
        }

    }

    private static void tryangle2(int height, String tag) {
        for( int i = 0 ; i <= height; i++){
            System.out.println();
            for(int n = 1; n<= height-i ; n++){
                System.out.print(tag);
            }
        }


    }

    private static void tryangle(int height, String tag) {
        for( int i = 1 ; i <= height ; i++){
            System.out.println();
            for(int n = 1; n<= i ; n++){
                System.out.print(tag);
            }
        }

    }

    private static void rectangle(int leng, int wid, String tag) {
        for(int x =1 ; x <= leng ; x++ ){
                    for( int y= 1; y<= wid ; y++){
                System.out.print(tag);
        }System.out.println("");

    }
}
}
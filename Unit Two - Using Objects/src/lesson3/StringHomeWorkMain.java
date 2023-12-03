package lesson3;

public class StringHomeWorkMain {
   
        //attributes 
    private String tag;
    private String word;
    
    public StringHomeWorkMain() {
         
         //tag = tag;
         //word = word;

    }
    public void makeOutWord(String tag, String word){

        String newword = tag.substring(0, 2)+word+tag.substring(2);
         System.out.println(newword);
    }
    public void firstHalf(String evenNumString) {

        if (evenNumString.length()%2>0){
            System.out.println("**ERROR, EVEN LNENGTH STRING NOT ENTERED**");

        }else{
            evenNumString = evenNumString;
            
            int substringlen = ((evenNumString.length())/2);

            System.out.println(evenNumString.substring(0,substringlen));
        }   
    }
    public void withoutEnd(String word){

        String or = word.substring(1,word.length()-1);
        System.out.println(or);

    }
    public void comboString(String A, String B){
        if (A.length()>B.length()){
            System.out.println(B+A+B);
        }
        if (B.length()>A.length()){
            System.out.println(A+B+A);
        }

    }
    public void nonStart(String A, String B){
        String nonA = A.substring(1, A.length());
        String nonB = B.substring(1, B.length());

        System.out.println(nonA+nonB);

    }
    public void left2(String A){
        System.out.println(A.substring(2)+A.substring(0,2));
    }
    public void right2(String A){
        System.out.println(A.substring(A.length()-2)+A.substring(0,A.length()-2));
    }
    public void withoutEnd2(String A2){
        if (A2.length()<2){
            System.out.println("**ERROR, LEGNTH OF STRING MUST BE MORE THAN 2**");
        }else{
            System.out.println(A2.substring(0,2)+A2.substring(0,2));
        }
    }
    public void middleTwo(String A){
        if (A.length()%2 > 0){
            System.out.println("**ERROR, EVEN LNENGTH STRING NOT ENTERED**");
        }else{
            int length = A.length();
            int halfwaypoint = length/2;
            System.out.println(A.substring(halfwaypoint-1,halfwaypoint+1));
        }
    }
    public void nTwice(String A, int B){
        
    }
}

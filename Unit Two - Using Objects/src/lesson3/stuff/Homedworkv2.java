package lesson3.stuff;
public class Homedworkv2{

public class makeOutWord{
        
    //attributes 
    private String tag;
    private String word;

    public makeOutWord(String tag, String word) {
        
        tag = tag;
        word = word;

    }
    public void mainAct(){

        String newword = tag.substring(0, 2)+word+tag.substring(2);
        System.out.println(newword);
    }

   
}

public class firstHalf{

    //attributes 
    private String evenstring;

    public void mainAct(String evenNumString) {

        if (evenNumString.length()%2>0){
            System.out.println("**ERROR, EVEN LNENGTH STRING NOT ENTERED**");

        }else{
            evenNumString = evenNumString;
            
            int substringlen = ((evenNumString.length())/2);

            System.out.println(evenNumString.substring(0,substringlen));
        }

        


            

        }



    }
}


   


package lesson3.stuff;

public class makeOutWord{
        
    //attributes 
    private String tag;
    private String word;

    public makeOutWord() {
        
        //tag = tag;
        //word = word;

    }
    public void mainAct(String tag, String word){

        String newword = tag.substring(0, 2)+word+tag.substring(2);
        System.out.println(newword);
    }

   
}
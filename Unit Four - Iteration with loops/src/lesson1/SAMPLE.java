package lesson1;

public class SAMPLE {
    public static void main(String[] args) {
        
        System.out.println(withoutx("xgooftyx"));
        
    }

    private static String withoutx(String str){
        if(str.substring(0,1).equals("x")){
            str = str.substring(1);
        }if(str.substring(str.length()-1).equals("x")){
            str = str.substring(0,str.length()-1);
        }
        return str;
    }
}

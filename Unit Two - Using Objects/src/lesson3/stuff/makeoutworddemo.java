package lesson3.stuff;

public class makeoutworddemo {
    public static void main(String[] args) {
        
        System.out.println("This program takes the value of a 'tag' and a string and proceeds to merge them together so that the string is encapsulated in the tag.");
        System.out.println();
        System.out.println("Please enter the tag in the following format,");
        System.out.println("[[]]");
            System.out.println("(2 characters each side, wihout a space inbetween and including the closing 2 character tags.)");
            String tag = in.nextLine();
            System.out.println("Please enter string:");
            String word = in.nextLine();

            String newword = tag.substring(0, 2)+word+tag.substring(2);
            System.out.println(newword);
    }
}

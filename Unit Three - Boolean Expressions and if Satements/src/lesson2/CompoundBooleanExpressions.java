package lesson2;

public class CompoundBooleanExpressions {
    public static void main(String[] args) {
        
        boolean happy = true;
        boolean shoes = false;

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true); // it goes from left to right and i both need to be true, then it cuts the ecxpression short cus it already knows it will be false from the first one , the ap exam calls it  a short-circuit expresson
        System.out.println(false && false); // both need to be true for it to be true 

        System.out.println(true || true); //bitwise
        System.out.println(true || false); // true or anthing is true, so it doesnt need to look beyond the first true 
        System.out.println(false || true); // so again its a short circuit expresson
        System.out.println(false || false);
        
    }
}

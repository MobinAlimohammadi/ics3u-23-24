package lesson1;

public class DogTest {
    public static void main(String[] args) {
        

        Dog doggo1 = new Dog("Coco", 2, "A good one");

        doggo1.bark();

        doggo1.feed();
        doggo1.feed();
        boolean cocoispupy = doggo1.isPuppy();
        System.out.println(cocoispupy);

        System.out.println("Coco is "+ doggo1.getAge() + " years old.");


    }
}

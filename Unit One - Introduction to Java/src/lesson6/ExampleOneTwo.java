package lesson6;

import java.util.Scanner;

public class ExampleOneTwo {
    public static void main(String[] args) {
        //createing a program that can find the area of a pool that looks like:

        // ------------------------------------------------------------- <--- length
        // |                                                            |
        // |                                                            | <--- shallowdeapth
        // |       SIDE VIEW                      ---------------------- <--- shallow length
        // |                                    /
        // | <--- deepdeapth                  / <--- transitionlength
        // |                                /
        // --------------------------------- <---- deaplength
        //
        //
        // ______________________________________________________________     <---- length
        // |                                                              |
        // |                                                              |  <---- width
        // |                                                              |
        // |                                                              |
        // |                                                              |
        // |                                                              |
        // |                                                              |
        // |                                                              |
        // _______________________________________________________________
        // 
        //finding the volume , surface area and 90% full volume in liters.
        //
        //
        Scanner in = new Scanner(System.in);

        System.out.println("This program calculates the SA and Volume of a pool in this shape :");
        System.out.println("------------------------------------------------------------- <--- length");
        System.out.println("|                                                            |");
        System.out.println("|                                                            | <--- shallowdeapth");
        System.out.println("|       SIDE VIEW                      ---------------------- <--- shallow length");
        System.out.println("|                                    /");
        System.out.println("| <--- deepdeapth                  / <--- transitionlength");
        System.out.println("|                                /");
        System.out.println("--------------------------------- <---- deaplength");
        System.out.println();
        System.out.println();
        System.out.println("______________________________________________________________     <---- length");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |  <---- width");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |");
        System.out.println("|                                                              |");
        System.out.println("_______________________________________________________________");
        System.out.println();
        System.out.println();


        System.out.println("Would you like to go with the preset values for the lengths? 1 = YES , 2 = NO");
        int x = in.nextInt();

        double length = 0;
        double deepdeapth = 0;
        double shallowdeapth = 0;
        double shallowlength = 0;
        double transition = 0;
        double transitiondeapth = deepdeapth - shallowdeapth;
        double width = 0;

        if (x == 1){

            length = 20;
            deepdeapth = 8;
            shallowdeapth = 3;
            shallowlength = 5;
            transition = 7;
            transitiondeapth = deepdeapth - shallowdeapth;
            width = 8;
            

        }else {
            System.out.println("legnth");
            length = in.nextDouble();
            System.out.println("deapth of deap part , deep deapth");
            deepdeapth = in.nextDouble();
            System.out.println("shallow deapth");
            shallowdeapth = in.nextDouble();
            System.out.println("shalow length");
            shallowlength = in.nextDouble();
            System.out.println("transition");
            transition = in.nextDouble();
            System.out.println("width");
            width = in.nextDouble();
        }

        transitiondeapth = deepdeapth - shallowdeapth;
        double transitionlength = Math.sqrt( (transition*transition)-(transitiondeapth*transitiondeapth) );
        double deeplength = length - (shallowlength + transitionlength);

        double sidearea = (length*deepdeapth)-(((transitiondeapth*transitionlength)/2)+transitiondeapth*shallowlength);
        double volume = sidearea*width;
        System.out.println("The volume is "+volume+" L when fully filled");
        double vol90 = volume * 0.9;
        System.out.println("The 90% full volume is "+vol90+" L");

    }

}

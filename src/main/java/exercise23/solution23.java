/*
   UCF COP3330 Fall 2021 Assignment 23 Solution
   Copyright 2021 Isaac Lynch
 */
package exercise23;

import java.util.Scanner;

class CarProblem {

    Scanner sc = new Scanner(System.in);

    char c;

    public void scn() {

        System.out.print("Is the car silent when you turn the key? ");
        c = sc.next().charAt(0);
    }

    public void prt() {

        if (c == 'y') {

            System.out.print("Are the Battery terminals corroded? ");

            c = sc.next().charAt(0);

            if (c == 'y')

                System.out.println("Battery may not be clean.\nClean the terminals and try starting again.");

            else

                System.out.println("The battery cables may be damaged.\nReplace cables and try again");

        } else {

            System.out.print("Does the car make a slicking noise? ");

            c = sc.next().charAt(0);

            if (c == 'y')

                System.out.println("Battery may be damaged.\nReplace the Battery.");

            else {

                System.out.print("Does the car crank up but fail to start? ");

                c = sc.next().charAt(0);

                if (c == 'y')

                    System.out.println("Spark plug connection may be loose.\nCheck spark plug connection.");

                else {

                    System.out.print("Does the engine start and then die? ");

                    c = sc.next().charAt(0);

                    if (c == 'y') {

                        System.out.println("Does your car have fuel injection? ");

                        c = sc.next().charAt(0);

                        if (c == 'y')

                            System.out.println("Get in it for service.");

                        else

                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else {

                        System.out.println("Sounds like your car should be fine! Take it to a professional and not a computer code next time.");

                    }

                }

            }

        }

    }
}
public class solution23 {

    public static void main(String[] args) {
        CarProblem ca = new CarProblem();
        ca.scn();
        ca.prt();
    }

}
/*
the first thing thats created is that silly goofy class titled carproblems which holds the initialization of
the char 'c' or choice which determines the if else tree that occurs in the prt statement. the scn public
void simply reads in the users first input for if the car is quiet or start up. the prt statement as mentioned
before holds all of the if else trees to find the problem for the user's car. if everything is a no answer
then the code prints out that the user should perhaps take their car to a professional. the main function
in the code then calls these two public voids to run the program.
*/
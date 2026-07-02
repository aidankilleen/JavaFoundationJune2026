package ie.pt;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.io.InvalidObjectException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int calculate(int a, int b) throws CustomException {
        if (a == 0 || b == 0) {
            throw new CustomException ("don't provide zeros");
        } else {
            return a / b;
        }
    }

    public static void main( String[] args ) throws IOException {

        String title = FigletFont.convertOneLine("Exception Investigation");
        System.out.println(title);
        /*
        try {
            String title = FigletFont.convertOneLine("Exception Investigation");
            System.out.println(title);

        } catch(IOException ex) {
            System.out.println("IO problem");
            System.out.println(ex);
        }

         */

        int a = 10;
        int b = 0;
        int answer = 0;
        int[] list = {1, 2, 3, 4};
        String number = "ninety nine";



        int r = (int)(Math.random() * 6);

        //answer = list[4];
        //answer = Integer.parseInt(number);
        //answer = a / b;
        try {
            if (r == 0) {
                answer = a / b; // use an exception to "handle" any errors that occur
            } else if (r == 1) {
                answer = Integer.parseInt(number);
            } else if (r == 2) {
                answer = list[4];
            } else if (r == 3) {
                // you can generate an exception yourself (throw)
                throw new CustomException("you can't choose the number 3");
            } else if (r == 4) {
                answer = calculate(a, b);
            } else {
                answer = 42;    // nothing went wrong
            }
        }

        catch(ArithmeticException aex) {
            System.out.println("Divide by zero");
            answer = 1;
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array Index out of bounds");
            System.out.println(ex.getMessage());
            answer = list[list.length-1];   // take the last item from the list
        }
        catch(CustomException ex) {
            System.out.println("Custom Exception");
            System.out.println(ex.getMessage());
            answer = 3;
        }
        catch(Exception ex) {
            // all other possible problems will trigger this block
            // catch all exception block
            System.out.println("Something else went wrong");
            System.out.println(ex.getMessage());
            answer = 99;
        }
        finally {
            // this code gets run whether an exception is thrown or not
            System.out.println("Answer = " + answer);
        }


        System.out.println("Finished");

        // defensive programming:
        // anticipate all the things that can go wrong
        // and write code to prevent them from happening
        //if (b != 0) {
        //    answer = a / b;
        //} else {
        //    answer = 0;
        //}

        // c - style coding
        // used the return value from a function to determine
        // if it succeeded or not

        // glass is half empty style error handling
        /*
        r = doSomething();
        if (r == -1) {
            // network error
        } else if (r == -2) {
            // parameter error
        } else if (r == -3) {
            // user error
        } else {
            // code ran ok
        }
        r = doSomethingElse();
        if (r == -1) {
            // network error
        } else if (r == -2) {
            // parameter error
        } else if (r == -3) {
            // user error
        } else {
            // code ran ok
        }
        */




    }
}

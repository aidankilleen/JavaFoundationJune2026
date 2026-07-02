// Comments
//  Main.java
//  By: Aidan
//  Date: 29/6/2026

/*
Building Block #1 - Comments
Multi line comment
Both C and C++ style comments are valid in java
*/

public class Main {

    public static void main(String[] args) {

        // print out hello message - avoid stating the obvious!
        // Use comments to explain or remind us about what the code does
        System.out.printf("Hello and welcome!");

        // Building Block #2 - Variables
        // Java is a strongly typed language
        // every variable has a type
        int n = 10;
        // n = "ten"; n can only hold an integer it can't hold a string

        float f = 9.987F;
        double d = 9.12345;
        boolean b = true;

        // int, float, double and boolean are "basic types" or "built-in types"

        // String is an object type
        String name = "Aidan";

        // objects have the values and the methods available using dot notation
        System.out.println(name.toUpperCase());
        //String name2 = new String("");

        // naming convention for variables is lowerCamelCase
        String firstName = "Aidan";
        String first_name = "Aidan";    // it is valid to use underscores but don't!!!

        // name = 10;


        // Building Block #3 - expressions
        int x = 10;
        int y = 20;

        int answer = x + y;

        // use a "cast" to convert an integer into a double
        double dAnswer = (double)x / y;
        System.out.println("The answer is " + dAnswer);

        // aside - shortcut:
        // sout - shortcut for System.out.println();
        System.out.println("");

        // Building block #4
        // loops

        // while loop
        int count = 0;

        while (count < 5) {     // note the loop runs to 4 not 5
            System.out.println(count);
            // count = count + 1;
            // count += 1;
            count++;
        }

        // other types of loops:
        // for loop
        // foreach loop

        // Building Block # 5
        // Conditions

        int t = 10;

        if (t < 5) {
            System.out.println("t is small");
        } else if (t < 10){
            System.out.println("t is medium");
        } else {
            System.out.println("t is large");
        }

        // if your block of code has a single line you can leave out the {}
        // I will never do this and I would recommend that you don't either
//        if (t < 5)
//            System.out.println("t is small");
//        else
//            System.out.println("t is large");

        // switch block - allows multiple conditions

        // ternary operator

        String message = "t is " + (t < 5 ? "small" : "large");

        // the alternative is much longer
        if (t < 5) {
            message = "t is small";
        } else {
            message = "t is large";
        }


        // Building Block #6
        // Array / list
        int[] list = new int[3];
        list[0] = 10;
        list[1] = 20;
        list[2] = 5;

        int[] numbers = {5, 3, 2, 1, 6};

        // this is also valid but the other syntax is preferred
        //int numberList[] = {6, 4, 2, 3, 5};

        System.out.println(numbers.length); //length is a property of the array class

        System.out.println(numbers[0]); // first item has index 0

        // System.out.println(numbers[5]); // index 5 is "out of bounds" - causes a
                                        // runtime error or "Exception"

        // for python people slicing and negative indexes don't work
        // nor can you multiply a string

        System.out.println("################################");
        int index = 0;

        while (index < numbers.length) {
            System.out.println(numbers[index++]);   // java supports ++ syntax like in C++
        }

        System.out.println("############################");
        // there is an alternative for iterating through the items in an array
        // for each loop
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("############################");
        // we can do the exact same using a
        // regular for loop
        // for (initialisation; condition (while this is true); operation to change something)
        for (int num = 0; num < numbers.length; num++) {
            System.out.println(num);
        }

        // Building Block #7
        // Functions / Methods
        System.out.println("println() is a function in the System.out object");

        System.out.println("toUpperCase() is a function in the String object");

        greet("Alice");    // Intellij puts in name: - this is NOT!!!! part of the syntax
        greet("Bob");

        // Building Block #8
        // Objects or Classes
        // in Java (almost) everything is an Object

        Message m = new Message();  // instantiate a Message object

//        System.out.println(m.title);
//        System.out.println(m.text);

        m.display();

        Message m2 = new Message("Message 2", "this is message 2", true);

//        System.out.println(m2.title);
//        System.out.println(m2.text);

        m2.display();

        Message m3 = new Message("Lunch", "Lunch until 13.30", false);
        m3.display();

        String s = "sample string";
        int width = 30;
        System.out.printf("| %-" + width + "s |\n", s);  // left justify
        System.out.printf("| %40s |\n", s);   // right justify

        System.out.println("Finished");

    }
    // public indicates who can call it - public means anyone
    // static - TBD explain this
    // void - the function return type - void means nothing
    // greet - the name of the function.

    // for python people there are no named or default parameters in Java
    public static void greet(String name) {
        System.out.println("Welcome " + name);
    }



}
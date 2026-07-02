public class StaticInvestigation {

    public static void main(String[] args) {

        System.out.println("Static Investigation");


        Message m1 = new Message("Message 1", "This is message 1");
        System.out.println(m1);

        System.out.println(m1.count);   // do not use an instance to access the static variable
        System.out.println(Message.count);  // use the class instead

        Message m2 = new Message("Message 2", "This is message 2");
        System.out.println(m2);
        System.out.println(Message.count);


        // System is a class
        // System.out is a static member variable of the System class
        System.out.println("System.out.println() called");


        // static members are often used for constants
        System.out.println(Math.PI);

        // static methods are often used where we don't really need a
        // class instance
        // Math mt = new Math();    you actually can't instantiate the Math class
        // mt.min()
        double r = Math.random();
        System.out.println(r);

        // there are helper classes for all of the basic data types
        // most often helper methods for conversion
        // and constants for the max and minimum allowed values
        //double d;
        //Double dv;

        double d = Double.parseDouble("1.23456");

        // you can't parse everything into a Double - just numbers
        // d = Double.parseDouble("ninety nine");

        System.out.println("Maximum int:" + Integer.MAX_VALUE);









        
        



        




    }
}

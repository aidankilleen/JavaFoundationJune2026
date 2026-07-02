public class CommonBaseClassInvestigation {

    public static void main(String[] args) {

        System.out.println("Common Base Class");

        Person p = new Person("Alice", "Adams");

        Object o = new Object();

        // Every single class in Java "is-a" Object
        // i.e. a class at the top of the hierarchy
        // "extends Object"
        // this is done implictly

        System.out.println(p.toString());

        // in java if I present any object
        // where java is expecting a string
        // java will implicitly call the toString() method
        System.out.println(p);

        // note - generally supplying toString() override is a
        // very good idea


        // comparing objects
        Person p1 = new Person("Alice", "Adams");
        Person p2 = new Person("Alice", "Adams");

        // nb - do not use == to compare objects
        if (p1 == p2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // use .equals() instead
        // note the default .equals() isn't much use
        if (p1.equals(p2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());


        // What about polymorphism?
        // can I put anything into a list of Object[]
        // yes!
        // but it's not really that useful as the functions
        // in an Object are very limited.
        Object[] objects = {
                new Person("Alice", "Adams"),
                "this is a string",
                new Object()
        };

        for (Object object : objects) {
            System.out.println(object.toString());
        }









    }
}

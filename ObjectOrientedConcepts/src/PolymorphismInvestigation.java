public class PolymorphismInvestigation {

    public static void main(String[] args) {

        System.out.println("Polymorphism Investigation");

        // Note:
        //  you can put an Employee into the array because it "is a" Person
        //  everytime an Employee is created a Person object is implicitly created
        //  the correct .display() function is called
        Person[] people = {
                new Person("Zoe", "Zander"),
                new Employee("Yvonne", "Yang", "E111"),
                new Contractor("Wendy", "Williams", "CPL"),
                new Manager("Xavier", "Xing", "E222", 10)
        };

        for (Person p : people) {
            p.display();

            // instanceof can do the "is-a" relationship test
            if (p instanceof Employee) {
                ((Employee) p).getIdCard(); // we can cast from a Super class to a sub class
            }

            // where does p.getClass() come from???

            // p.
            // getClass() gives me the exact class match
            // it won't match Manager
            //if (p.getClass() == Employee.class) {
            //    ((Employee) p).getIdCard();
            //}
        }
        // Polymorphism
        // The ability to treat objects that are of different types as if they are the same
        // limitation - they must have a common base class.
        // The ability to create a heterogeneous list - a list where each item is potentially
        // a different type.


    }
}

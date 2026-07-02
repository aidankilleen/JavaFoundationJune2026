public class HrSystem {

    public static void main(String[] args) {
// OOP

        // Abstraction - the ability to create an object (data and methods in a reusable unit)
        // Encapsulation - the ability to allow or prevent access to parts of your object (public and private...)
        // Inheritance - the ability to create a new object based on an existing object
        // Polymorphism - the ability to create a list that contains different types (TODO, explain further)

        // Rationale
        // Promote Code reuse - it is easier to reuse and object than it is to reuse a function or library of functions
        // Objects model things in the real world better than functions
        // real world objects have functions (start, stop, speed up, slow down, stop)
        // but they also have properties (engine size, fuel type, number of doors, make, model, colour, etc etc etc)

        // the vast majority of programming languages are OO languages


        // Specification
        // HR System

        //  Employee - firstName, lastName, employeeId
        //  Manager - firstName, lastName, employeeId, headCount
        //  Contractor  -firstName, lastName, agency

        // Inheritance allows us to create a class that is based on another class
        //  Person - firstName, lastName
        //  Employee <- Person (firstName, lastName), employeeId
        //  Contractor <- Person (firstName, lastName), agency
        //  Manager <- Employee(Person(firstName, lastName), employeeId), headCount

        //  D.R.Y. - Don't repeat yourself

        //  Job 1 Create Person class
        Person p = new Person("Alice", "Adams");
        p.display();

        // Job 2 Create Employee class
        Employee e = new Employee("Bob", "Burns", "E12345");
        e.display();

        // Job 3 Create Contractor class
        Contractor c = new Contractor("Carol", "Conway", "CPL");
        c.display();


        // exercise until 10.05
        // create the Manager class
        // Job 4 Create Manager class
        Manager m = new Manager("Danielle", "Dunne", "E4444", 10);
        m.display();


    }
}

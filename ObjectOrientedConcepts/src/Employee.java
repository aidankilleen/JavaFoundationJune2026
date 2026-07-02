public class Employee extends Person {

    // if I repeat firstName and lastName here
    // I'm violating the D.R.Y. rule!
    // private String firstName;
    // private String lastName;

    // with inheritance
    //  1. we get access to the super class members
    //  2. we can add new members (employeeId)
    //  3. we can replace (override) super class functions
    //  4. even if we override we can call the super class version of a function

    protected String employeeID;

    public Employee(String firstName,
                    String lastName,
                    String employeeID) {
        super(firstName, lastName);
        this.employeeID = employeeID;
    }
    public void getIdCard() {
        System.out.println("-".repeat(firstName.length() + lastName.length() + 2));
        System.out.println("Employee:" + employeeID);
        System.out.println(firstName + " " + lastName);
        System.out.println("-".repeat(firstName.length() + lastName.length() + 2));

    }

    @Override
    public void display() {
        System.out.println("Employee.display()");
        //System.out.println(firstName + " " + lastName);
        super.display();
        System.out.println(employeeID);
    }
}

public class Manager extends Employee {

    protected int headCount;

    public Manager(String firstName,
                   String lastName,
                   String employeeID,
                   int headCount) {
        super(firstName, lastName, employeeID);
        this.headCount = headCount;
    }

    @Override
    public void display() {
        System.out.println("Manager.display()");
        //System.out.println(firstName + " " + lastName);
        //System.out.println(employeeID);
        super.display();
        System.out.println("Headcount:" + headCount);

    }
}

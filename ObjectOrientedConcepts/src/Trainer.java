public class Trainer extends Employee
                    implements Teacher {

    public Trainer(String firstName,
                   String lastName,
                   String employeeID) {

        super(firstName, lastName, employeeID);
    }
    @Override
    public void teach() {
        System.out.println("Listen up, class is starting");
    }
}

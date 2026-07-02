public class Contractor extends Person {

    protected String agency;

    public Contractor() {
    }

    public Contractor(String firstName,
                      String lastName,
                      String agency) {
        super(firstName, lastName);
        this.agency = agency;
    }

    @Override
    public void display() {
        System.out.println("Contractor.display()");
        //System.out.println(firstName + " " + lastName);
        super.display();
        System.out.println("Agency:" + agency);
    }
}

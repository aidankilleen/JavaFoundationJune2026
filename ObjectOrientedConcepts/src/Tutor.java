public class Tutor extends Contractor
                    implements Teacher {

    public Tutor(String firstName, String lastName, String agency) {
        super(firstName, lastName, agency);

    }

    @Override
    public void teach() {
        System.out.println("Excuse me, class is starting...");
    }
}

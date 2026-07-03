import java.util.ArrayList;
import java.util.List;

public class InterfaceInvestigation {

    public static void main(String[] args) {

        System.out.println("Interface Investigation");

        Trainer t = new Trainer("Alice",
                                "Adams",
                                "E999");


        t.display();
        t.getIdCard();

        t.teach();

        Tutor tut = new Tutor("Bob",
                        "Burns",
                        "CPL");

        tut.display();
        tut.teach();


        Teacher teacher1 = new Trainer("", "", "");
        Teacher teacher2 = new Tutor("", "", "");

        // we see interfaces a lot in enterprise Java
        // List<T> is an interface that describes the operations of a List
        // ArrayList<T> is an implementation of that interface
        List<Teacher> teachers = new ArrayList<Teacher>();

        // we never instantiate an interface
        // Teacher t = new Teacher();
        // List<String> l = new List<>();

        teachers.add(new Trainer("Alice", "Adams", "E12345"));
        teachers.add(new Tutor("Bob", "Burns", "CPL"));
        teachers.add(new Trainer("Carol", "Conway", "E54321"));
        teachers.add(new Tutor("Dan", "Dunne", "Computer Futures"));

        for(Teacher tchr : teachers) {
            tchr.teach();
        }







    }
}

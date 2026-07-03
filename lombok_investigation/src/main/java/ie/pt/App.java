package ie.pt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Lombok Investigation" );

        User u1 = new User(1, "Alice", "alice@gmail.com", true);
        System.out.println(u1);

        System.out.println(u1.getName());
        u1.setActive(false);

        System.out.println(u1);

        User u2 = new User(1, "Alice", "alice@gmail.com", true);
        u1.setActive(true);
        if (u1.equals(u2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}

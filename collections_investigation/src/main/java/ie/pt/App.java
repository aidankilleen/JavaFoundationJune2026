package ie.pt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Collections Investigation" );

        int[] list = {1, 2, 3, 4};

        System.out.println("length:" + list.length);

        for (int number : list) {
            System.out.println(number);
        }

        // arrays are very limited - we can the length, we can iterate
        // but we can't add an item to an array

        // String users[] = new String[5000];

        // read the items from the db
        // 50
        // 4950 strings allocated for no good reason

        // arrays are not fit for purpose for many use cases
        // use ArrayList class instead



        ArrayList al = new ArrayList();

        al.add(new User(1, "Alice", "alice@gmail.com", true));
        al.add(new User(2, "Bob", "bob@gmail.com", true));
        al.add(new User(3, "Carol", "carol@gmail.com", false));
        al.add(new User(4, "Dan", "dan@gmail.com", true));
        //al.add("this is not a user object");

        for (int i=0; i<al.size(); i++) {

            User u = (User)al.get(i);
            System.out.println(u.getName());
        }

        System.out.println("------------------------------------------");
        // generic syntax augments the ArrayList by adding type-safety
        ArrayList<User> users = new ArrayList<User>();

        users.add(new User(1, "Alice", "alice@gmail.com", true));
        users.add(new User(2, "Bob", "bob@gmail.com", true));
        users.add(new User(3, "Carol", "carol@gmail.com", false));
        users.add(new User(4, "Dan", "dan@gmail.com", true));

        // users.add("this is not a user"); no able to add a String to users

        for (int i=0; i<users.size(); i++) {
            // no need to cast - get returns a User objectg
            System.out.println(users.get(i).getName());
        }


        // note you don't need to repeat the types in the <> in Java
        // lozenge operator - <>
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("Dan");

        System.out.println("----------------------------------------");
        // you can create an ArrayList from a regular array
        String[] userNames = {"Zoe", "Yvonne", "Xavier", "Wendy", "Victor"};
        List<String> userList = new ArrayList<>(Arrays.asList(userNames));

        userList.add("Ultan");
        userList.add("Tom");
        userList.add("Steve");

        for (String userName : userList) {
            System.out.println(userName);
        }

    }
}

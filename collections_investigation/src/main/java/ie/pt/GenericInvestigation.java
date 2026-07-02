package ie.pt;

import java.util.HashMap;
import java.util.HashSet;

public class GenericInvestigation {

    public static void main(String[] args) {


        System.out.println("Further Generic Investigation");

        // a "Set" is a collection that doesn't have any duplicates
        HashSet<String> palette = new HashSet<>();

        palette.add("red");
        palette.add("green");
        palette.add("red");
        palette.add("green");
        palette.add("red");
        palette.add("blue");

        System.out.println(palette);

        HashSet<User> users = new HashSet<>();
        users.add(new User(1, "Alice", "alice@gmail.com", true));
        users.add(new User(2, "Bob", "bob@gmail.com", true));
        users.add(new User(3, "Carol", "carol@gmail.com", false));
        users.add(new User(4, "Dan", "dan@gmail.com", true));
        users.add(new User(1, "Alice", "alice@gmail.com", true));
        users.add(new User(3, "Carol", "carol@gmail.com", false));

        for (User user : users) {
            System.out.println(user);
        }

        // Map - a collection key-value pairs
        // python - dictionary


        int i;
        Integer ii;
        // generic syntax must use a class
        // so use the "wrapper" classes for basic types like int, double etc
        // HashMap<String, int> ages = new HashMap<>();

        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 33);
        ages.put("Bob", 27);
        ages.put("Carol", 50);
        ages.put("Dan", 45);

        System.out.println(ages.get("Bob"));

        HashMap<Integer, User> team = new HashMap<>();

        for (User user : users) {
            team.put(user.getId(), user);
        }

        System.out.println(team.get(3));


        HashMap<User, Integer> teamAges = new HashMap<>();

        User u1 = new User(1, "Alice", "alice@gmail.com", true);
        User u2 = new User(2, "Bob", "bob@gmail.com", true);
        User u3 = new User(3, "Carol", "carol@gmail.com", false);

        teamAges.put(u1, 33);
        teamAges.put(u2, 44);
        teamAges.put(u3, 55);

        System.out.println(teamAges.get(u2));


        // Queue - first in - first out
        // Deque - fifo or lifo (last in - first out)
        // LinkedList
        // TreeSet
        //

        // we'll spend the most time using ArrayList<> and possibly Set<>


        // have a look at DB



        // understand interfaces
        //List<String>ls = new ArrayList<>();









    }
}

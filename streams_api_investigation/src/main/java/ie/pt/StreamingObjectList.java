package ie.pt;

import java.util.Comparator;
import java.util.List;

public class StreamingObjectList {

    public static void main(String[] args) {

        System.out.println("Streaming Object List");
        
        UserDao dao = new UserDao("c:\\work\\training\\java\\userdb.db");
        //dao.createDatabase();

        List<User> users = dao.getUsers();

        List<User> activeUsers = users.stream()
                //.filter(user -> user.isActive())
                .sorted((usera, userb)->{

                    System.out.println("comparing " + usera.getName() + " to " + userb.getName());

                    if (usera.getName().compareTo(userb.getName()) < 1) {
                        // return a negative int if less than
                        return -1;
                    } else if (usera.equals(userb)) {
                        // return 0 if equal
                        return 0;
                    } else {
                        // return a positive int if greater than
                        return 1;
                    }
                })
                .toList();

        // abbreviate the same code
        activeUsers = users.stream()
                .filter(user -> user.isActive())
                .sorted((usera, userb) -> userb.getName().compareTo(usera.getName()))
                .toList();


        for (User u : activeUsers) {
            System.out.println(u);
        }

        // exercise
        // create a list of the users sorted by id in reverse order?
        // 10.30
        System.out.println("--------------------------------");
        List<User> usersSortedById = users.stream()
                .sorted((u1, u2) -> u1.getId() - u2.getId())
                .toList()
                        .reversed();

        usersSortedById.forEach(System.out::println);

        System.out.println("--------------------------------");
        usersSortedById = users.stream()
                .sorted(Comparator.comparing(User::getId))
                .toList()
                .reversed();

        usersSortedById.forEach(System.out::println);

        System.out.println("This doesn't work:");
        users.stream()
            .sorted()
            .toList();

        // how do I make my User "Comparable"
        // interface
        


        dao.close();
        
    }
}

package ie.pt;

import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void myAction(String s) {
        System.out.println(s);
    }

    public static String myMapper(String s) {
        return s.toUpperCase();
    }

    public static void displayUser(User u) {
        System.out.println(u.getName());
    }

    public static void main( String[] args )
    {
        System.out.println( "Streams API Investigation" );

        UserDao dao = new UserDao("C:\\work\\training\\java\\user_stream.db");
        dao.createDatabase();

        // you can stream on any type of object
        List<User> users = dao.getUsers();
        users.forEach(App::displayUser);

        // its quite a bit of work creating these function above -
        // we can define them as we are using them using the following syntax(lambda)
        users.forEach((u) -> {
            System.out.println(u);
        });

        users.stream()
                .map((u)->{
                    return u.getName();
                })
                .toList()
                .forEach((s)->{
                    System.out.println(s);
                });


        // we can use the streams api to filter a list
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> numbers = List.of(nums);

        numbers.forEach(System.out::println);

        System.out.println("Even Numbers:");
        numbers.stream().filter((i) -> {
            if (i % 2 == 0) {
                return true;
            } else {
                return false;
            }
        })
        .toList()
        .forEach(System.out::println);

        System.out.println("Shortened version");
        // shortcut
        // 1. simplify logic
        // 2. if there is only a single parameter leave out ()
        // 3. if you lambda is a single line leave out {} return ;

        System.out.println("Even Numbers:");
        numbers.stream().filter(i -> i % 2 == 0)
        .toList()
        .forEach(System.out::println);

/*

        String[] names = {"alice", "bob", "carol", "dan"};
        //names.stream().forEach();
        List<String> nameList = List.of(names);
        // functions in the streams api often take a function as a parameter

        nameList.forEach(App::myAction);
        Stream<String> s = nameList.stream().map(App::myMapper);
        s.toList().forEach(App::myAction);

        // you can chain the operations together
        nameList.stream()
                .map(App::myMapper)
                .forEach(App::myAction);
*/
        //




    }
}

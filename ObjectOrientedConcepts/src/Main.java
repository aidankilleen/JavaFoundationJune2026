public class Main {

    public static void main(String[] args) {

        System.out.println("OO concepts");

        // Users have
        // id
        // name
        // email
        // active flag

        // display()

        // TDD - Test Driven Development
        // write the test code first!
        User u = new User(1, "Alice", "alice@gmail.com", true);
        u.display();

        // when we create an object
        // we get a new data type
        // that should behave like any other datatype

        String[] names = {"Alice", "Bob", "Carol", "Dan"};

        User[] users = new User[4];
        users[0] = new User(1, "Alice", "alice@gmail.com", true);
        users[1] = new User(2, "Bob", "bob@gmail.com", false);
        users[2] = new User(3, "Carol", "carol@gmail.com", false);
        users[3] = new User(4, "Dan", "dan@gmail.com", true);

        for (User user:users) {
            user.display();
        }


        Member[] members = {
            new Member(1, "Alice", "alice@gmail.com", true),
            new Member(2, "Bob", "bob@gmail.com", false),
            new Member(3, "Carol", "carol@gmail.com", false),
            new Member(4, "Dan", "dan@gmail.com", true)
        };

        for (Member member : members) {
            member.display();
        }


























    }
}

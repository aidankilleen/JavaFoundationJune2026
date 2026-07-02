package ie.pt;

import java.util.List;

public class DAOInvestigation {

    public static void main(String[] args) {

        System.out.println("Data Access Object Investigation");

        UserDao dao = new UserDao();

        dao.deleteUser(1);

        // dao job is to provide all interactions with the database



        // 14.40 - 14.50
        // exercise: add another method to the dao
        User u = dao.getUser(3);
        System.out.println(u);

        // modify user 3
        u.setName("CHANGED");
        u.setEmail("changed@gmail.com");
        u.setActive(!u.isActive());

        User updatedUser = dao.updateUser(u);
        System.out.println(updatedUser);

        // adding a user
        User userToAdd = new User(-1,
                                "new user",
                                "new.user@gmail.com",
                                false);

        User addedUser = dao.addUser(userToAdd);

        System.out.println(addedUser);




        List<User> users = dao.getUsers();

        for (User user : users) {
            System.out.println(user);
        }


        // SELECT * FROM users WHERE id = 1

        // C.R.U.D. operations
        // Create
        // Retrieve
        // Update
        // Delete






        // dao.updateUser(userToUpdate);

        dao.close();
    }
}

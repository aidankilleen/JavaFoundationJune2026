package ie.pt;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    @Test
    public void testGetUsers() {

        UserDao dao = new UserDao();
        List<User> users = dao.getUsers();
        assertNotEquals(0, users.size());
        dao.close();
    }

    // take 10 minutes to 10.45
    // identify something in userDao and write a test for it
    @Test
    public void testAddUser() {

        UserDao dao = new UserDao();
        User newUser = new User(-1, "Alice", "alice@gmail.com", true);
        User addedUser = dao.addUser(newUser);

        // tidy up after the test
        dao.deleteUser(addedUser.getId());

        dao.close();
        // verify that the newly created id is returned
        assertNotEquals(newUser.getId(), addedUser.getId());
    }

    @Test
    public void testApostropheInName() {

        UserDao dao = new UserDao();
        User u = new User(-1,
                        "Alice O'Sullivan",
                        "alice@gmail.com",
                        true);
        u = dao.addUser(u);

        dao.close();
        assertNotNull(u);
    }

    @Test
    public void testSQLInjection() {
        UserDao dao = new UserDao();

        // set up test scenario
        User u = new User(-1, "Alice", "alice@gmail.com", true);
        User addedUser = dao.addUser(u);

        u = new User(-1,
                         "','',0); DELETE FROM users WHERE id=" + addedUser.id + ";--",
                         "",
                        true);
        u = dao.addUser(u);

        // check the test scenario
        addedUser = dao.getUser(addedUser.getId());
        assertNotNull(addedUser);
        dao.close();
    }
    @Test
    public void testSQLInjection2() {
        UserDao dao = new UserDao();

        // set up test scenario
        User u = new User(-1,
                "Alice",
                "alice@gmail.com",
                true);
        User addedUser = dao.addUser(u);

        u = new User(-1,
                "','',0); DROP DATABASE;--",
                "",
                true);
        u = dao.addUser(u);

        // check the test scenario
        addedUser = dao.getUser(addedUser.getId());
        assertNotNull(addedUser);
        dao.close();
    }
    @Test
    public void testUpdateForApostrophes() {

        UserDao dao = new UserDao();

        // exercise to 12.10 - fix updateUser to PreparedStatement
        
        List<User> users = dao.getUsers();
        User userToChange = users.getFirst();
        userToChange.setName(userToChange.getName() + " O'Sullivan");
        dao.updateUser(userToChange);

        User userToCheck = dao.getUser(userToChange.getId());
        assertEquals(userToChange, userToCheck);
        dao.close();

    }

}

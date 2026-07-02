package ie.pt;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    protected UserDao dao;
    protected static String testFileName = "C:\\work\\training\\java\\users_test.db";
    @BeforeAll
    public static void startup() {
        // this is called once for before any test is run
        System.out.println("startup() called");
        UserDao dao = new UserDao(testFileName);
        dao.createDatabase();
        dao.close();
    }
    @AfterAll
    public static void shutdown() {
        // this is called once after all tests are run
        System.out.println("shutdown() called");
    }
    @BeforeEach
    public void setup() {
        // this code can be configured to run before each test
        //System.out.println("setup() called");
        dao = new UserDao(testFileName);
    }
    @AfterEach
    public void treardown() {
        //System.out.println("teardown() called");
        dao.close();
    }

    @Test
    public void testGetUsers() {
        List<User> users = dao.getUsers();
        assertNotEquals(0, users.size());
    }

    // take 10 minutes to 10.45
    // identify something in userDao and write a test for it
    @Test
    public void testAddUser() {

        User newUser = new User(-1, "Alice", "alice@gmail.com", true);
        User addedUser = dao.addUser(newUser);

        // tidy up after the test
        dao.deleteUser(addedUser.getId());

        // verify that the newly created id is returned
        assertNotEquals(newUser.getId(), addedUser.getId());
    }

    @Test
    public void testApostropheInName() {

        User u = new User(-1,
                        "Alice O'Sullivan",
                        "alice@gmail.com",
                        true);
        u = dao.addUser(u);
        assertNotNull(u);
    }

    @Test
    public void testSQLInjection() {

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
    }
    @Test
    public void testSQLInjection2() {

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
    }
    @Test
    public void testUpdateForApostrophes() {

        // exercise to 12.10 - fix updateUser to PreparedStatement

        List<User> users = dao.getUsers();
        User userToChange = users.getFirst();
        userToChange.setName(userToChange.getName() + " O'Sullivan");
        dao.updateUser(userToChange);

        User userToCheck = dao.getUser(userToChange.getId());
        assertEquals(userToChange, userToCheck);
    }
}

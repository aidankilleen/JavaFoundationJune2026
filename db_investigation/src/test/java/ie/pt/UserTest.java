package ie.pt;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testCreateEmptyUser() {
        User u = new User();
        assertNotNull(u);
    }

    @Test
    public void testUserEquality() {
        User u1 = new User(1, "Alice", "alice@gmail.com", true);
        User u2 = new User(1, "Alice", "alice@gmail.com", true);

        assertTrue(u1.equals(u2));
    }

    @Test
    public void testApostropheInName() {
        User u1 = new User(1, "Alice O'Sullivan", "alice@gmail.com", true);

        assertTrue(u1.getName().equals("Alice O'Sullivan"));
    }
}

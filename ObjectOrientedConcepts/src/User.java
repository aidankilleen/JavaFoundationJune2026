public class User {

    // member variables
    private int id;
    private String name;
    private String email;
    private boolean active;

    // member functions
    // constructor(s)
    public User() {

    }
    public User(int id, String name, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
    }
    // other member functions
    public void display() {
        System.out.println("ID:" + id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(active ? "Active" : "Inactive");
    }
}

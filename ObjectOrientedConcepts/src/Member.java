public class Member {

    // member variables
    int id;
    String name;
    String email;
    boolean active;

    public Member() {
    }

    public Member(int id, String name, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
    }

    public void display() {
        System.out.println("ID:" + id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(active ? "Active" : "Inactive");

    }
}

package ie.pt;

import java.util.Comparator;

public class Member implements Comparable<Member> {
    protected int id;
    protected String name;
    protected String email;
    protected boolean active;

    public Member(int id, String name, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int compareTo(Member m) {
        System.out.println("Comparing:" + name + " " + m.getName());
        //return id - m.getId();
        return Comparator.comparing(Member::getEmail)
                .compare(this, m);
    }
}

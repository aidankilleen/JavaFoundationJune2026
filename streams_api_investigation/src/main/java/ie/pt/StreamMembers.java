package ie.pt;

import java.util.ArrayList;
import java.util.List;

public class StreamMembers {

    public static void main(String[] args) {

        System.out.println("Stream Members - Sorted");

        ArrayList<Member> members = new ArrayList<Member>();

        members.add(new Member(15, "Ger", "dan@gmil.com", false));
        members.add(new Member(52, "Bob", "bob@gmil.com", false));
        members.add(new Member(99, "Dan", "dan@gmil.com", false));
        members.add(new Member(19, "Alice", "alice@gmil.com", true));
        members.add(new Member(7, "Eve", "dan@gmil.com", false));
        members.add(new Member(41, "Fred", "dan@gmil.com", false));
        members.add(new Member(3, "Carol", "carol@gmil.com", true));

        List<Member> sortedMembers = members.stream()
                .sorted()       // this works when Comparable<> is implemented
                .toList();

        for (Member m : sortedMembers) {
            System.out.println(m);
        }

    }
}

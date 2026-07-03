package ie.pt;

import java.util.List;

public class StreamsInvestigation {

    public static void main(String[] args) {

        System.out.println("Streams Investigation");

        String[] namesArray = {"dan", "alice", "eve", "yvonne", "carol", "fred", "zoe", "bob"};

        List<String> names = List.of(namesArray);

        names.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .filter(s -> s.length() <= 4)
                .sorted()
                .toList()
                .forEach(System.out::println);

    }
}

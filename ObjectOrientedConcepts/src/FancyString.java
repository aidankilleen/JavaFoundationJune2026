// you can extend a class
// even if you don't have the source code for
// that class!
// except if it is marked as "final"


public class FancyString {

    private String message;
    private ConsoleColours colour;

    public FancyString(String message, ConsoleColours colour) {
        this.message = message;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\u001B[" + colour.value + "m" +
                 message + "\u001B[0m";
    }
}

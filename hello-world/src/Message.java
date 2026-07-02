public class Message {

    // member variables
    // (properties)
    // having "public" member variables is usually a bad idea
    // it is better if these are "private"
    private String title = "Title goes here";
    private String text = "Text goes here";
    private boolean shadow = false;

    // member functions
    // (methods)

    // Constructor
    // function that gets called when a
    // new object is instantiated
    public Message() {
        System.out.println("instantiating a new Message");
        title = "TITLE";   // "this" in Java is the same a "self" in python
        this.text = "TEXT";
    }
    // we can overload (multiple versions) a function
    public Message(String title,
                   String text,
                   boolean shadow) {
        this.title = title;
        this.text = text;
        this.shadow = shadow;
    }

    public void display() {

        int width = Math.max(title.length(), text.length()) + 4;

        System.out.println("┌" + "─".repeat(width-2) + "┐");
        System.out.printf("│ %-" + (width-4)+"s │%s\n", title, "░".repeat(shadow ? 1 : 0));
        System.out.printf("│ %-"  + (width-4)+"s │%s\n", text,"░".repeat(shadow ? 1 : 0));
        System.out.printf("└" + "─".repeat(width-2) + "┘%s\n", "░".repeat(shadow ? 1 : 0));
        if (shadow) {
            System.out.println(" " + "░".repeat(width));
        }
    }


}

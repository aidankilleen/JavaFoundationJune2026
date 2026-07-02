public class UseMessage {

    public static void main(String[] args) {
        System.out.println("UseMessage Class");

        Message m = new Message("Message 1",
                                "This is message 1",
                                true);

        m.display();
        System.out.println();

        //System.out.println(m.title);

        //m.title = "CHANGED THE TITLE";
        Message m2 = new Message("No Shadow",
                                "There is no shadow",
                                false);
        m2.display();

    }
}

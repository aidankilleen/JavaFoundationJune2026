public class Message {

    protected String title;
    protected String text;

    // a static variable is shared
    // between all of the instances

    public static int count = 0;

    public Message(String title, String text) {
        this.title = title;
        this.text = text;
        count++;
    }

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    // finalize method is called by the garbage collection thread
    // we don't know when it will be called
    // we don't know if it will be called
    // it might not be called if the program ends.
    @Override
    protected void finalize() throws Throwable {
        if (count % 10000 == 0) {
            System.out.println("finalize() called:" + count);
        }
        count--;
        super.finalize();
    }
}

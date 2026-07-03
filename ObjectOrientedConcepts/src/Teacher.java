public interface Teacher {

    default void teach() {
        System.out.println("Default teach()");
    };

    default void startLesson() {
        System.out.println("Teaching starting");
    }

    // since java 8
}

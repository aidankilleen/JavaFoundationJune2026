public class Professor implements Teacher {

    @Override
    public void teach() {
        Teacher.super.teach();
    }

    @Override
    public void startLesson() {
        Teacher.super.startLesson();
    }
}

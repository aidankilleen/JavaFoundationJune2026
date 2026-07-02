public class PensionCalculator {

    private int age;

    public PensionCalculator(int age) {
        this.age = age;
    }

    // we make the variable private
    // we provide a "set method"
    public void setAge(int age) {

        // we can validate all changes to the
        // data in a method
        // we can't validate changes if the
        // variable is public

        if (age > 10 && age < 80) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
    public int getAge() {
        return age;
    }

    public double calculate() {
        return age * 10000;
    }
}

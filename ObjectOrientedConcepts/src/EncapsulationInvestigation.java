public class EncapsulationInvestigation {

    public static void main(String[] args) {

        System.out.println("Encapsulation Investigation");

        PensionCalculator pc = new PensionCalculator(40);

        // pc.age = 999;   // people outside the class may not understand the rules

        pc.setAge(41);    // this is a legitmate change

        System.out.println(pc.calculate());

        pc.setAge(999);

        System.out.println(pc.calculate());

        System.out.println(pc.getAge());

    }
}

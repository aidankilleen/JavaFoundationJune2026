public class ColoursInvestigation {

    public static void main(String[] args) {


        System.out.println(Colours.RED);
        System.out.println("is this red?");
        System.out.println(Colours.YELLOW);
        System.out.println("is this yellow?");
        System.out.print("" + Colours.RED_BACKGROUND.toString() + Colours.WHITE.toString());
        System.out.print("red background");

        System.out.println(Colours.RESET);


        System.out.print(Colours.GREEN_BACKGROUND);
        System.out.print(Colours.WHITE);
        System.out.println("green background");
        System.out.print(Colours.RESET);

        System.out.println("Finished");
    }
}

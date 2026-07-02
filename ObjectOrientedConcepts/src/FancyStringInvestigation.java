public class FancyStringInvestigation {



    public static String getDayName(Days d) {
        return "some day..." + d;
    }
    public static void main(String[] args) {

        Days d = Days.Mon;
        System.out.println(getDayName(d));

        if (d == Days.Tue) {

        } else if (d == Days.Sat || d == Days.Sun) {
            // weekend
        }





        // problem
        // this code now needs "magic numbers"
        // we should avoid having numbers like 34 means blue
        // but no context or explanation

        // solution: use an ENUM - enumeration.



        FancyString fs = new FancyString(
                "This is a blue string", ConsoleColours.BLUE);

        System.out.println(fs);

        FancyString fsRed = new FancyString(
                "This is a red string", ConsoleColours.RED);

        System.out.println(fsRed);

        FancyString fsGreen = new FancyString(
                "This is a green string", ConsoleColours.GREEN);

        System.out.println(fsGreen);
        System.out.println("Finished");
    }
}

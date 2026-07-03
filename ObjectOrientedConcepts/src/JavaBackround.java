import java.util.ArrayList;
import java.util.List;

public class JavaBackround {

    public static void main(String[] args) {

        System.out.println("Java Background");

        // Java creators looked at a lot of C C++ code and developed a language that
        // would resolve some problems

        // C++ is OOP - which is good - Java is OOP

        // C and C++ have similar syntax - (), {}, ++, for, while etc etc etc
        // Java has similar structural syntax so Java continues this

        // no uninitialised variables:
        // in C and C++ uninitialised variables cause havoc!!!
        // Java doesn't allow uninitialised variables
        // int a;
        // int answer = a + 10;

        // arrays are a class with features like length and bounds checking
        int[] list = new int[5];

        // in c and c++ there is no way to determine the length
        // in java we can do
        int len = list.length;

        // in c and c++ there is no bounds checking
        list[5] = 9999;     // this causes absolute mayhem!!!!

        // in c and c++ you have to free any dynamically allocated memory
        // or else you will get a memory leak
        // int* x = new int[1000];
        // delete x;

        // in Java we have garbage collection


        // in C++ we have multiple inheritance
        // this causes complexity, difficult in maintenance and performance issues
        // in Java there is no multiple inheritance
        // use an interface where appropriate


        // in C and C++ there is operator overloading
        /*
        String {
            * (int n) {
                return value.repeat(n);
            }
        }
         */
        // in Java there is no operator overloading

        // C++ introduced Exceptions (as an after-thought)
        // Java perfected them - significantly better than the c-style


        // C++ introduced the idea of a templated class
        // in Java we have Generics
        List<String> names = new ArrayList<>();
        names.add("");  // happy to accept a string
        //  names.add(1);   // type safe so I can't add a number

        // C++ there were pointers to a function
        // in java we have lambda expressions or lambda functions instead



        // Enterprise Software Techniques

        //  Use dependency management like maven or possibly gradle
        //  Use TDD - Test Driven Development
        //          - decide how to test before you write the code
        //          - use unit testing tools like JUnit
        //          - other testing tools (Playwright to test your website for ex)
        //  Use Continuous Integration - automatically build projects when check in
        //                              - deploy in a single-click.
        //                              - keep running the automated tests
        //  Use Design Patterns - there are well known solutions for common requirements
        //                      these are documented as "Design Patterns"
        //                      use as appropriate - e.g. Data Access Object
        //  Coding to Interfaces rather than Implementations - allows you to easily
        //                      swap implementations- eg OracleDao, SqliteDao, MysqlDao
        //                      all code just references the UserDao and the implementation
        //                      is hidden
        //  Use self-documenting comments - JavaDoc comments
        //  Annotation Driven Development - use annotations instead of inheritance
        //  Use Version Control - git
        //  Externalise Configuration - no hard-coded filenames or other configuration items
        //                              use .properties files for config values
        //                              no usernames or passwords in code!!!







































    }
}

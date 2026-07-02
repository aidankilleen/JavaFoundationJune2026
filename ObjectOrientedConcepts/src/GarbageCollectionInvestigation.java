public class GarbageCollectionInvestigation {

    public static void main(String[] args) {

        System.out.println("Garbage Collection Investigation");

        int x = 100;    // this variable is on stack

        int list[] = new int[10000];    // this memory is dynamically allocated
                                        // stored in "heap"

        // garbage collection is a huge improvement over the C++ and C mechanisms
        // int cpplist[] = new int[10000];

        // delete cpplist; // when no longer needed.
        // this sounds easy but is incredibly difficult


        for (int i=0; i<1000000; i++) {
            Message m = new Message("test", "test");
            if (i%10000 == 0) {
                System.out.println("i=" +i + "    count:" + Message.count);
            }
        }
        System.out.println("Final message count:" + Message.count);

    }   // x goes out of scope here - memory is freed up
        // list goes out of scope here -
        // the memory associated with list is "marked for garbage collection"
        // java will automatically free the memory that was allocated using "new"
        // sometime - when it feels like it - we can't determine when
}

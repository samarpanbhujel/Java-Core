// Comparator interface is used to order the objects of user-defined class.

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Demo4 {
    public static void main(String[] args) {
        Comparator <String> comp = new Comparator<String> () {
            public int compare(String arg0, String arg1) {
                if (arg0.length() > arg1.length()) {
                    return 1;
                } else if (arg0.length() < arg1.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
            
        };
        List <String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Ave");

        Collections.sort(names, comp);
        System.out.println(names);
    }
}

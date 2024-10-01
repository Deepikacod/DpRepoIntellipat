package learnmore;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        s.add(12);
        s.add(16);
        s.add(18);
        s.add(16);   //duplicate value will not be stored
        System.out.println(s);
    }
}

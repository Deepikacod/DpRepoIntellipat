package learnmore;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(24);
        System.out.println(l);
        l.add(100);
        l.add(240);
        System.out.println(l);
        System.out.println(l.get(3));


        List<String> l2 = new ArrayList<String>();
        l2.add("lmti");
        l2.add("learnmore");
        System.out.println(l2);

    }
}

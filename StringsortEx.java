package javapj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringsortEx {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ameen");
        l.add("Teja");
        l.add("Hari");

        System.out.println("Before sorting: " + l);

        Collections.sort(l);

        System.out.println("After sorting: " + l);
    }
}

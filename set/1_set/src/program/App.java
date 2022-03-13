package program;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        System.out.println(set.contains("Notebook"));
        System.out.println("---------");
        set.removeIf(x -> x.contains("Tablet"));
        for (String p : set) {
            System.out.println(p);
        }

    }
}

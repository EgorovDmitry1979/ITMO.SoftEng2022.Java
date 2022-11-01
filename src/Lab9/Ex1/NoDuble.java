package Lab9.Ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoDuble {
    public static void noDubble(List<String> list) {
        Set<String> set = new HashSet<>(list);

        System.out.println(set);
    }
}



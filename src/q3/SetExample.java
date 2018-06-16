package q3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author flo
 * @since 16/06/2018.
 */
public class SetExample {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(23);
        set.add(23);

        Set<Integer> set2 = new HashSet<>();
        set2.add(23);
        set2.add(10);

        System.out.println(set.equals(set2));

        System.out.println(set.size());

        for(Integer elem : set) {
            System.out.println(elem);
        }
    }
}

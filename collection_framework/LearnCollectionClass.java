import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        // creating arraylist
        List<Integer> list = new ArrayList<>();

        // add data in list
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(0);
        System.out.println(list);

        // sort the collection
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // get the minimum/maximum
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

    }
}

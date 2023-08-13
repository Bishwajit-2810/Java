import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        // creating arraylist
        List<Integer> list = new ArrayList<>();

        // add data in list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        // add in positionm
        list.add(3, 55);
        System.out.println(list);

        List<Integer> ls = new ArrayList<>();
        ls.add(44);
        ls.add(54);
        System.out.println(ls);

        // changer or update the value in list
        list.set(5, 500);
        System.out.println(list);

        // to check if the data is in the list
        // returns true or false
        System.out.println(list.contains(500));

        // add two list one after another
        list.addAll(ls);
        System.out.println(list);

        // add two list in positon
        list.addAll(3, ls);
        System.out.println(list);

        // get mathod to get data from specific index
        System.out.println(list.get(4)); // index start fron 0

        // remove data from specific index
        list.remove(5);
        System.out.println(list);

        // remove the element with passed value
        // if maltiple only the first one by iteration will be removed
        list.remove(Integer.valueOf(44));
        System.out.println(list);

        // iterate the list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        for (Integer ii : list) {
             System.out.print(ii+ " ");
        }
        System.out.println();

        // remove/clear the whole list
        list.clear();
        System.out.println(list);

    }

}
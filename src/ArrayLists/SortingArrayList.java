package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(6);

        System.out.println(list);
        Collections.sort(list); //ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //comparator fnx-logic
        System.out.println(list);

    }
}

package ArrayLists;
import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int findMax = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (findMax < list.get(i)) {
                findMax = list.get(i);
            }
        }
        System.out.println(findMax);
    }
}
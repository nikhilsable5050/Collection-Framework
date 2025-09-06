package ArrayLists;
import java.util.ArrayList;

public class Operations {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //get  - O(1)
        int element = list.get(2);
        System.out.println(element);

        //remove   -O(n)
        list.remove(3);
        System.out.println( "Remove Operation "+list );

        //set     -O(n)
        list.set(2,69);
        System.out.println("Set Operation " + list);

        //contains
        //list.contains(..);
        System.out.println("Element exits or not : " + list.contains(1));

        //size
        //list.size();
        System.out.println("Size of ArrayList : " + list.size());

        //print the ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print( list.get(i));
        }
        System.out.println();
    }

}

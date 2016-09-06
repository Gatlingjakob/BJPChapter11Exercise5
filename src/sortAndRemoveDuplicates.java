import java.util.*;


/**
 * Created by Jakob on 31-08-2016.
 */
public class sortAndRemoveDuplicates {

    public static void main (String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(7, 4 -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9));

        System.out.println(sortAndRemoveDuplicate(list));


    }
    public static Set<Integer> sortAndRemoveDuplicate (ArrayList<Integer> list){

        Set<Integer> set= new TreeSet<Integer>();

        //Collections.sort(list);

        for (int i = 0; i < list.size(); i++){
            set.add(list.get(i));
        }

        return set;

    }




}


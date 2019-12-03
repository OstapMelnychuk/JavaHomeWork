package Collections;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Coll coll = new Coll();
//        coll.AddInt();
//        coll.Add_RandomInt();
//        coll.AddFromAnotherColl(newcollect);
//        coll.SortColl();
//        coll.ShowToConsole();

        List <Integer> newcollect = new ArrayList(Arrays.asList(111, 222, 333));


        ArrayList <Integer> list = new ArrayList <>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }

        System.out.println(list);

        if (list.contains(5)) {
            System.out.println("instead five will be six ");
            list.remove((Integer) 5);
            list.add(6);
        }

        Collections.sort(list);      //sort
        System.out.println(list);


        list.addAll(newcollect);            //combine two collections (merge)
        System.out.println(list);




    }
}










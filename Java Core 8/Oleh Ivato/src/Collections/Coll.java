package Collections;

import java.util.*;

public class Coll {
    private List <Integer> name;
    private Random random = new Random();

    Coll() {
        name = new ArrayList <>();
    }

    public void AddInt() {
        name.add(3);
        name.add(2);
        name.add(1);
    }

    public void Add_RandomInt() {
        for (int i = 4; i < 10; i++) {
            name.add(random.nextInt(64));
        }
    }

//    public void If_Contain_Remove(Integer i) {
//        if (name.contains(i)) {
//            name.remove(i);
//        } else {
//            name.add(i);
//        }
//    }


    public void SortColl() {
        Collections.sort(name);
    }

    public void AddFromAnotherColl(Collection <Integer> collection) {
        for (Integer i : collection) {
            if (!name.contains(i)) ;
            name.add(i);
        }
    }

    public void ShowToConsole() {
        for (Integer i : name) {
            System.out.println(i);
        }
    }
}
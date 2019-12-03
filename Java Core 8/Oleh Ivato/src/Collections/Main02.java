package Collections;

import java.util.*;

public class Main02 {


    public static void main(String[] args) {
        String[] Animal = {"Elephant", "Deer", "Fish", "2", "Cat", "Dog", "Bird", "Butterfly", "Chicken", "Panda", "5", "Lobster"};
        String[] alph = {"One", "two", "three", "4", "five"};


        ArrayList <String> listSECOND = new ArrayList <String>(Arrays.asList(alph));
        ArrayList <String> list = new ArrayList <String>(Arrays.asList(Animal));


        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(random.nextInt(list.size())));
        }


        for (int i = 0; i < 3; i++) {
            list.add(i+"Word ");
        }
        System.out.println(list);


        list.addAll(listSECOND);

        Collections.sort(list);

        if (list.contains("One")) {
            list.remove("One");
            list.add("Six");
        }
        System.out.println(list);
    }
}
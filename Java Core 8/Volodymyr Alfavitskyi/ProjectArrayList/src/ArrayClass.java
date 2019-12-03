import java.util.ArrayList;
import java.util.List;

public class ArrayClass <T>  {
     private List<String> cities = new ArrayList<>();

    public ArrayClass() {
        cities = new ArrayList<>();
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(String name) {
        cities.add(name);
    }
    public int getSize (){
        int size;
        size = cities.size();
        return size;
    }
    public void showItems (){
        for (String s:cities) {
            System.out.println(s);
        }
    }
    public void replacement(int index, String newName){
        cities.remove(index);
        cities.add(index,newName);
        showItems();
    }

}

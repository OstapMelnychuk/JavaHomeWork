import java.util.ArrayList;

public class Array {
    private ArrayList list;

    public Array() {
        this.list = new ArrayList();
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList object) {
        list.add(object);
    }

    public void setList(int i) {
        list.add(i);
    }

    public void setList(long l) {
        list.add(l);
    }

    public void setList(float v) {
        list.add(v);
    }
}

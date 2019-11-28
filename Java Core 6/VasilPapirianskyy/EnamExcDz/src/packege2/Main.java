package packege2;

public class Main {
    public static void main(String[] args) {

        InfoUzer[] arr = InfoUzer.values();
        for (InfoUzer d: arr) {
            System.out.println(d + ": " + d.getDey() + "." + d.getMaunt() + "." + d.getYear());
        }
    }
}

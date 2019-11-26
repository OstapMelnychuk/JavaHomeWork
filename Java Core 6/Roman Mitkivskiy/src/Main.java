import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Avto avto = new Avto(i);
        try {
            avto.bio();
        } catch (Excep excep) {
            System.out.println("Error");
        }


    }
}

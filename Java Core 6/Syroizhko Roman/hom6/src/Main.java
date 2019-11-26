import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1.Life");
        System.out.println("2.Vodafone");
        System.out.println("3.Kyivstar");
        System.out.println("Виберіть оператора");
        User user=new User(scn.nextInt());
        user.phone();


    }
}

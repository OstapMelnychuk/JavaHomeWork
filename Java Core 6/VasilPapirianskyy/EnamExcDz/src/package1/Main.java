package package1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean w;
        do {
            System.out.println("Введіть логін довжиною від 4 до 8 символів");
            Login login = new Login(scanner.nextLine());
            try {
                login.checkLogin();
                w = false;
            } catch (MyExc e) {
                System.out.println("Невірний ввід, довжина логіну повина бути від 4 до 8 символів");
                w = true;
            }
        }while (w);
    }
}

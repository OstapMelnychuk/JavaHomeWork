package program;

public class Main {
    public static void main(String[] args) {
        //enum
       Info info = new Info();
       info.information();
       System.out.println();
       info.sum();
       System.out.println();

       //exception
       Client client = new Client(0,true);
        try {
            client.drinkCoffee();
        } catch (MyException e) {
            System.out.println("Провірка грошей");
            System.out.println(client.getMoney());
            System.out.println("Провірка вподобань");
            System.out.println(client.isLikeCoffee());
            e.printStackTrace();
        } finally {
            System.out.println("Дякую за увагу!");
        }
    }
}

package Enum;

public class Main {

    public static void main(String[] args) {
        String driver = "The driver finished ";

        Enum01 enum01 = Enum01.THIRD;
        System.out.println(driver + enum01);

        Place place = new Place("Oleh");
        place.Medal(enum01);

        System.out.println();
        int result = Enum02.MULTYPLY.calculate(5, 5);
        System.out.println(result);

    }
}

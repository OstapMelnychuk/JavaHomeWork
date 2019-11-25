public class Main {
    public static void main(String[] args) throws MyException {

        Seasons season = new Seasons();
        CountDays countDay = new CountDays();
//      Month m = Month.APRIL;
//      Month m1 = Month.AUGUST;
//      CountDays c = new CountDays();
//        System.out.println(m.getDays() + m1.getDays());
//        System.out.println(Month.DECEMBER.getDays()+Month.FEBRUARY.getDays());
//
//        Month [] month = Month.values();
//        for (Month mn: month) {
//            System.out.println(mn.toString().toLowerCase()+" " + mn.getDays());
//        }
//        System.out.println(Month.JANUARY.ordinal());
//        System.out.println(season.Winter());
//        System.out.println("В зимі є "+countDay.daysWinter()+" днів");
//        System.out.println("В році "+countDay.daysYear() +" днів");

        System.out.println("You chose "+ season.showMonth());

    }
}


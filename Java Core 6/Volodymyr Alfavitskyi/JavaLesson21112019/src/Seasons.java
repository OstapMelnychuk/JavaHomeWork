import java.util.InputMismatchException;
import java.util.Scanner;

public class Seasons  {

    public String Winter (){
        return Month.DECEMBER.getNameUkr()+Month.JANUARY.getNameUkr()+Month.FEBRUARY.getNameUkr();
    }
    public String showMonth () throws MyException {
        String monthSh = "";
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month...");
        int numMonth = sc.nextInt();
        if (numMonth >0 && numMonth <13 ){
        Month [] month = Month.values();
        for (Month mn: month) {
            if (mn.ordinal()==numMonth-1){
                     monthSh = mn.getNameUkr();
            }
            else {}}
  }
        else throw new MyException();
        } catch (InputMismatchException e) {
        e.getMessage();
            System.out.println("Incorrect value filled");
        }
        return monthSh;
    }

}

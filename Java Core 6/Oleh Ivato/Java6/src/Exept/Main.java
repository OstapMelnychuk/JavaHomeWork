package Exept;

public class Main {
    public static void main(String[] args) {     // throw Exept
        CustomsExeptions customsExeptions = new CustomsExeptions(false, true, false);

        try {
            customsExeptions.Customs();
        } catch (Exept exept) {
            System.out.println("What exactly went wrong :");
            System.out.println("Red Line is: " + customsExeptions.isRedLine());
            System.out.println("Green Line is: " + customsExeptions.isGreenLine());
            System.out.println("Declare is: " + customsExeptions.isDeclare());

        }

        System.out.println();
        NumbersExeptions numbersExeptions = new NumbersExeptions(1, 2, 3);

        try {
            numbersExeptions.Numbers();
        } catch (Exept exept) {
            System.out.println("check numbers, they must be on right order from 1 to 3.");
            System.out.println(numbersExeptions.getNumber1());
            System.out.println(numbersExeptions.getNumber2());
            System.out.println(numbersExeptions.getNumber3());
        }


    }

}


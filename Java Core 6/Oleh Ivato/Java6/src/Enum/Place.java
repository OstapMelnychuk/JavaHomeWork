package Enum;

public class Place {
    private String name;

    private String ChooseAgain() {
        String again = ", you can try race again.";
        return again;
    }

    public Place(String name) { this.name = name; }

    public void Medal(Enum01 en) {
        switch (en) {

            case FIRST: System.out.print(", and won the Gold medal.");break;
            case SECOND: System.out.print(", and won the Silver medal.");break;
            case THIRD: System.out.print(", and won the Bronze medal.");break;
            case FOURTH: System.out.println("The racer took fourth place");break;

            case TENTH: System.out.println("Unfortunately your place tenth " + ChooseAgain());break;
            case ELEVENTH: System.out.println("Unfortunately your place eleventh " + ChooseAgain());break;
            case TWELFTH: System.out.println("Unfortunately your place twelfth " + ChooseAgain());break;

            default: System.out.println("Good");break;

        }
    }
}

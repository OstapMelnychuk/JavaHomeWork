package Exept;

public class NumbersExeptions {


    private int number1;
    private int number2;
    private int number3;

    public NumbersExeptions(int number1, int number2, int number3) {

        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }


    public void Numbers() throws Exept {
        if (number1 == 1 && number2 == 2 && number3 == 3) {
            System.out.println("everything okay");
        } else if (number1 == 2 || number1 == 3 && number2 == 1 || number2 == 3 && number3 == 1 || number3 == 2) {
            System.out.println("please use right order");
        } else if (number1 > 3 && number1 < 10 || number2 > 3 && number2 < 10 || number3 > 3 && number3 < 10) {
            System.out.println("You entered a number that is larger than 3, and less then 10, please use only numbers from 1 to 3 ");
        } else {
            throw new Exept("Something went wrong.");
        }
    }

    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public int getNumber3() {
        return number3;
    }
    public void setNumber3(int number3) {
        this.number3 = number3;
    }


}

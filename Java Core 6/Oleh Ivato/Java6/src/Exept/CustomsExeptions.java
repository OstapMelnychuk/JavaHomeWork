package Exept;

public class CustomsExeptions {

    private boolean redLine;
    private boolean greenLine;
    private boolean declare;


    public CustomsExeptions(boolean redLine, boolean greenLine, boolean declare) {
        this.redLine = redLine;
        this.greenLine = greenLine;
        this.declare = declare;

    }



    public void Customs() throws Exept {
        if (redLine == false && greenLine == true && declare == false) {
            System.out.println("You can go");
        }
        else  if (declare == true ) {
            System.out.println("First, you need to declare some things.");
        }
        else  if (redLine == true){
            System.out.println("Wait for Green Line.");
        }
        else {
            throw new Exept("Check again");
        }
    }


    public boolean isRedLine() {
        return redLine;
    }
    public void setRedLine(boolean redLine) {
        this.redLine = redLine;
    }
    public boolean isGreenLine() {
        return greenLine;
    }
    public void setGreenLine(boolean greenLine) {
        this.greenLine = greenLine;
    }
    public boolean isDeclare() {
        return declare;
    }
    public void setDeclare(boolean declare) {
        this.declare = declare;
    }



}
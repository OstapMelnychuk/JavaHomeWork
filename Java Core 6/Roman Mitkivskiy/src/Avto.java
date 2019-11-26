import java.util.Scanner;

public class Avto {

    private int i;

    public Avto(int i) {
        this.i = i;
    }

    public void bio () throws Excep {
        if (i <= 7) {
            switch (i) {
                case 1:
                    System.out.println("Маша марка " + Cars.MERCEDES + " Model: " + Cars.MERCEDES.getModel() + " Engine: " + Cars.MERCEDES.getEngine());
                    break;
                case 2:
                    System.out.println("Vasha marka " + Cars.AUDI + " Model: " + Cars.AUDI.getModel() + " Engine: " + Cars.AUDI.getEngine());
                    break;
                case 3:
                    System.out.println("Vasha marka " + Cars.MAZDA + " Model: " + Cars.MAZDA.getModel() + " Engine: " + Cars.MAZDA.getEngine());
                    break;
                case 4:
                    System.out.println("Vasha marka " + Cars.FERARI + " Model: " + Cars.FERARI.getModel() + " Engine: " + Cars.FERARI.getEngine());
                    break;
                case 5:
                    System.out.println("Vasha marka " + Cars.OPEL + " Model: " + Cars.OPEL.getModel() + "Engine: " + Cars.OPEL.getEngine());
                    break;
                case 6:
                    System.out.println("Vasha marka " + Cars.RENAUT + " Model: " + Cars.RENAUT.getModel() + " Engine: " + Cars.RENAUT.getEngine());
                    break;
                case 7:
                    System.out.println("Vasha marka " + Cars.BMW + " Model: " + Cars.BMW.getModel() + " Engine: " + Cars.BMW.getEngine());
                    break;
            }
        }else {
            throw new Excep("Erro");
        }
    }

}

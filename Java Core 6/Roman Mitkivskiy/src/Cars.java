import java.util.Scanner;

public enum Cars {
    MERCEDES(2.0,"CLA 220"),
    AUDI(2.2,"A6, S-line"),
    MAZDA(1.6,"323"),
    FERARI(5.0,"Italia"),
    OPEL(1.3,"Cadet"),
    RENAUT(1.4,"Cengo"),
    BMW(2.5,"M5, F90");

    private double engine;
    private String model;

    Cars(double engine, String model) {
        this.engine = engine;
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }



}

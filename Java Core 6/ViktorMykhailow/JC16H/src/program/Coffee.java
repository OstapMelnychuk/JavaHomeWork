package program;

public enum Coffee {
    SMALL("Маленька",200, 25),  MEDIUM("Середня",300, 30), LARGE("Велика",400, 35);

    String name;
    int ml;
    int price;

    Coffee(String name, int ml, int price) {
        this.ml = ml;
        this.price = price;
        this.name = name;
    }

    public int getMl() {
        return ml;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

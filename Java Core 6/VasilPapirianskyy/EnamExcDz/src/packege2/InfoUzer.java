package packege2;

public enum InfoUzer {
    UZER1(11,2,1998),
    UZER2(25,1,1996),
    UZER3(15,6,2000);

    private int dey;
    private int maunt;
    private int year;

    InfoUzer(int dey, int maunt, int year) {
        this.dey = dey;
        this.maunt = maunt;
        this.year = year;
    }

    public int getDey() {
        return dey;
    }

    public int getMaunt() {
        return maunt;
    }

    public int getYear() {
        return year;
    }
}

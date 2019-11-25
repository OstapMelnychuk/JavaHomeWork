public enum Month {
    JANUARY(31, "Січень"),
    FEBRUARY(28, "Лютий"),
    MARCH(31, "Березень"),
    APRIL(30, "Квітень"),
    MAY(31, "Травень"),
    JUNE(30, "Червень"),
    JULY(31, "Липень"),
    AUGUST(31, "Серпень"),
    SEPTEMBER(30, "Вересень"),
    OCTOBER(31, "Жовтень"),
    NOVEMBER(30, "Листопад"),
    DECEMBER(31, "Грудень");


    private final String nameUkr;
    private int days;

    Month(int days, String nameUkr) {
        this.days = days;
        this.nameUkr = nameUkr;
    }

    public String getNameUkr() {
        return nameUkr;
    }

    //public  Month [] month = Month.values();
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

}


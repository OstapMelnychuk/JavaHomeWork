package program;

class Info {
    Coffee coffee = Coffee.SMALL;
    void information(){
        switch (coffee){
            case SMALL:
                System.out.println("Маленька");
                break;
            case MEDIUM:
                System.out.println("Середня");
                break;
            case LARGE:
                System.out.println("Велика");
                break;
        }

        System.out.println();
        for (Coffee c : Coffee.values()) {
            System.out.println(c.getName() + "(" + c.getMl() + ") - " + c.getPrice() + "грн");
        }
        System.out.println();
        for (Coffee c1 : Coffee.values()) {
            System.out.println("Індекс поля " + c1.getName() + " - " + c1.ordinal());
        }
    }

    void sum(){
        System.out.println("Загальна сума - " + (Coffee.SMALL.getPrice() + Coffee.MEDIUM.getPrice() + Coffee.LARGE.getPrice()) + " грн");
        System.out.println("Загальний об'єм - " + (Coffee.SMALL.getMl() + Coffee.MEDIUM.getMl() + Coffee.LARGE.getMl()) + " мл");
    }
}

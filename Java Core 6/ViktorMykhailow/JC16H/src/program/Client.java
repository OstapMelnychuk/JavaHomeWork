package program;

 class Client extends Info {

    private int money;
    private boolean likeCoffee;
    private boolean buyCoffee;


    Client(int money, boolean likeCoffee) {
        this.money = money;
        this.likeCoffee = likeCoffee;
    }


    void drinkCoffee() throws MyException {
        if (money >= coffee.getPrice()) {
            buyCoffee = true;
        }
        if (money <= coffee.MEDIUM.getPrice() && buyCoffee && likeCoffee) {
            System.out.println("Ви можете випити маленьку каву!");
        } else if(money >= coffee.MEDIUM.getPrice() && money <= coffee.LARGE.getPrice() && buyCoffee && likeCoffee){
            System.out.println("Ви можете випити малу або середню каву!");
        }else if(money >= coffee.LARGE.getPrice() && buyCoffee  && likeCoffee){
            System.out.println("Ви можете випити малу або середню або велику каву!");
        }else {
            throw new MyException("Ви не можете випити каву, провірте статус!");
        }
    }

    int getMoney() {
        return money;
    }
    boolean isLikeCoffee() {
        return likeCoffee;
    }

}

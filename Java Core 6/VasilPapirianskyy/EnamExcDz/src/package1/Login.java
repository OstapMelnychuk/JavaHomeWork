package package1;

public class Login {
    private String login;

    public Login(String login) {
        this.login = login;
    }

    public void checkLogin() throws MyExc{
        if ((this.login.length() >= 4) && (this.login.length() <=8)){
            System.out.println("Ваш логін: " + this.login);
        } else {
            throw new MyExc("Невірний ввід логіну");
        }
    }
}

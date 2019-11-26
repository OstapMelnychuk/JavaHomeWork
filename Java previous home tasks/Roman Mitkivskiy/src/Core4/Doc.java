package Core4;

public class Doc extends Human  implements Sleeping{
    public Doc(String name, int age, int telefon) {
        super(name, age, telefon);
    }
    @Override
    public void bio(){
        System.out.println("Age " + getAge() + ". Telefon " + getTelefon());
    }
    public void sleep(){
        System.out.println(getName() + " is sleeping");
    }
}

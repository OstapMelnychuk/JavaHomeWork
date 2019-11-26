package Core4;

public class Driver extends Human implements Eating{
    public Driver(String name, int age, int telefon) {
        super(name, age, telefon);
    }

    @Override
    public void bio () {
        System.out.println("Name " + getName());
    }

    public void eat(){
        System.out.println(getName() + " is eating.");
    }
}

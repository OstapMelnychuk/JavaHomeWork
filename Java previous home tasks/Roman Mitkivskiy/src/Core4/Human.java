package Core4;

public class Human {
    private String name;
    private int age;
    private int telefon;

    public Human(String name, int age, int telefon) {
        this.name = name;
        this.age = age;
        this.telefon = telefon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void bio(){
        System.out.println("Name " + name + ". Age " + age + ". Telefon " + telefon);
    }

}

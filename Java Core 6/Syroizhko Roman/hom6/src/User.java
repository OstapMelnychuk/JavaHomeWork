import java.util.Random;

public class User {
    private int ask;
    public User(int ask) {
        this.ask = ask;

        try {
            generataNumber();
        }catch (Work e){
            System.out.println(" number ");
        }

    }

    public void phone(){
        if (ask==1){
            NUMBER life = NUMBER.LIFE;
            System.out.println("Ваш оператор " + life+" 063");
        }else if (ask==2){
            NUMBER vodafone=NUMBER.VODAFONE;
            System.out.println("Ваш оператор "+vodafone+" 066");
        }else if (ask==3){
            NUMBER kyivstar=NUMBER.KIEV;
            System.out.println("Ваш оператор "+kyivstar+" 067");
        }else {
            System.out.println("Неправильний оператор ");

        }
    }


    public  void generataNumber() throws Work {
        System.out.println("Згенерований  номер ");
        double ran = Math.random()*1001001;
        String str = ""  + (int)ran;
        String zero =  "";
        if (str.length() < 7)
        {
            int i = 7 - str.length();
            for(int j = 0; j <= i; j++){
                zero += "0";
            }
            str = zero + str;


        }else {
            throw  new Work("Дане число є більше ніж розмір номера");
        }
        System.out.println(str);

    }



}

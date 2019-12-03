import java.util.*;

public class Countries<S> {
   private List<String> countries;

    public Countries (){
       this.countries = new ArrayList<>();
   }
   public void show (){
       for (String s:countries) {
           System.out.println(s);
                  }
   }

    public void add(String name) {
       countries.add(name);
    }

    public void getIndex (String c){
        for (String s: countries) {
            if (s.contains(c)){
                System.out.println(countries.indexOf(s));
            }
        }
    }
    public boolean contain (String c){
        boolean yesNo = false;
                if (countries.contains(c)){
            yesNo = true;
        } else if (!countries.contains(c)) {
            yesNo = false;
        }

        return  yesNo;
    }
    public void removeItem (String c){
        int index;
        if (countries.contains(c)){
            index = countries.indexOf(c);
            //System.out.println(countries.indexOf(c));
            countries.remove(index);
            System.out.println(countries.toString());
            for (String s:countries) {
                System.out.println(s);

            }
        }
        else if (!countries.contains(c)){
            System.out.println("There is no such item");
        }
    }
    public void sortList (){
        countries.sort(Comparator.naturalOrder());

        for (String s: countries) {
            System.out.println(s);
        }
        //Collections.sort(this.countries);

    }
//    public Integer getSize(){
//        for (String s: countries) {
//            int size = s.length();
//        }
//        int size =  countries.size();
//        return size;
    //}
    public void sortBuble (){
        boolean replaced = true;
        while (replaced){
            replaced=false;
            for (int i=0; i<countries.size()-1; i++){
                //if (countries)
            }
        }
    }
    public void addCoutry (){
        System.out.println("Write name of coutry");
        Scanner sc = new Scanner(System.in);
        String newcountry = sc.nextLine();
        if (countries.contains(newcountry)){
             System.out.println(newcountry +" already exist");
         }
         else if (!countries.equals(newcountry)){
             countries.add(newcountry);
             System.out.println(newcountry + " added the list");
             countries.sort(Comparator.naturalOrder());
             this.show();
        }

    }

}

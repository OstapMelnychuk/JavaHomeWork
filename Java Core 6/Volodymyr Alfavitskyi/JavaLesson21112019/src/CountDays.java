public class CountDays {

    public int daysWinter (){
        return Month.DECEMBER.getDays()+Month.JANUARY.getDays()+Month.FEBRUARY.getDays();
    }
    public int daysSpring (){
        return Month.MARCH.getDays()+Month.APRIL.getDays()+Month.MAY.getDays();
    }
    public int daysSummer (){
        return Month.JUNE.getDays()+Month.JULY.getDays()+Month.AUGUST.getDays();
    }
    public int daysAutumn (){
        return Month.SEPTEMBER.getDays()+Month.OCTOBER.getDays()+Month.NOVEMBER.getDays();
    }
    public int daysYear (){
       int days = this.daysWinter()+this.daysSpring()+this.daysSummer()+this.daysAutumn();
        return days;
    }

}

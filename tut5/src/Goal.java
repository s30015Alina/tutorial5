import javax.swing.text.SimpleAttributeSet;
import java.util.Calendar;
import java.util.Date;

public class Goal {
    private  String name;
    private Date date;
    private  int bonus;
     public  Goal(String name, int year, int month, int day, int bonus){
         this.name = name;
         Calendar calendar = Calendar.getInstance();
         calendar.set(year, month, day);
         this.date = calendar.getTime();
         this.bonus = bonus;
     }
     public Date getDate(){
         return  date;
     }

    public int getBonus() {
        return bonus;
    }
}

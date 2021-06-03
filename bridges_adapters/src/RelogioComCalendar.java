import java.util.Calendar;

public class RelogioComCalendar implements Relogio {
    public Calendar hoje() {
        return Calendar.getInstance();
    }
}

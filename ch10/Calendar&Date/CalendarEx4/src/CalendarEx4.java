import java.util.Calendar;

/**
 * Created by johnm on 2017-01-04.
 */
public class CalendarEx4 {
    public static void main(String[] args){
        Calendar date = Calendar.getInstance();

        date.set(2005, 7, 31);

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전=");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("= 31일 후(roll)=");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add)=");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일";
    }

}

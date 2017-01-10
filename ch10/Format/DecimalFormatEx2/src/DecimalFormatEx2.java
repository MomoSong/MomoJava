import java.text.DecimalFormat;

/**
 * Created by johnm on 2017-01-10.
 */
public class DecimalFormatEx2 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try{
            Number num = df.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num));

        }catch (Exception e){}

    }
}

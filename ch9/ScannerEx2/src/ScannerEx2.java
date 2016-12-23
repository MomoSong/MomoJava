import java.io.File;
import java.util.Scanner;

/**
 * Created by johnm on 2016-12-24.
 */
public class ScannerEx2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("D:\\TheProject\\MomoJava\\ch9\\ScannerEx2\\src\\data2.txt"));
        int sum = 0;
        int cnt = 0;

        while(sc.hasNextInt()){
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum=" +sum);
        System.out.println("average=" +(double)sum/cnt);
    }
}

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by johnm on 2016-12-15.
 */
public class test {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] argArr = null;


        String prompt = ">>";
        System.out.print(prompt);

        String input = s.nextLine();

        input = input.trim();
        System.out.println(input);

        argArr = input.split(" +");
        System.out.println(Arrays.toString(argArr));


        String command = argArr[0].trim();
        System.out.println(command);




    }

}

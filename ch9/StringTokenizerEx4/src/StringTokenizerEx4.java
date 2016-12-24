/**
 * Created by johnm on 2016-12-24.
 */
import java.util.*;

public class StringTokenizerEx4 {
    public static void main(String[] args){
        String input = "삼십만삼천백십오";

        System.out.println(input);
        System.out.println(hangulToNum(input));
    }

    public static long hangulToNum(String input){
        long result = 0;
        long tmpResult = 0;
        long num = 0;

        final String NUMBER = "영일이삼사오육칠팔구";
        final String UNIT = "십백천만억조";
        final long[] UNIT_NUM = {10,100,1000,10000,(long)1e8,(long)1e12};

        StringTokenizer st = new StringTokenizer(input, UNIT, true);


    }
}

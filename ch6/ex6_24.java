/**
 * Created by johnm on 2016-12-12.
 */
public class ex6_24 {
    public static void main(String[] args){
        int value = 5;
        System.out.println(value+ "의 절대값:" +abs(value));
        value = -10;
        System.out.println(value+ "의 절대값:" +abs(value));
    }

    static int abs(int value){
        int result = 0;
        if(value >= 0)
            result = value;
        else
            result = -value;
        return result;
    }

}

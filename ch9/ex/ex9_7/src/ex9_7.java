/**
 * Created by johnm on 2016-12-30.
 */
public class ex9_7 {
    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }

    static boolean contains(String src, String target) {
        boolean result;
        int index = src.indexOf(target);

        if(index>=0){
            result = true;
        }else{
            result = false;
        }

        return result;
    }
}

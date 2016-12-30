/**
 * Created by johnm on 2016-12-30.
 */
public class ex9_5 {
    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;

        while(-1 != src.indexOf(target, pos)) {

            pos = src.indexOf(target, pos);
            pos += target.length();
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }

}

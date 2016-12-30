

/**
 * Created by johnm on 2016-12-30.
 */
public class ex9_8 {
    public static void main(String[] args) {
        System.out.println(round(3.1415, 1));
        System.out.println(round(3.1415, 2));
        System.out.println(round(3.1415, 3));
        System.out.println(round(3.1415, 4));
        System.out.println(round(3.1415, 5));
    }

    static double round(double d, int n) {
        return (Math.round(d * Math.pow(10.0, n))) / Math.pow(10.0, n);
    }


}

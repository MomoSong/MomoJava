/**
 * Created by johnm on 2016-12-30.
 */
public class ex9_10 {
    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
    }

    static String format(String str, int length, int alignment) {
        if (str.length() > length) {
            return str.substring(0, length);
        }

        char[] chSour = str.toCharArray();
        char[] chTmp = new char[length];

        for (char ch : chTmp) {
            ch = ' ';
        }

        switch (alignment) {
            case 0:
                System.arraycopy(chSour, 0, chTmp, 0, str.length());
                break;
            case 1:
                System.arraycopy(chSour, 0, chTmp, (int)((length-str.length())/2) , str.length());
                break;
            case 2:
                System.arraycopy(chSour, 0, chTmp, (length-str.length()), str.length());
                break;
            default:
                System.out.println("Try again please.");

        }

        return new String(chTmp);
    }
}

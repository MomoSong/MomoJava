/**
 * Created by johnm on 2016-12-30.
 */
public class ex9_6 {
    static String fillZero(String src, int length) {
        if (length <= 0) return "";
        if (src == null || (src.length() == length)) return src;
        if(src.length()>length) return src.substring(0, length);

        char[] chAr = new char[length-src.length()];

        for (int i = 0; i < chAr.length ; i++) {
            chAr[i] = '0';
        }

        String result = new String(chAr);

        result = result.concat(src);

        return result;
    }

    public static void main(String[] args){
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));

    }
}
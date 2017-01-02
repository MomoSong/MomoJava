/**
 * Created by johnm on 2017-01-02.
 */
public class ex9_9 {
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2    3  4\t5)" + " -> " + delChar("(1 2  3   4\t5)", " \t"));
    }

    static String delChar(String src, String delCh) {
        StringBuffer sbTmp = new StringBuffer(src);

        for (int i = 0; i < delCh.length(); i++) {
            for (int j = sbTmp.length() - 1; j >= 0; j--) {
                if (delCh.charAt(i) == sbTmp.charAt(j)) {
                    sbTmp.deleteCharAt(j);
                }
            }
        }
        String sResult = new String(sbTmp);

        return sResult;
    }
}

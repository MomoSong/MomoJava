/**
 * Created by johnm on 2016-12-30.
 */
public class ex9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparaterTest.java";
        String path = "";
        String fileName = "";


        int pos = 0;

        try {
            pos = fullPath.lastIndexOf("\\");
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        path = fullPath.substring(0, pos);
        fileName = fullPath.substring(pos+1);

        System.out.println("fullPath:" + fullPath);
        System.out.println("path:" + path);
        System.out.println("fileName:" + fileName);
    }
}

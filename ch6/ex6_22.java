/**
 * Created by johnm on 2016-12-12.
 */
public class ex6_22 {
    public static void main(String[] args){
        String str = "123";
        System.out.println(str +"는 숫자입니까? " +isNumber(str));

        str = "1234o";
        System.out.println(str +"는 숫자입니까?" +isNumber(str));
    }

    static boolean isNumber(String str){
        if(str==null || str.equals(""))
            return false;

        boolean check = false;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                check = true;
            else{
                check = false;
                break;
            }
        }
        return check;
    }

}

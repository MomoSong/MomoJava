/**
 * Created by johnm on 2016-12-17.
 */
public class ex8_9 {
    public static void main(String[] args) throws Exception{
        throw  new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException{
    final private int ERR_CODE;

    UnsupportedFunctionException(String str, int ERR_CODE){
        super(str);
        this.ERR_CODE = ERR_CODE;
    }

    UnsupportedFunctionException(String str){
        this(str, 100);
    }

    public int getErrorCode(){
        return ERR_CODE;
    }

    public String getMessage(){
        return "["+ getErrorCode() +"]"+ super.getMessage();
    }

}

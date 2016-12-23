/**
 * Created by johnm on 2016-12-15.
 */
public class ex7_14 {
    public static void main(String[] args){
        SutdaCard card = new SutdaCard(1, true);
    }
}

class SutdaCard{
    private final int num;
    private final boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num+(isKwang? "K":"");
    }
}

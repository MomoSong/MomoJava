/**
 * Created by johnm on 2016-12-30.
 */
public class ex9_1 {


}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SutdaCard) {
            return (num == ((SutdaCard) obj).num) && (isKwang == ((SutdaCard) obj).isKwang);
        } else {
            return false;
        }
    }

    public String toString() {
        return num + (isKwang ? "k" : "");
    }
}

/**
 * Created by johnm on 2016-12-15.
 */
public class ex7_1 {
    public static void main(String[] args){
        SutdaDeck deck = new SutdaDeck();

        for(int i=0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i] + ",");
        }
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang? "K" : "");
    }
}

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i=0; i<cards.length; i++){
            int num = i%10+1;
            boolean check = (i<10) && (num==1||num==3||num==8);

            cards[i] = new SutdaCard(num, check);

        }
    }
}

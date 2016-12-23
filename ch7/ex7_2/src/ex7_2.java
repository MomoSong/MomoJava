/**
 * Created by johnm on 2016-12-15.
 */
public class ex7_2 {
    public static void main(String[] args){
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

class SutdaCard {
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

class SutdaDeck {

    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i=0; i<cards.length; i++){
            int num = i%10+1;
            boolean check = (i<10) && (num==1||num==3||num==8);

            cards[i] = new SutdaCard(num, check);
        }
    }

    void shuffle(){
        SutdaCard tmpCard;

        for(int i=0; i<cards.length; i++){
            int j = (int)(Math.random()*cards.length);
            tmpCard = cards[i];
            cards[i] = cards[j];
            cards[j] = tmpCard;
        }
    }

    SutdaCard pick(){
        return this.pick((int)(Math.random()*cards.length));
    }

    SutdaCard pick(int index){
        return cards[index];
    }
}

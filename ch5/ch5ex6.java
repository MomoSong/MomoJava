/**
 * Created by johnm on 2016-12-09.
 */
public class ch5ex6 {
    public static void main(String[] args){
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money=" + money);

        for(int i=0; i<coinUnit.length; i++){
            System.out.println(coinUnit[i]+"원:" + (int)money/coinUnit[i]);
            money %= coinUnit[i];

        }


    }
}

/**
 * Created by johnm on 2017-01-03.
 */
public class ex9_12 {
    public static void main(String[] args){
        for(int i=0; i<20; i++){
            System.out.print(getRand(1, -3) + ",");
        }
    }

    static int getRand(int from, int to){
        return (int)(Math.random()*(Math.abs(to-from)+1)) + Math.min(from, to);
    }
}

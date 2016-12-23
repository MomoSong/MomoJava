/**
 * Created by johnm on 2016-12-12.
 */
public class ex6_6 {
    public static void main(String args[]){
        System.out.println("ex6_6~6_7");

        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDiatance(1,1,2,2));
    }



}



class MyPoint{
    int x;
    int y;

    MyPoint(){
        this(1, 1);
    }

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDiatance(int x, int y, int x1, int y1){
        return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
    }

}

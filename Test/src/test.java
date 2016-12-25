import java.util.Arrays;

/**
 * Created by johnm on 2016-12-15.
 */
public class test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Circle c2 = c1.copy();

        System.out.println(c1 +"::::::::" + c2);

        c1.r = 8.0;

        System.out.println(c1 +"::::::::" + c2);

    }
}

class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return x + "," + y;
    }
}

class Circle implements Cloneable{

    double r;

    Circle(double r){

        this.r = r;
    }

    public Circle copy(){
        Object obj = null;

        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e) {}

        //Circle c = (Circle)obj;
        //c.p = new Point(this.p.x, this.p.y);
        return (Circle)obj;
    }

    public String toString(){
        return   ", r = " + this.r;
    }
}






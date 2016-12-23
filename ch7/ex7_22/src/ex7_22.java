/**
 * Created by johnm on 2016-12-16. ex7_22 ~ ex7_23
 */
public class ex7_22 {

    public static double sumArea(Shape[] arr){
        double sumOfArea = 0;
        for(int i=0; i<arr.length; i++){
            sumOfArea += arr[i].calcArea();
        }
        return sumOfArea;
    }

    public static void main(String[] args){
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합:" +sumArea(arr));
    }

}

class Circle extends Shape{
    double r;

    Circle(){
        this(new Point(0,0), 0);
    }

    Circle(double r){
        this(new Point(0, 0), r);
    }

    Circle(Point p, double r){
        super(p);
        this.r = r;
    }

    double calcArea(){
        return r*r*Math.PI;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(){
        this(new Point(0, 0), 1, 1);
    }

    Rectangle(double width, double height){
        this(new Point(0, 0), width, height);
    }

    Rectangle(Point p, double width, double height){
        super(p);
        this.width = width;
        this.height = height;
    }

    boolean isSquare(){
        return (width*height != 0) && (width == height);
    }

    double calcArea(){
        return width*height;
    }
}

abstract class Shape{
    Point p;

    Shape(){
        this(new Point(0, 0));
    }

    Shape(Point p){
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition(){
        return p;
    }

    void setPosition(Point p){
        this.p = p;
    }

}

class Point{
    int x;
    int y;

    Point(){
        this(0, 0);
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

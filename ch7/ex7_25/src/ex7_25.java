/**
 * Created by johnm on 2016-12-16.
 * ex7_25~27
 */

class Outer{
    int value = 10;

    class Inner{
        int value = 20;
        void method1(){
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);
        }
    }
}



public class ex7_25 {
    public static void main(String[] args){
        Outer oc = new Outer();
        Outer.Inner inner = oc.new Inner();


        inner.method1();
    }

}

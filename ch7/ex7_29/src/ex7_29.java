/**
 * Created by johnm on 2016-12-16.
 */
public class ex7_29 {
    public static void main(String[] args) {
        final int VALUE = 10;

        Thread t = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<10; i++){
                    try{
                        Thread.sleep(1*1000);
                    }catch (InterruptedException e){}

                    System.out.println(VALUE);
                }
            }
        });

        t.start();
        System.out.println("main() - 종료.");

    }
}
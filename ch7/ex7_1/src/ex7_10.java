package ch7.ex7_1.src;

/**
 * Created by johnm on 2016-12-15.
 */
public class ex7_10 {
    public static void main(String[] args){
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:" +t.getChannel());
        t.setChannel(20);
        System.out.println("VOL:" +t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" +t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" +t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" +t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" +t.getChannel());
    }

}
// ex7_10 ~  7_11
class MyTv2{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume){
        if(volume>MAX_VOLUME || volume<MIN_VOLUME)
            this.volume = 50;
        else
            this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setChannel(int channel){
        if(channel>100 || channel <0)
            this.channel = 50;
        else {
            this.prevChannel = this.channel;
            this.channel = channel;
        }
    }

    public int getChannel(){
        return this.channel;
    }

    public void gotoPrevChannel(){
        setChannel(prevChannel);
    }

}



/**
 * Created by johnm on 2016-12-12.
 */
public class ex6_5 {
    public static void main(String[] args){
        Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Student1{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student1(){
        this("홍길동", 0, 0, 0, 0, 0);
    }

    Student1(String name, int... args){
        this.name = name;
        this.ban = args[0];
        this.no = args[1];
        this.kor = args[2];
        this.eng = args[3];
        this.math = args[4];
    }

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int)(getTotal()/3f*10+0.5f)/10f;
    }

    String info(){
        return (name+","+ban+","+no+","+kor+","+eng+","+math+getTotal()+","+getAverage());
    }
}

/**
 * Created by johnm on 2017-01-03.
 */
public class ex9_11 {
    public static void main(String[] args) {
        int a, b;

        if(args.length<2) {
            System.out.println("시작 단과 끝 단, 두 개의 정수를 입력하세요.");
            System.out.println("USAGE : GugudanTest 3 5");
            System.exit(0);
        }

        a = Integer.valueOf(args[0]);
        b = Integer.valueOf(args[1]);

        if (a < 2 || a > 9 || b < 2 || b > 9){
            System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
            System.out.println("USAGE :  GugudanTest 3 5");
            System.exit(0);
        }

        Gugu(a, b);
    }

    static void Gugu(int a, int b) {
        if (a > b) {
            int tmp;
            tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}

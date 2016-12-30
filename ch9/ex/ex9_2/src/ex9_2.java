
/**
 * Created by johnm on 2016-12-30.
 */
public class ex9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p1?" + (p1 == p2));
        System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
    }
}

class Point3D {
    int x, y, z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
        this(0, 0, 0);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Point3D)) return false;

        //멤버 x, y, z를 비교하는 것보다 String으로 변환해서 비교하는게 속도나 가독성에서 장점이 있을지...
        String objTmp = ((Point3D) obj).toString();
        String thisTmp = this.toString();

        if (thisTmp.equals(objTmp)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "[" + x + "," + y + "," + z + "]";
    }
}

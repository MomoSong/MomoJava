import java.util.StringJoiner;

/**
 * Created by johnm on 2016-12-21.
 */
public class StringEx4 {
    public static void main(String[] args){
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/", "[", "]");
        for(String s: arr)
            sj.add(s);

        System.out.println(sj.toString());
    }
}

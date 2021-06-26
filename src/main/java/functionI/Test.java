package functionI;

import java.util.ArrayList;
import java.util.List;

public class Test {
    interface Square {
        int calculate(int x);
    }
    interface ListTest {
        List<String> getString();
    }


    public static void main(String[] args) {
        int a = 5;
        Square s = x -> x*x;
        int calculate = s.calculate(a);
        System.out.println(calculate);

        ListTest l = ArrayList::new;
    }
}

package chapter2;

import java.util.stream.Stream;

public class Exercise_4 {
    public static void getIntStream(){
        int[] values = {1, 4, 9, 16};
        Stream<int[]> count = Stream.of(values);
        
    }
}

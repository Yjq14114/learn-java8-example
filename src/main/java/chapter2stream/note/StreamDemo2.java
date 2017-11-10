package chapter2stream.note;

import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StreamDemo2 {
    /**
     * 用java8实现的累加
     * @param values
     */
    private static void reduce(Stream<Integer> values){
        Optional<Integer> sum = values.reduce(Integer::sum);
        sum.ifPresent(System.out::println);
    }

    public static void treeSet(){
        TreeSet<String> result = new TreeSet<>();
        result.add("name");
        result.add("age");
        result.add("result");
    }
    public static void main(String[] args) {
//        StreamDemo2.reduce(Stream.of(1,2,3,4,5));
        StreamDemo2.treeSet();
    }
}

package chapter2stream.note;

import com.sun.xml.internal.ws.resources.StreamingMessages;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    private static void generate(){
        Stream<String> echos = Stream.generate(()->"Echo");
        Stream<Double> randoms = Stream.generate(Math::random);
    }
    private static void iterate(){
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n->n.add(BigInteger.ONE));
    }
    private static Pattern WORDS = Pattern.compile("[\\P{L}]+");
    private static void pattern(String content){
        Stream<String> words = WORDS.splitAsStream(content);
//        Stream<String> stringStream = words.map(String::toUpperCase);
        Stream<Character> firstChars = words.map(s-> s.charAt(0));
//        if (firstChars.findFirst().isPresent()){
//            System.out.println(firstChars.findFirst().get());
//        }
        firstChars.findFirst().ifPresent(System.out::println);
    }
    public static Stream<Character> characterStream(String s){
        List<Character> result = new ArrayList<>();
        for (char c: s.toCharArray()){
            result.add(c);
        }
        return result.stream();
    }
    private static void sorted(String s){
        Stream<String> words = WORDS.splitAsStream(s);
        Stream<String> sorted = words.sorted(Comparator.comparing(String::length).reversed());
        sorted.findFirst().ifPresent(System.out::println);

    }
    public static Optional<Double> squareRoot(Double x){
        return x<0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }
    public static Optional<Double> inverse(Double x){
        return x==0 ? Optional.empty() : Optional.of(1/x);
    }
    public static void main(String[] args) {
//       StreamDemo1.generate();
//       StreamDemo1.pattern("hello world! my content");
//        StreamDemo1.sorted("kill bille jean");
        // 先求倒数，在开平方
        Optional<Double> d = Optional.of(4.0).flatMap(StreamDemo1::inverse).flatMap(StreamDemo1::squareRoot);
        d.ifPresent(System.out::println);
    }
}

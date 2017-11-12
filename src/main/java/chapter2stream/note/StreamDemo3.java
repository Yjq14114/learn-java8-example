package chapter2stream.note;

import domain.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    /**
     * stream<T> to map
     * @param personStream
     */
    private static void toMap(Stream<Person> personStream){
//        Map<Integer, String> idToName= personStream.collect(Collectors.toMap(Person::getId, Person::getName));
        Map<Integer, Person> idToPerson = personStream.collect(Collectors.toMap(Person::getId, Function.identity()));
        System.out.println(idToPerson);
    }
    private static void treeMap(Stream<Person> personStream){
        TreeMap<Integer, Person> collect = personStream.collect(
                Collectors.toMap(
                        Person::getId,
                        Function.identity(),
                        (existingValue, newValue) -> {
                            throw new IllegalStateException();
                        },
                        TreeMap::new)
        );
        System.out.println(collect);
    }
    /**
     * 获取系统语言
     */
    private static void getLocalLanguage(){
        Stream<Locale> availableLocales = Stream.of(Locale.getAvailableLocales());
        Map<String, String> collect = availableLocales.collect(Collectors.toMap(Locale::getDisplayLanguage,
                l -> l.getDisplayLanguage(l),
                (existingValue, newValue) -> existingValue));
        System.out.println(collect);
    }
    private static void getCoutryLanguage(){
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<String>> collect = locales.collect(Collectors.toMap(Locale::getDisplayCountry,
                l -> Collections.singleton(l.getDisplayLanguage()),
                (a, b) -> {
                    Set<String> r = new HashSet<>(a);
                    r.addAll(b);
                    return r;
                }));
        System.out.println(collect);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setAge(23);
        person.setName("yangjiaqi");
        person.setSex(1);
        person.setWeight(65f);
        Stream<Person> personStream = Stream.of(person);
//        StreamDemo3.toMap(personStream);
        StreamDemo3.treeMap(personStream);
        StreamDemo3.getLocalLanguage();
        StreamDemo3.getCoutryLanguage();
    }
}

package Lesson22;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Baku", 20));
        persons.add(new Person("Ganja", 42));
        persons.add(new Person("Guba", 36));
        persons.add(new Person("Sumgait", 54));
        persons.add(new Person("Nakhchivan", 16));


        // Methods:
        //System.out.println(sortStream(persons));
        //System.out.println(oldestPersonStream(persons));
        //System.out.println(greaterThan40(persons));
        //System.out.println(listToMap(persons));
        //System.out.println(listToMapStream(persons));
        //System.out.println(decreasePercentage(persons));

    }

    public static void sortMethod(ArrayList<Person> persons) {
        //1. Hemin Objectleri Age-e gore sort edin. Evvel yashlilar, sonra daha cavanlar
        //by usual way

        Collections.sort(persons, Collections.reverseOrder());
        System.out.println(persons);
    }

    public static String sortStream(ArrayList<Person> persons) {
        //1. Hemin Objectleri Age-e gore sort edin. Evvel yashlilar, sonra daha cavanlar
        //by stream

        return persons.stream()
                .sorted((s, t) -> t.getAge() - s.getAge())
                .collect(Collectors.toList()).toString();

    }
    public static void oldestPerson(ArrayList<Person> persons) {
        //2. Hemin Objectlerin icinde olan en yashli adami tapin
        //by usual way

        System.out.println(Collections.max(persons, Collections.reverseOrder()));
    }

    public static Person oldestPersonStream(ArrayList<Person> persons){
        //2. Hemin Objectlerin icinde olan en yashli adami tapin
        //by stream

        return persons.stream()
                .sorted((s, t) -> t.getAge() - s.getAge())
                .collect(Collectors.toList()).get(0);

    }

    public static List<Person> greaterThan40(ArrayList<Person> persons) {
        //3. Hemin Objectlerin icinde 40-dan ashagi olanlari silirsiz yuxaridaki Data Structure-dan
        //by stream

        var newList= persons.stream()
                .filter(s -> s.getAge() > 40)
                .sorted((s, t) -> t.getAge() - s.getAge())
                .collect(Collectors.toList());

        return newList;
    }

    public static Map<Integer,String> listToMap(ArrayList<Person> persons){
        //4. Yaratdiginiz Data Structure-i Map-a cevirirsiz: Key olur Person-larin Age-i, Value olur onlarin Addressi. (No duplicate persons)
        //by usual way

        Map<Integer,String> personMap = new HashMap<>();
        for (Person p:persons){
            personMap.put(p.getAge(),p.getAddress());
        }
        return personMap;
    }

    public static List<Map<Integer, String>> listToMapStream(ArrayList<Person> persons){
        //4. Yaratdiginiz Data Structure-i Map-a cevirirsiz: Key olur Person-larin Age-i, Value olur onlarin Addressi. (No duplicate persons)
        //by stream

        var c = persons.stream()
                .map(s -> Map.of(s.getAge(), s.getAddress()))
                .collect(Collectors.toList());

        return c;
    }

    public static List<Person> decreasePercentage(ArrayList<Person> persons){
        //5.Hemin Age-leri 10% azaldirsiz
        //by stream

        return persons.stream()
                .map(s -> new Person(s.getAddress(), (s.getAge() * 90/100)))
                .collect(Collectors.toList());
    }
}


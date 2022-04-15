package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static function.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people =List.of(
        new Person("Divyanshu", MALE),
        new Person("Divyanshi", FEMALE),
        new Person("Aryan", MALE),
        new Person("Krishna", MALE),
        new Person("Isha", FEMALE)

        );
        System.out.println("Imperative Approach");
        List<Person> females=new ArrayList<>();
        for(Person person:people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for(Person female:females){
            System.out.println(female);
        }

        //Declarative Approach
        System.out.println("Declarative Approach");
        Predicate<Person> personPredicate=person -> FEMALE.equals(person.gender);
        people.stream()
                .filter(personPredicate )
//                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    static class Person {
        private  final String name;
        private  final Gender gender;
        Person(String name, Gender gender){
            this.name=name;
            this.gender=gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}

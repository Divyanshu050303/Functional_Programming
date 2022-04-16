package streams;

import function.Main;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Streams.Gender.*;

public class _Streams {
    public static void main(String[] args) {
        List<Person1> people =List.of(
                new Person1("Divyanshu", MALE),
                new Person1("Isha", FEMALE),
                new Person1("Divyanshi", FEMALE),
                new Person1("Krishna", MALE),
                new Person1("Aryan", MALE),
                new Person1("Adarsh", PREFER_NOT_TO_SAY)

        );
//        people.stream()
//                .map(person1 -> person1.name)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
        boolean containOnlyFemale=people.stream()
                .anyMatch(person1 -> FEMALE.equals(person1.gender));
        System.out.println(containOnlyFemale);
    }

    static class Person1 {
        private  final String name;
        private  final Gender gender;
        Person1(String name, Gender gender){
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
        MALE, FEMALE, PREFER_NOT_TO_SAY;
    }
}

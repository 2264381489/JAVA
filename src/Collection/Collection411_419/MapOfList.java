package Collection.Collection411_419;

import Collection.pets.Cymric;
import Collection.pets.Mutt;
import Collection.pets.Person;
import Collection.pets.Pet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 421
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> people=new HashMap<>();
    static {
        people.put(new Person("dawn"), Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
        //就写一个了,有点懒了.
    }
    public static void main(String[] args) {
        System.out.println(people.keySet());//返回的是键组成的set
        System.out.println(people.values());//返回的时值组成的set
        for (Person person:people.keySet()
             ) {
            System.out.println(person+"has :");
            for (Pet pet:people.get(person)
                 ) {
                System.out.println(pet);

            }
        }
    }
}

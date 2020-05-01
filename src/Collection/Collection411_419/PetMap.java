package Collection.Collection411_419;

import Collection.pets.Cat;
import Collection.pets.Dog;
import Collection.pets.Hamster;
import Collection.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * 419
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap=new HashMap<String, Pet>();
        petMap.put("My Cat",new Cat("MALL"));
        petMap.put("My Dog",new Dog("DOGGY"));
        petMap.put("My Haster",new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog=petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));//
        System.out.println(petMap.containsValue(dog));//
    }
}

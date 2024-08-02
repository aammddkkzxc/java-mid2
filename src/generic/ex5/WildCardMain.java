package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain {
    public static void main(String[] args) {
        Box<Object> box = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildCardV1(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printGenericV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
    }
}

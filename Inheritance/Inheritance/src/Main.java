/**
 * Created by home-folder on 6/22/17.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Anumal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 2, 20, "long silky");

        Fish fish = new Fish("GoldFish", 1, 1, 2, 2, 1);

        //dog.eat();
        dog.walk();
        //dog.run();

        fish.move(20);
    }
}

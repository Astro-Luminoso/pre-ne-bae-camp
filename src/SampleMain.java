public class SampleMain {

    public static void main(String[] args) {

        Animal animal = new Dog(4, "Female", "Poodle");
        animal.makeSound();
        animal.eat();
        animal.genderInString();
        Dog dog = (Dog) animal;
        dog.speciesInString();
    }
}
// Output:

//Bark! Bark!
//This dog is a Poodle.
//Eating Food with 0 arms!!
//Gender is Female.

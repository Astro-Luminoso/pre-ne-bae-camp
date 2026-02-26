public class Dog extends Animal {

    private String species;

    public Dog(int legCount, String gender, String species) {
        super(legCount, 0, gender);
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }


    public void speciesInString() {
        System.out.printf("This dog is a %s.%n", this.species);
    }

}
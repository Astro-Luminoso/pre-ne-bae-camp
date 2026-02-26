public class Human extends Animal{

    private String ethnicity;

    public Human (int legCount, int armCount, String gender, String ethnicity) {

        super(legCount, armCount, gender);
        this.ethnicity = ethnicity;
    }

    public void declareEthnicity() {
        System.out.printf("This human is %s.%n", this.ethnicity);
    }

    @Override
    public void makeSound() {
        System.out.println("Hello! Nice to meet you!");
    }
}

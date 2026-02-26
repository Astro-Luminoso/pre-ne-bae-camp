public abstract class Animal {

    private int legCount;
    private int armCount;
    private String gender;

    public Animal (int legCount, int armCount, String gender){
        this.legCount = legCount;
        this.armCount = armCount;
        this.gender = gender;
    }

    public abstract void makeSound();

    public void run() {
        System.out.printf("Running on %d feet%n", this.legCount);
    }

    public void eat(){
        System.out.printf("Eating Food with %d arms!!%n", this.armCount);
    }

    public void genderInString() {
        System.out.printf("Gender is %s.%n", this.gender);
    }
}
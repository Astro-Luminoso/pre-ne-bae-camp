public class Player {


    /*
    * These are called properties
    */
    private String name;
    private int age;
    private String gender;
    private double weight;

    /*
    * This is a Constructor
    * The constructor is triggered when a new Player is created.
    */
    public Player () {
        // call constructor with parameters - constructor chaining
        this(null, 0, null, 0.0);
    }
    /*
    * This is also a constructor has parameters
    */
    public Player (String name, int age, String gender, double weight) {

            this.name = name;
            this.age = age;
            this.gender = gender;
            this.weight = weight;

    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) {
        if(age >= 0) this.age = age;
    }


    public static void main(String[] args) {
        Player player1 = new Player("John", 25, "Male", 1534.53);
        Player player2 = new Player("Jane", 35, "Female", 45.77);
    }

}

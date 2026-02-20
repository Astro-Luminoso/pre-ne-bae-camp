public class SampleMain {

    public static void main(String[] args) {
        Car car1 = new SUV();
        Car car2 = new Hatchback();
        car1.move();
        car1.stop();
        car2.move();
        car2.stop();
    }
}

/*
Result:
SUV is moving.
SUV is stopped.
Hatchback is moving.
Hatchback is stopped.
 */

public class Hatchback implements Car{

    @Override
    public void move() {
        System.out.println("Hatchback is moving.");
    }

    @Override
    public void stop() {
        System.out.println("Hatchback is stopped.");
    }
}

public class SUV implements Car{

    @Override
    public void move() {
        System.out.println("SUV is moving.");
    }

    @Override
    public void stop() {
        System.out.println("SUV is stopped.");
    }
}

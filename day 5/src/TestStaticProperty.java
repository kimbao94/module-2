public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Lamborghini Aventador","động cơ V12");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Bugati Veyron","động cơ W16");
        System.out.println(Car.numberOfCars);
    }
}

package ex2;

public class Showroom {
    public static void main(String[] args) {

        /* Innocent example to make sure the code runs */
        Dealership dealership = new Dealership(300, 100000);
        Car car1 = dealership.getCar(CarType.GENERAL_PURPOSE);
        Car car2 = dealership.getCar(CarType.ELECTRIC_ANON);
        Car car3 = dealership.getCar(CarType.ELECTRIC_LAMBDA);
        Car car4 = new Ferrari();
        /* TODO 2,3,4: Test all changes to the code */
        System.out.println(car1.showPresentation());
        System.out.println(car2.showPresentation());
        System.out.println(car3.showPresentation());
        System.out.println(car4.showPresentation());
    }
}

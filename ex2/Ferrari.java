package ex2;

public class Ferrari implements Car {
    CarType type = CarType.RACING;

    @Override
    public String showPresentation() {
      return type + " car that runs at top speed 450 and costs 1000000";
    }
}

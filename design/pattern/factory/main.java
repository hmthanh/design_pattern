package design.pattern.factory;

//#region Thanh
public class main {
    public static void main(String[] args) {
        var car1 = CarsFactory.getCar(CarType.FORD);
        var car2 = CarsFactory.getCar(CarType.FERRARI);
        System.out.println("sdfsdf");
        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());

        System.out.println("sdfsdf");
    }
}
//#endregion
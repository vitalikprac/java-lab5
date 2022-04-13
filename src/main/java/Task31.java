/**
 * 31. Створити клас Машина, що має марку, число циліндрів, потужність.
 * Створити похідний клас - Вантажівка, що має вантажопідйомність.
 */

public class Task31 {
    public static void execute(String[] args) {
        var car = new Car("Renault Megane 3",32,900);
        System.out.println(car);
        var truck = new Truck("Ford",256,5000,30000);
        System.out.println(truck);
    }

}

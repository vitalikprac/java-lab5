import java.util.Objects;

public class Car {
    /**
     * Властивість - марка
     **/
    private final String brand;
    /**
     * Властивість - кількість циліндрів
     **/
    private final int cylindersCount;
    /**
     * Властивість - потужність
     **/
    private final int power;

    /**
     * Створює новий об'єкт з заданими значеннями
     *
     * @param brand - марка
     * @param cylindersCount - кількість циліндрів
     * @param power - потужність
     * @see Car
     **/
    public Car(String brand, int cylindersCount, int power) {
        this.brand = brand;
        this.cylindersCount = cylindersCount;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylindersCount == car.cylindersCount && power == car.power && Objects.equals(brand, car.brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", cylindersCount=" + cylindersCount +
                ", power=" + power +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, cylindersCount, power);
    }
}

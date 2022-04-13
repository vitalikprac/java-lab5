import java.util.Objects;

public class Truck extends Car{
    /**
     * Властивість - вантажопідйомність
     **/
    private final int loadCapacity;

    /**
     * Створює новий об'єкт з заданими значеннями
     *
     * @Param brand - марка
     * @Param cylindesCount - кількість циліндрів
     * @Param power - потужність
     * @Param loadCapacity - вантажопідйомність
     * @See Truck
     **/
    public Truck(String brand, int cylindersCount, int power, int loadCapacity) {
        super(brand, cylindersCount, power);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
}

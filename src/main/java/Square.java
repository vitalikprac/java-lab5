import java.util.Objects;


public class Square {
    /**
     * Властивість - сторона
     **/
    private float side;

    /**
     * Створює новий об'єкт з заданим значенням
     *
     * @param side - сторона
     * @see Square
     **/
    public Square(float side) throws Exception {
        if (side <= 0) {
            throw new Exception("Can not create square with side less or equal to 0!");
        }
        this.side = side;
    }

    /**
     * Встановлення сторони квадрату
     *
     * @param side - нове значення сторони квадрату
     **/
    public void setSide(float side) throws Exception {
        if (side <= 0) {
            throw new Exception("Can not set side of square less or equal to 0!");
        }
        this.side = side;
    }

    /**
     * Підрахунок площи квадрату
     *
     * @return float - площа квадрату
     **/
    public float calculateArea() {
        return side * side;
    }


    /**
     * Підрахунок периметру квадрату
     *
     * @return float - периметр квадрату
     **/
    public float calculatePerimeter() {
        return 4 * side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "a=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Float.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}

import java.util.Arrays;

public class Polynomial {
    /**
     * Властивість - масив коефіцієнтів
     **/
    private final float[] coefficients;

    /**
     * Створює новий об'єкт з заданими значеннями
     *
     * @Param coefficients - масив коефіцієнтів
     * @See Polynomial
     **/
    public Polynomial(float[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "coefficients=" + Arrays.toString(coefficients) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return Arrays.equals(coefficients, that.coefficients);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coefficients);
    }
}

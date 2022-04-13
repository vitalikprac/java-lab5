import java.util.Arrays;

public class RationalExpression extends Polynomial{
    /**
     * Властивість - масив коефіцієнтів в чисельнику
     **/
    private final float[] numerator;
    /**
     * Властивість - масив коефіцієнтів в знаменнику
     **/
    private final float[] denominator;

    /**
     * Створює новий об'єкт з заданими значеннями
     *
     * @Param numeratorCoefficients - масив коефіцієнтів в чисельнику
     * @Param denominatorCoefficients - масив коефіцієнтів в знаменнику
     * @See RationalExpression
     **/
    public RationalExpression(float[] numeratorCoefficients, float[] denominatorCoefficients) {
        super(numeratorCoefficients);
        this.numerator = numeratorCoefficients;
        this.denominator = denominatorCoefficients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RationalExpression that = (RationalExpression) o;
        return Arrays.equals(numerator, that.numerator) && Arrays.equals(denominator, that.denominator);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(numerator);
        result = 31 * result + Arrays.hashCode(denominator);
        return result;
    }

    @Override
    public String toString() {
        return "RationalExpression{" +
                "numerator=" + Arrays.toString(numerator) +
                ", denominator=" + Arrays.toString(denominator) +
                '}';
    }
}

/**
 * 25.	Створити базовий клас - «Поліном» (масив коефіцієнтів),
 * похідний клас «Раціональний вираз»,
 * що включає поліном в чисельнику, поліном в знаменнику.
 */
public class Task25 {
    public static void execute(String[] args) {
        var rationalExpression = new RationalExpression(new float[]{3, 4}, new float[]{-5, 2});
        System.out.println(rationalExpression);
    }

}

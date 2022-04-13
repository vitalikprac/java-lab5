/**
 * 13.	Створити клас Квадрат. Поля - сторона. Функції-члени обчислюють площу,
 * периметр квадрата, встановлюють і повертають значення полів.
 * Функції-члени встановлення значень полів повинні перевіряти коректність заданих значень.
 */
public class Task13 {
    public static void execute(String[] args) throws Exception {
        Square square = new Square(25);
        System.out.println("[TASK13] Print square: "+square);
        System.out.println("[TASK13] Print area: "+square.calculateArea());
        System.out.println("[TASK13] Print perimeter: "+square.calculatePerimeter());
        square.setSide(10);
        System.out.println("[TASK13] Square after setting side 10");
        System.out.println("[TASK13] Print square: "+square);
        System.out.println("[TASK13] Print area: "+square.calculateArea());
        System.out.println("[TASK13] Print perimeter: "+square.calculatePerimeter());

    }


}

public class LogicalOperations {
    public static void main(String[] args) {

        System.out.println("Логическое true OR true равно: " + OR(true, true));
        System.out.println("Логическое false OR false равно: " + OR(false, false));
        System.out.println("Логическое true OR false равно: " + OR(true, false));
        System.out.println("Логическое false OR true равно: " + OR(false, true));

        System.out.println(" ");

        System.out.println("Логическое true AND true равно: " + AND(true, true));
        System.out.println("Логическое false AND false равно: " + AND(false, false));
        System.out.println("Логическое true AND false равно: " + AND(true, false));
        System.out.println("Логическое false AND true равно: " + AND(false, true));

        System.out.println(" ");

        System.out.println("Логическое исключающее true XOR true равно: " + XOR(true, true));
        System.out.println("Логическое исключающее false XOR false равно: " + XOR(false, false));
        System.out.println("Логическое исключающее true XOR false равно: " + XOR(true, false));
        System.out.println("Логическое исключающее false XOR true равно: " + XOR(false, true));

        System.out.println(" ");

        System.out.println("Логическое !false равно: " + NO(false));
        System.out.println("Логическое !true равно: " + NO(true));

        System.out.println(" ");

        System.out.println("Результат сравнения true и true равен: " + comparison(true, true));
        System.out.println("Результат сравнения false и false равен: " + comparison(false, false));
        System.out.println("Результат сравнения true и false равен: " + comparison(true, false));
        System.out.println("Результат сравнения false и true равен: " + comparison(false, true));
    }

    public static boolean OR(boolean first, boolean second) {
        return first || second;
    }

    public static boolean AND(boolean first, boolean second) {
        return first && second;
    }

    public static boolean XOR(boolean first, boolean second) {
        return first ^ second;
    }

    public static boolean NO(boolean first) {
        return !first;
    }

    public static boolean comparison(boolean first, boolean second) {
        return first == second;
    }
}

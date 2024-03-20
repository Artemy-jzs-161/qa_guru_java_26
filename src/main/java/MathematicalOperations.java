public class MathematicalOperations {

    public static void main(String[] args) {
        delete(10, 20);
        multiplication(10, 20);
        minus(10, 20);
        sum(10, 20);
        moduloDelete(100, 30);
        byteSum((byte) 10000, (byte) 300000);
        differentTypesOfDataSum(0.541, 10);
        differentTypesOfDataDelete(1468L, 84.4F);

    }

    public static void delete(int first, int second) {
        int result = first / second;
        System.out.println("Результат деления равен: " + result);
    }

    public static void multiplication(int first, int second) {
        int result = first * second;
        System.out.println("Результат умножения равен: " + result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println("Разница равена: " + result);
    }

    public static void sum(int first, int second) {
        int result = first + second;
        System.out.println("Сумма равена: " + result);
    }

    public static void moduloDelete(int first, int second) {
        int result = first % second;
        System.out.println("Остаток деления равен: " + result);
    }

    public static void byteSum(byte first, byte second) {
        int result = first + second;
        System.out.println("Переполнение при вычислении суммы byte: " + result);
    }

    public static void differentTypesOfDataSum(double first, int second) {
        String result;
        result = String.valueOf(first + second);
        System.out.println("Сумма double и int: " + result);
    }

    public static void differentTypesOfDataDelete(long first, float second) {
        String result;
        result = String.valueOf(first / second);
        System.out.println("Деление long и float: " + result);
    }
}
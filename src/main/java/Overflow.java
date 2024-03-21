public class Overflow {
    public static void main(String[] args) {
        byte maxByte = 127;
        byte overflowByte = (byte) (maxByte + 10);
        System.out.println(overflowByte);
    }
}

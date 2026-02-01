public class casting {
    public static void main(String args[]) {
        byte b = 127;
        int e = b;
        System.out.println(e);
        int a = 257;

        byte k = (byte) a; // 257 % 256 range of 1 byte
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f; // casting
        System.out.println(t);

        byte c = 10;
        byte d = 30;

        int result = c * d; // type promotion
        System.out.println(result);
    }
}

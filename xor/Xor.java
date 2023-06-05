package xor;

public class Xor {
    public static boolean xor(boolean a, boolean b) {
//        best practice
        return a != b;
//        return (a || b) && (a != b);
    }
}

public class Task6 {
    public static void main (String[] args) {
        final float X = 0f;
        final float Y = 0f;
        final byte coeff = 2;
        final float radius = 0.2f;
        if (X * X + (Y + 1) * (Y + 1) / coeff < radius) {
            System.out.print("false");
        } else if (X <= 2 && X >= -2 && Y <= 4 && Y >= 0) {
            System.out.print("true");
        } else if (X <= 4 && X >= -4 && Y <= 0 && Y >= -3) {
            System.out.print("true");
        }
    }
}

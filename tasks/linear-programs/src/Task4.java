public class Task4 {
    public static void main(String[] args) {
        final double R = 444.555;
        final double TEN_THOUSANDS = Math.pow(10, 3);
        final double ONE_THOUSANDTH = Math.pow(10, -3);
        double integerPart = Math.floor(R);
        double fractionalPart = R - integerPart;
        double res = integerPart * ONE_THOUSANDTH + Math.floor(fractionalPart * TEN_THOUSANDS);
        System.out.println(res);
    }
}

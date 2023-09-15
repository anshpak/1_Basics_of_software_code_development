public class Task3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were given.");
            System.exit(0);
        } else if (args.length > 2) {
            System.out.println("Warning. Some of the given arguments will not be used because only first three of them are needed.");
        }
        try {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            double res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
            System.out.println("The result is: " + res + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not enough arguments were given, two are required.");
        } catch (NumberFormatException e ) {
            System.out.println("Non numerical arguments were given.");
        }
    }
}

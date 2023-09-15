public class Task1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were given.");
            System.exit(0);
        } else if (args.length > 3) {
            System.out.println("Warning. Some of the given arguments will not be used because only first three of them are needed.");
        }
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            double z = (a - 3) * b / 2 + c;
            System.out.println("The result is: " + z + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not enough arguments were given, three are required.");
        } catch (NumberFormatException e ) {
            System.out.println("Non numerical arguments were given.");
        }
    }
}
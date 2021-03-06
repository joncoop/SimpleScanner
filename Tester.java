/**
 * Just a demo of how to use the SimpleScanner class.
 *
 * @author Jon Cooper
 * @version April 29, 2017
 */
public class Tester
{
    public static void main(String[] args) {

        // Normal usage
        SimpleScanner input = new SimpleScanner();

        System.out.println("Enter your name ");
        String name = input.readString();
        System.out.println("Hello, " + name + ".");

        System.out.println("Enter an integer: ");
        int a = input.readInt();
        System.out.println("You entered " + a + ".");

        System.out.println("Enter an integer in the range 1 to 10: ");
        int b = input.readInt(1, 10);
        System.out.println("You entered " + b + ".");

        System.out.println("Enter a double: ");
        double x = input.readDouble();
        System.out.println("You entered " + x + ".");

        System.out.println("Enter an integer in the range -3.14 to 3.14: ");
        double y = input.readDouble(-3.14, 3.14);
        System.out.println("You entered " + y + ".");


        // To show StackTrace on exceptions
        SimpleScanner input2 = new SimpleScanner(true);

        System.out.println("Enter an integer: ");
        int c = input2.readInt();
        System.out.println("You entered " + c + ".");
    }
}

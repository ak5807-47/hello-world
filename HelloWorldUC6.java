/**
 * HelloWorldUC6
 * Use Case 6 (UC6): Printing a personalized greeting using an Enhanced For Loop
 * and the substring method to remove the trailing delimiter.
 * Accepts zero or more command-line arguments.
 * Builds a single greeting string with names separated by a comma delimiter,
 * then uses substring to strip the trailing ", " before printing.
 * If no arguments are provided, displays "Hello, World!".
 *
 * @author ak5807-47
 * @version 1.0
 */
public class HelloWorldUC6 {

    /**
     * The main method, serving as the application's entry point.
     * Uses an enhanced for loop to build a names string with a delimiter,
     * then removes the trailing delimiter using substring.
     *
     * @param args Command line arguments, optionally providing names to greet
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            String delimiter = ", ";
            String names = "";

            for (String name : args) {
                names = names + name + delimiter;
            }

            // Remove the trailing delimiter using substring
            names = names.substring(0, names.length() - delimiter.length());

            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}

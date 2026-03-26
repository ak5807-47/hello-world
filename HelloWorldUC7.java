/**
 * HelloWorldUC7
 * Use Case 7 (UC7): Printing a personalized greeting using the String.join() method
 * to efficiently concatenate multiple names with a delimiter.
 * Accepts zero or more command-line arguments.
 * If no arguments are provided, displays "Hello, World!".
 *
 * @author ak5807-47
 * @version 1.0
 */
public class HelloWorldUC7 {

    /**
     * The main method, serving as the application's entry point.
     * Uses String.join() to combine all names with a comma delimiter
     * in a single, clean method call.
     *
     * @param args Command line arguments, optionally providing names to greet
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}

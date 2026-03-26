/**
 * HelloWorldUC5
 * Use Case 5 (UC5): Printing personalized greetings using an Enhanced For Loop.
 * Accepts zero or more command-line arguments.
 * Greets each name individually using a for-each loop.
 * If no arguments are provided, displays "Hello, World!".
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class HelloWorldUC5 {

    /**
     * The main method, serving as the application's entry point.
     * Uses an enhanced for loop (for-each) to iterate over command line arguments.
     * 
     * @param args Command line arguments, optionally providing names to greet
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        } else {
            System.out.println("Hello, World!");
        }
    }
}

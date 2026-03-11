/**
 * HelloWorldUC3
 * Use Case 3 (UC3): Printing a personalized text "Hello, [Name]" if a Name is
 * provided
 * as a Command Line Argument, or "Hello World" if no Name is provided.
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class HelloWorldUC3 {

    /**
     * The main method, serving as the application's entry point.
     * 
     * @param args Command line arguments, optionally providing a Name
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello World");
        }
    }
}

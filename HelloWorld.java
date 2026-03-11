/**
 * HelloWorld
 * Use Case 2 (UC2): Printing a personalized text "Hello, [Name]" to the console
 * using Command Line Arguments.
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class HelloWorld {

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

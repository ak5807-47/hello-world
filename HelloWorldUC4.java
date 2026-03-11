/**
 * HelloWorldUC4
 * Use Case 4 (UC4): Printing a personalized text "Hello, [Name1] [Name2]..." to
 * the console
 * using multiple Command Line Arguments.
 * 
 * @author ak5807-47
 * @version 1.0
 */
public class HelloWorldUC4 {

    /**
     * The main method, serving as the application's entry point.
     * 
     * @param args Command line arguments, optionally providing multiple names
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + String.join(" ", args));
        } else {
            System.out.println("Hello World");
        }
    }
}

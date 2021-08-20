package hello;

public class HelloWorld {
    public static String getMessage() {
        return "Hello, World!"+ System.getenv("CATALINA_HOME");
    }
}

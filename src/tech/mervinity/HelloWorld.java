package tech.mervinity;

/**
 * hello
 */
public class HelloWorld {
    /**
     * Hello world class
     * implementation of task :
     * There is an interface Vehicle which has a method honk();
     * There is a class Car which implements this interface.
     * Please write a java code which reflects this situation.
     * Which annotation can you use here?
     * A/ We use @Override to implement honk() method in Car class
     * @param argv - Argument vector
     */
    public static void main(String[] argv) {
        Car car = new Car();
        car.honk();
    }
}

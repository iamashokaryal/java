import java.lang.reflect.Method;

public class ReflectionDemo {

    // A private method to be accessed by reflection
    private void sayHello() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        try {
            // Create an instance of the ReflectionDemo class
            ReflectionDemo obj = new ReflectionDemo();

            // Get the class object of the instance
            Class cls = obj.getClass();

            // Get the private method by its name and parameter types
            Method method = cls.getDeclaredMethod("sayHello");

            // Set the method accessible
            method.setAccessible(true);

            // Invoke the method on the instance
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
    private String privateField;

    private MyClass(String value) {
        this.privateField = value;
    }

    private void privateMethod() {
        System.out.println("Hello from private method!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Access the private constructor
        Constructor<MyClass> constructor = MyClass.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        MyClass obj = constructor.newInstance("Hello, private field!");

        // Access the private field
        Field field = MyClass.class.getDeclaredField("privateField");
        field.setAccessible(true);
        String fieldValue = (String) field.get(obj);
        System.out.println("Private field value: " + fieldValue);

        // Access the private method
        Method method = MyClass.class.getDeclaredMethod("privateMethod");
        method.setAccessible(true);
        method.invoke(obj);
    }
}

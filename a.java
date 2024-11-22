public class B {
    float r = 3.5f;  // Add 'f' to denote a float literal

    public float calculateArea() {
        return (3.14f * r * r);  // Add 'f' to denote a float literal
    }
}

public class a {
    B b = new B();  // 'b' is an instance variable

    public static void main(String[] args) {
        A a = new A();  // Create an instance of 'A'
        System.out.println(a.b.calculateArea());  // Access 'b' through the instance 'a'
    }
}

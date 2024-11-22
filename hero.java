import java.lang.reflect.*;

class Test {

  // private variables
  private String name;
  private String message;

  // private method
  private void display() {
    System.out.println("The name is " + name);
  }
  

Test()
{
  this.message = "IT day.";
}

}

class hero {
  public static void main(String[] args) {
    try {
      // create an object of Test
      Test test = new Test();

      // create an object of the class named Class
      Class obj = test.getClass();

      // access the private variable
      Field field = obj.getDeclaredField("name");
      // make private field accessible
      field.setAccessible(true);

      // set value of field
      field.set(test, "Programiz");

      // get value of field
      // and convert it in string
      String value = (String)field.get(test);
      System.out.println("Name: " + value);

      // access the private method
      Method[] methods = obj.getDeclaredMethods();
      System.out.println("Method Name: " + methods[0].getName());

      Constructor[] c = obj.getDeclaredConstructors();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
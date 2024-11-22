abstract class Animal {
    public abstract void sound();

    public void sleep() {
        System.out.println("Zzzz...");
    }
}

class Cat extends Animal {
   
    public void sound() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
  
    public void sound() {
        System.out.println("Woof!");
    }
}

 class Mains {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        cat.sleep();

        System.out.println("and");

        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}

class animal {
    public void sound()
    {
        System.out.println("Hey, i am superclass.");

    }
}

class dog extends animal{

   @Override
public void sound()
    {
        
        System.out.println("Hey, bhow.");

    }
}

class test{

    public static void main(String[] args ){
animal an = new dog();
 an.sound();



    }
}

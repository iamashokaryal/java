interface a{
void show();
    
}
interface b{
  void show();
    
}

class multiple implements a,b 
{
public void show()
        {
        System.out.println("I am class multiple");
        }
    
        public static void main(String[] args )
        {
            multiple m = new multiple();
            m.show();
        }
}
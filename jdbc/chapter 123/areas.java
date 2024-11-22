public class areas{

    void area()
    {
        int r= 3;
        double pi = 3.14;
double area1 = (pi*r*r);
System.out.println("the area of circle is ="+area1);
    }
 void area(int x, int y)
        {
            int recarea = x*y;
            System.out.println("the area of rectangle is = "+ recarea);

        }
    
    void area(double x, int y)
        {
            double trangarea = 0.5*x*y;
            System.out.println("the area of TRANGLE is = "+ trangarea);

        }
    
    }



class demo{

    public static void main(String[] args )
    {
    
 areas ov = new areas();
    ov.area();
    ov.area(5,10);
ov.area(5.2,10);

    }
}
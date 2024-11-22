class inheritance {
    public int length,bredth,height;
    
}


class sub extends inheritance{
    int area;
    int volume;

    sub(int l, int b, int h){
        length =l;
         bredth = b;
         height = h;
    }
public void ar(){
    
    area = length*bredth;

}
 public void vol(){
    
    volume =  length*bredth*height;
}
}

class calculate{
public static void main(String[] args){
sub ap = new sub(5,2,7);
ap.ar();
ap.vol();
System.out.println("the area is " + ap.area);
    System.out.println("the volume is " + ap.volume);
}
}

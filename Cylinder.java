class cylinderformulae{
    float r,h,pi=3.14f;
     cylinderformulae(){
        r=5;
        h=8;
    }

    void getdata(float a,float b){
        r=a;
        h=b;
    }
   float setSurfaceArea(){
    float sa=2*pi*r*(h+r);
        return sa;
    }
    
    float setVolume(){
        float v=pi*r*r*h;
        return v;
    }
}

public class Cylinder{
    public static void main(String[] args){
        cylinderformulae c1= new cylinderformulae();
        // c1.getdata(5,7);
        System.out.println("Surface are is "+ c1.setSurfaceArea());
        System.out.println("Volume is "+ c1.setVolume());
    }
}
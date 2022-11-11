abstract class Dog{
    public Dog(){
        System.out.println("I'm the constructor.");
    }
    abstract void bark();
    abstract void legs();
}

class absclass extends Dog{
    void bark(){
        System.out.println("Dog is barking.");
    }
    void legs(){
        System.out.println("Dogs has 4 legs.");
    }
}

public class AbstractClass{
        public static void main(String[] args){
            absclass a= new absclass();
            a.bark();a.legs();
}
}
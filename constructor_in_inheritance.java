class Base{
    Base(){
        System.out.println("I am a constructor!");
    }
    Base(int a){
        System.out.println("I am an overloaded constructor of value "+a);

    }
}

class Derived extends Base{
    int u;

        void geter(int v){
           this.u= v;
        }
        int seter(){
            return u;
        }

    Derived(){
        // super(4);
        System.out.println("I am a constructor of derived class!");
    }
    Derived(int x,int y){
        super(x);//super keyword calls the constructor of super class!
        System.out.println("I am an overloaded constructor of derived class!");

    }
}

class ChildDerived extends Derived{
    ChildDerived(){
    System.out.println("I am a constructor of child of the derived class!");
    }

    ChildDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of child of the derived class!");

    }
}

public class constructor_in_inheritance{
    public static void main(String[] args){
        // Derived d= new Derived(4,5);
        // d.geter(6);
        // System.out.println(d.seter());
        ChildDerived a= new ChildDerived(3,4,5);
        a.geter(3);
    }
}
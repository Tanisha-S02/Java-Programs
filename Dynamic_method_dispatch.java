//dynamic method dispatch: in this we can create an object of the subclass with referrence of the super class but not
// the other way round. When we call methods for this obbject, only overrided methods can be called and methods of superclass!

class Chocolate{
    void type(){
        System.out.println("im made from coco and milk");
    }
    void state(){
        System.out.println("I am solid and melts easily");
    }
}
class jelly extends Chocolate{
    void type(){
        System.out.println("im made from gelatin");
    }
    void state2(){
        System.out.println("I am partially solid and translucent");
    }
}

public class Dynamic_method_dispatch{
        public static void main(String[] args){
            Chocolate obj = new jelly(); //allowed
            // jelly obj2 = new Chocolate(); //not allowed
            obj.type(); //allowed
            obj.state(); //allowed
            // obj.state2(); //not allowed
}
}
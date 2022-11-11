class Base1{
   void m(){
    System.out.println("Statement of method m!");
   }
}

class Derived1 extends Base1{
    @Override
    void m(){
    System.out.println("Statement of overrided method m!");
   }
        }

public class Method_overriding{
        public static void main(String[] args){
            Derived1 d= new Derived1();
            d.m();

}
}
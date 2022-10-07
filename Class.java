import java.util.Scanner;

class Employee{
        int salary;
        String name;
        Scanner s= new Scanner(System.in);

        int getsalary(){
              return  salary;
        }
        String getname(){
                return name;
        }
        void setname(){
                // Scanner s= new Scanner(System.in);
                System.out.println("Enter name");
                name= s.nextLine();
                //or you can pass the parameter as string n
                //n = name and then call it
        }
        
}
//class square
class square{
        int S;

        Scanner s= new Scanner(System.in);
        void getside(){
                System.out.println("Enter side of the square");
                S= s.nextInt();
        }

        int perimeter(){
                int c=S;
                System.out.print("Perimeter of the square is: ");
                return 4*c;
        }
        int area(){
               int c=S;
                System.out.print("Area of the square is: ");
                return c*c;
        }
}

//class rectangle
class rectangle{
        int l,b;

        Scanner s= new Scanner(System.in);
        void getsides(){
                System.out.println("Enter sides of the rectangle");
                l= s.nextInt();
                b= s.nextInt();
        }

        int perimeter(){
                int x=l,y=b;
                System.out.print("Perimeter of the rectangle is: ");
                return 2*(x+y);
        }
        int area(){
                int x=l,y=b;
                System.out.print("Area of the rectangle is: ");
                return x*y;
        }
}
class Circle{
        float r,pi=3.14f;

        Scanner s= new Scanner(System.in);
        void getsides(){
                System.out.println("Enter the radius of the circle");
                r= s.nextFloat();
        }

        float perimeter(){
                float z=r;
                System.out.print("Perimeter of the circle is: ");
                return 2*pi*z;
        }
        float area(){
                float z=r;
                System.out.print("Area of the circle is: ");
                return pi*z*z;
        }
}

public class Class{
        public static void main(String[] args){
        Employee M= new Employee();
        M.salary = 80000;
        M.setname();
        // M.setname("Muskan");
        System.out.println(M.getname());
        System.out.println(M.getsalary());
        square A= new square();
       
        A.getside();
        System.out.println(A.area());
        System.out.println(A.perimeter());
        
        rectangle B= new rectangle();
        B.getsides();
        System.out.println(B.area());
        System.out.println(B.perimeter());

        Circle C= new Circle();
        C.getsides();
        System.out.println(C.area());
        System.out.println(C.perimeter());
            
}
}
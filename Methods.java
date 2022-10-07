import java.util.Scanner;

public class Methods {
        // if we write static then we dont have to make an onject else we need to make
        // the object of the class
        static float Average(float x, float y) {
                float z = (x + y) / 2;
                return z;
        }
        float sum(float a,float b){
                float c=a+b;
                return c;
        }

        void multi(float a,float b){
                float m=a*b;
                System.out.println(m);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter x and y:");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                Methods obj= new Methods();
                Methods ob= new Methods();
                System.out.println("The sum of two numbers is "+ obj.sum(a,b));
                System.out.print("The average of two numbers is :");
                System.out.println(Average(a, b));
                ob.multi(a, b);
                sc.close();
        }
}
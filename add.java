import java.util.Scanner;

public class add{
    public static void main(String[] args) {
        /*int a=5,b=20,c;
        c=a+b;
        System.out.println(c);*/

        //kms to  miles  1km= .621371miles
        Scanner sc= new Scanner(System.in);
        sc.close();
       /*  System.out.println("enter km :");
        int km= sc.nextInt();
        float miles= km*0.621371f;
        System.out.println(miles);*/

        System.out.println(sc.hasNextInt());  //tells if the number is an int or  not
    }
}
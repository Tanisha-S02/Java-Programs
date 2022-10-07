import java.util.Scanner;

public class Array_avg{
        public static void main(String[] args){
            Scanner s= new Scanner(System.in);
            System.out.print("Enter array elements :");
            int arr[]=new int[5];
            for(int i=0;i<5;i++)
            arr[i]= s.nextInt();
            
            float avg=0;
            for(int e:arr){
                avg+=e;
            }
            System.out.println("Average is :"+ avg/2f);
            s.close();
}
}
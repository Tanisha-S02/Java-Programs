import java.util.Scanner;

public class Linearsearch{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter  n:");
        // int n = s.nextInt();
        int arr[]= new int[6],i=0,data;
        System.out.println("Enter array elements :");
        while(i<6){
            arr[i]= s.nextInt();
            i++;
        }
        System.out.println("Enter the data to be searched:");
        data= s.nextInt();

        s.close();
       for(i=0;i<6;i++){
            if(arr[i]==data)
            System.out.println("Data found at index "+i);
        }
}
}
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int arr[]= new int[5];
        int arr[]= new int[]{1,2,3,4,5};
        

        s.close();
        for(int i=0;i<5;i++)
        System.out.print(arr[i]+" ");
    }
}
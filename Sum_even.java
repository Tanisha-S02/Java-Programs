import java.util.Scanner;
public class Sum_even{
     public static void main(String[] args){
        Scanner s= new Scanner(System.in);  
        System.out.println("Enter  n:"); 
        int n= s.nextInt();
        int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum+=(2*i);
        // }
int i=1;
        while(i<=n){
            sum+=(2*i);
            i++;
        }
        System.out.println(sum);
//sum odd
        int sumO=0;
        for(int j=0;j<n;j++){
                sumO+=(2*j + 1);
        }
        System.out.println(sumO);
        s.close();
}
}
public class Reverse{
        public static void main(String[] args){
           int arr[]= {2,4,3,6,8,7};
           int l=arr.length;
           int n= Math.floorDiv(l,2);
           for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
           }
           for(int a:arr)
           System.out.print(a+" ");
}
}
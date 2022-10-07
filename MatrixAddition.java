public class MatrixAddition{
    public static void main(String[] args){
        int arr[][]= new int[][]{{1,2,3,4},{5,6,7,8}};
        int brr[][]= new int[][]{{7,5,2,9,},{2,3,2,9}};
        for(int i=0;i<arr.length;i++){
            System.out.print("\n");
            for(int j=0;j<arr[i].length;j++)
            System.out.print(arr[i][j]+brr[i][j]+" ");
        }
}
}
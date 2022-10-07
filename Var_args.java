public class Var_args{
        //var args can take as many inputs as they want and  they store them or keep them in an array!
        static int sum(int ...arr){
                int ans=0;
                for(int a:arr){
                        ans+=a;
                }
                return ans;
        }
        // static int sum(int x,int ...arr){// if we keep it like this then one arg is compulsory to be given.
                

        public static void main(String[] args){
                System.out.println(sum(5,6,5,6));
            

}
}
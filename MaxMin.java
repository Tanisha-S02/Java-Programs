public class MaxMin {
    public static void main(String[] args) {
        int a[] = { 34, 56, 78, 93, 12, 42 };
        int max = 0, min;

        /*for (int w = 0; w < a.length - 1; w++) {
            for (int x = 1; x < a.length; x++) {
                if (a[w] > a[x])
                    max = a[w];
            }
        }*/
        for(int e:a){
            if(e>max)
            max=e;
        }
        System.out.println(max);

        min=a[0];
        for(int e:a){
            if(e<min)
            min=e;
        }
        
        System.out.println(min);
    }
}
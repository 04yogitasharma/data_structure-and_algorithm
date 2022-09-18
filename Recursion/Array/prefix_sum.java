package Array;

public class prefix_sum{
    static int[] prefix_sum_(int arr[]){
        int n=arr.length;
        int prefix[]= new int[n];
        prefix[0]=arr[0];
        System.out.print(prefix[0]+" ");
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
            System.out.print( prefix[i]+" ");
        }
        return prefix;
    }

    static int getSum(int prefix_sum[],int l,int r){
        System.out.println();
        if(l!=0){
            return prefix_sum[r]-prefix_sum[l-1];
        }
        else{
            return prefix_sum[r];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,9,3};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // prefix_sum_(arr);
        System.out.println(getSum(prefix_sum_(arr),2,3)); 
    }
}
package Array;

public class maximum_sum_subarray {
    static int maxSum(int arr[]){
        int n=arr.length;
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i], arr[i]);
            res=Math.max(maxEnding, res);

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={-3,8,-2,4,-5,6};
        System.out.println(maxSum(arr)); 
    }
}

package Searching;

public class two_pointer {
    static int Ispresent(int arr[],int sum){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            if(arr[low]+arr[high]==sum){
                System.out.println("{ "+arr[low]+" , "+arr[high]+" }");
                return 1; 
            }
            else if(arr[low]+arr[high]>sum){
                high--;
            }
            else{
                low++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44,66,99};
        int sum=77;
        System.out.println(Ispresent(arr,sum)); 
    }
}

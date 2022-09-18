package Searching;

public class sorted_rotated_array {
    static int search(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[low]<arr[mid]){
                if(x>=arr[low]&&x<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(x>arr[mid]&&x<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={20,30,40,50,10,15};
        int c=search(arr,40);
        System.out.println(c);
    }
}

//INDEX OF LAST OCCURRENCE OF THE NUMBER
package Searching;

public class lastOccurence_search {
    static int  binarySearch(int arr[],int a){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (arr[mid]>a){
                high=mid-1;
            } 
            else if(arr[mid]<a){
                low=mid+1;
            }
            else{
                if(mid==n-1||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,55,55,66};
        int c=binarySearch(arr,55);
        System.out.println("The last occurrence of a number is at index :"+c);
    }
}

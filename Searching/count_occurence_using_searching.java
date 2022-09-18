package Searching;

public class count_occurence_using_searching {
    static int  first_Search(int arr[],int a){
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
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    static int  last_Search(int arr[],int a){
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

    static int count_occurrence(int arr[],int n,int x){
        int first=first_Search(arr,x);
        if(first==-1){
            return 0;
        }
        else{
            return ((last_Search(arr, x))-first+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={11,33,33,33,33,33,33,33,66,88,88,88,90};
        int n=arr.length;
        int c=count_occurrence(arr,n,33);
        System.out.println("The occurrence of a "+33+ " is: "+c);
    }
}

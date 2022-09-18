package Searching;
public class linear_search {
    static int linearSearch(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={11,55,33,99,44,88};
        int c=linearSearch(arr,88);
        System.out.println("The number is at index :"+c);

    }
}

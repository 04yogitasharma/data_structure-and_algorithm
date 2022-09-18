package Sorting;

public class insertion_sort {
    static void insert_sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,30,55,2,32,7};
        insert_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");}
    }
}

package Sorting;

public class _hoare_quick_sort {
    static void quick_sort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            quick_sort(arr, l, p);
            quick_sort(arr, p+1, h);
        }
    }

    static int partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l-1;
        int j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={11,33,7,90,4};
        int l=0;
        int h=4;
        quick_sort(arr,l,h);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

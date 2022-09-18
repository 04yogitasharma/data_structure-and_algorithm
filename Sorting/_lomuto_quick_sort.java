package Sorting;

public class _lomuto_quick_sort{
    static void quickSort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, h);
        }
    }

    static int partition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return (i+1);
    }

    public static void main(String[] args) {
        int arr[]={11,4,8,90,5,25};
        int l=0;
        int h=5;
        quickSort(arr,l,h);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

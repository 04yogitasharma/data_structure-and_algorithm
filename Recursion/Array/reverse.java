package Array;

public class reverse {
    static void reverse_array(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    static void reversing(int arr[]){
        int low=0,high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]+" ");}
    }
    public static void main(String[] args) {
        int arr[]={11,33,55,77,99};
        // reverse_array(arr);
        reversing(arr);

    }
}

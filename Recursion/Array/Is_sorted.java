package Array;

public class Is_sorted {
    static boolean sorted(int arr[]){
        for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={11,2,33,44};
        boolean c=sorted(arr);
        if(c==true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted ");
        }
        System.out.println(c);
    }
}

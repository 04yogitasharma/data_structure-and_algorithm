package Array;

public class largest_element {
    static int getLarge(int arr[]){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        System.out.println("The largest element is:"+arr[res]);
        return res;
    }
    public static void main(String[] args) {
        int []arr={20,30,40,50,5,32,100};
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");}
        System.out.println();
        int c=getLarge(arr);
        System.out.println("The largest element is at index:"+c);
    }
}

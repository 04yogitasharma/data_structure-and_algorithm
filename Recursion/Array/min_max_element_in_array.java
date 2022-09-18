package Array;

public class min_max_element_in_array {
    public static void max(int [] arr){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        System.out.println(arr[res]);
         
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[res]){
                res=i;
            }
        }   
        System.out.println(arr[res]);
    }
    public static void main(String[] args) {
        int [] arr={11,6,45,89,76};
        max(arr);
    }
}

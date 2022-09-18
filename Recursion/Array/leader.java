package Array;

public class leader {
    static void leading_no(int arr[]){
        int curr_leader=arr[arr.length-1];
        System.out.println(curr_leader);
        for(int i=arr.length-2;i>=0;i--){
            if(curr_leader<arr[i]){
                curr_leader=arr[i];
                System.out.println(curr_leader+" ");
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={100,7,4,13,5,2};
        leading_no(arr);
    }
}

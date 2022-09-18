package Array;

public class consecutive_ones {
    static int consecutive_1(int arr[]){
        int res=0,curr=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                res=Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,1};
        System.out.println(consecutive_1(arr)); 
    }
}

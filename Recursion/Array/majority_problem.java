package Array;

public class majority_problem {
    static int maximum_appear_number(int arr[]){
        int res=0,count=1;
        int n=arr.length;
        for(int i=1;i<n;i++){
           if(arr[res]==arr[i]){
               count++;
           }
           else{
               count--;
           }
           if(count==0){
               res=i;
               count=1;
           }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count<=n/2){
            res=-1;    
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,22,44,66,22,22,22,2,2,2,2,2,2};   //majority problem is when a number appear more than n/2 times in an array where n is the size of array
        System.out.println(maximum_appear_number(arr));
    }
}

package Array;

public class Equillibrium_point {
    static boolean check_Equilibrium(int arr[]){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        int l_sum=0;
        for(int i=0;i<n;i++){
            if(l_sum==sum-arr[i]){
                return true;
            }
            l_sum+=arr[i];
            sum-=arr[i];
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,5,1,3};
        
        System.out.println(check_Equilibrium(arr));
    }
}

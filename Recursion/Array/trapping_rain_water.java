package Array;

public class trapping_rain_water {
    static int trapping_water(int arr[],int n){
        int res=0;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        
        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }

        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }

        for(int i=1;i<n-1;i++){
            // System.out.println(res);

            res=res+(Math.min(lmax[i],rmax[i])-arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={5,2,6,2,3};
        System.out.println(trapping_water(arr,5));  
    }
}

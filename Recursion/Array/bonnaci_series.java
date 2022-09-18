package Array;

public class bonnaci_series {
    static void bonnaci(int m, int n){
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=0;
        }
        arr[n-1]=1;
        arr[n]=1;

        for(int i=n+1;i<m;i++){
             arr[i]=2*arr[i-1]-arr[i-n-1];
        }

        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int m=8;
        int n=2;
        bonnaci(m,n);
    }
}

package Array;

public class second_largest {
    static int secLarge(int arr[]){
        int n=arr.length;
        int res=-1,largest=0,i;
        for( i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;

            }
            else if(arr[i]!=arr[largest]){
                if(res==-1||arr[i]>arr[res]){
                   res=i;
                }
            }

        }
        System.out.println("The second largest element is:"+arr[res]);
        return res;
    }
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");}
        System.out.println();    
        int c=secLarge(arr);
        System.out.println("The second largest element is at index : "+c);
    }
}

package Array;

public class delete {
    static int delete_no(int arr[],int size,int number){
        int i;
        for(i=0;i<size;i++){
            if(arr[i]==number){
            break;}
        }
        if(i==size){
            return size;
        }
        for(int j=i;j<size-1;j++){
            arr[j]=arr[j+1];
        }
        return size-1;
    }
    public static void main(String[] args) {
        int arr[]={22,44,66,88};
        int c=delete_no(arr,4,88);
        for(int j=0;j<c;j++){
            System.out.print(arr[j]+" ");}
    }
}

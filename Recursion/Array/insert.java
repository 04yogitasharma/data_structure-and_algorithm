package Array;

public class insert {
    static int insert_no(int arr[],int size,int number,int pos,int cap){
        if(size==cap){
            return size;
        }

        int index=pos-1;
        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=number;
        
        return size+1;
    }
    public static void main(String[] args) {
        int arr[]=new int[7];
        arr[0]=2;
        arr[1]=21;
        arr[2]=22;
        arr[3]=23;
        arr[4]=24;
        System.out.println("BEFORE INSERTION");
        for(int j=0;j<7;j++){
            System.out.print(+arr[j]+" ");}
        System.out.println();    
        
        int n=5;
        int cap=7;
        int x=20;
        int c=insert_no(arr,n,x,2,cap);
        System.out.println("AFTER INSERTION");

        for(int j=0;j<c;j++){
            System.out.print(arr[j]+" ");}
    }
}

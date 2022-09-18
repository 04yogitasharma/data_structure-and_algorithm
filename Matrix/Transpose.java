package Matrix;

public class Transpose {
    static void swap(int arr[][],int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }

    static void print_Transpose(int arr[][]){
        int R=4;                                                //ROTATING ARRAY ANTICLOCKWISE BY 90 DEGREE
        int C=4;                                                //FIRST TAKE TRANSPOSE AND THEN REVERSE THE ROWS 
        for(int i=0;i<R;i++){
            for(int j=i+1;j<C;j++){
                swap(arr,i,j);
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        print_Transpose(arr);

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }             
    }
}

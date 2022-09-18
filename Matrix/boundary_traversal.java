package Matrix;

public class boundary_traversal {
    static void printBoundary(int arr[][]){
        int R=4;
        int C=4;
        if(R==1){
            for(int i=0;i<C;i++){
                System.out.println(arr[0][i]+" ");
            }
        }

        else if(C==1){
            for(int i=0;i<R;i++){
                System.out.println(arr[i][0]+" ");
            }
        }

        else{
            for(int i=0;i<C;i++){
                System.out.print(arr[0][i]+" ");
            }
            for(int j=1;j<R;j++){
                System.out.print(arr[j][C-1]+" ");
            }
            for(int i=C-2;i>=0;i--){
                System.out.print(arr[R-1][i]+" ");
            }
            for(int j=R-2;j>=1;j--){
                System.out.print(arr[j][0]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        printBoundary(arr);             
    }
}

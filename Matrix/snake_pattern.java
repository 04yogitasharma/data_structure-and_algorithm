package Matrix;

public class snake_pattern {
    static void print_SnakePattern(int arr[][]){
          int R=4;                                  // R IS THE NO. OF ROWS
          int C=4;                                  // C IS THE NO. OF COLUMNS
          for(int i=0;i<R;i++){
              if(i%2==0){
                  for(int j=0;j<C;j++){
                      System.out.print(arr[i][j]+" ");
                  }
                //   System.out.println();
              }
              else{
                  for(int j=C-1;j>=0;j--){
                      System.out.print(arr[i][j]+" ");
                  }
                //   System.out.println();
              }
          }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        print_SnakePattern(arr);             
    }
}

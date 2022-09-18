package Matrix;

public class SearchMatrix {
    static void search(int arr[][],int x){
        int R=4;int C=4;int k=0;
        int i=0;int j=C-1;
        while(i<R&&j>=0){
            if(arr[i][j]==x){
                System.out.print(k+" iteration"+"\t");
                System.out.println(x+" Found at ("+i+","+j+")");
                return;
            }
            else if(arr[i][j]>x){
                System.out.println(k+" iteration");
                j--;
                k++;
            }
            else{
                System.out.println(k+" iteration");
                i++;
                k++;
            }
        }
        System.out.println("NOT FOUND");
    }
     public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,49},                       //MATRIX IS ROW-WISE OR COLUMN-WISE SORTED
                     {32,33,39,50}};

        int x=32;
        search(arr,x);
    }
}

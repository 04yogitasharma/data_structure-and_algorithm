package Matrix;

public class Add_2Darray {
    static void Add(int arr1[][],int arr2[][]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
        System.out.println("");
        }

        System.out.print("\n");


        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
        System.out.println("");
        }
        System.out.print("\n");

        System.out.println("ADDITION OF ARR1 AND ARR2");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print((arr1[i][j]+arr2[i][j])+" ");
            }
        System.out.println("");
        }        
    }
    public static void main(String[] args) {
        int arr1[][]={{1,1,1},
                      {1,1,1}};

        int arr2[][]={{1,1,1},
                      {1,1,1}};
                      
        Add(arr1,arr2);              
    }
}

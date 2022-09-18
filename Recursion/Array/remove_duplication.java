package Array;

public class remove_duplication {
    static int duplicate_array(int arr[]){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        
        }   
        return res;
    }
  public static void main(String[] args) {
      int arr[]={10,10,20,20,30,30,30};
      for(int m=0;m<arr.length;m++){
        System.out.print(arr[m]+" ");}
      int c=duplicate_array(arr);
      System.out.println("\n"+c);
      for(int j=0;j<c;j++){
        System.out.print(arr[j]+" ");
      }
      } 
}

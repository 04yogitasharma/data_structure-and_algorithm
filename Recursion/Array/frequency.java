package Array;

public class frequency {
    static void frequency_no(int arr[]){
        int fre=1,i=1;
        while(i<arr.length){
            while(i<arr.length&&arr[i]==arr[i-1]){
                fre++;
                i++;
            }
            System.out.println(arr[i-1]+"  "+fre);
            i++;
            fre=1;
        }
        if(arr.length==1||arr[arr.length-1]!=arr[arr.length-2]){
            System.out.println(arr[arr.length-1]+" "+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,6,6,4,4,4,4,5,5};
        frequency_no(arr);
    }
}

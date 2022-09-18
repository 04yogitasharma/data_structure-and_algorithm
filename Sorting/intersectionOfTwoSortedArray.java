package Sorting;

public class intersectionOfTwoSortedArray {
    static void intersection(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 &&a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={5,5,10,20,20,20,15};
        int b[]={5,10,20,20,46};
        intersection(a,b);
    }
}

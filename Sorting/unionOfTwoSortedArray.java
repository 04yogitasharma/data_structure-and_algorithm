package Sorting;

public class unionOfTwoSortedArray {
    static void union(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0&&a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0&&b[j]==b[j-1]){
                j++;
                continue;
            }
            
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else if(b[j]<a[i]){
                System.out.print(b[j]+" ");
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }

        while(i<m){
            if(i>0&&a[i]!=a[i-1]){
                System.out.print(a[i]+" ");
                i++;
            } 
        }
        while(j<n){
            if(j>0&&b[j]!=b[j-1]){
                System.out.print(b[j]+" ");
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={30,40,50,60,70};
        union(a,b);
    }
}

package Sorting;

import java.util.Arrays;

public class chocolate_distribution_problem{
    public static void main(String[] args) {
        int arr[]={11,4,8,55,23,9};         
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");}
        int m=3;
        int res=(arr[m-1])-arr[0];
        for(int i=1;i+m-1<arr.length;i++){
            res=Math.min(res,arr[i+m-1]-arr[i]);
        }
        System.out.println("\nMinimum packets of chocolate will be:"+res);
    }
}
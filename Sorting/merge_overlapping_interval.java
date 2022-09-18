package Sorting;

import java.util.Arrays;

class interval implements Comparable<interval>{
    int s,e;
    interval(int s,int e){
        this.s=s;
        this.e=e;
    }
    public int compareTo(interval a){
        return this.s-a.s;
    }
}

public class merge_overlapping_interval {
    public static void main(String[] args) {
        interval arr[]={new interval(5,10),new interval(3,15),new interval(18,30),new interval(2,7)};
        int n=arr.length;
        mergeInterval(arr,n);
    }
    static void mergeInterval(interval arr[],int n){
        Arrays.sort(arr);
        int res=0;
        for(int i=1;i<n;i++){
            if(arr[res].e>=arr[i].s){
                arr[res].s=Math.min(arr[res].s,arr[i].s);
                arr[res].e=Math.max(arr[res].e,arr[i].e);
            }
            else{
                res++;
                arr[res]=arr[i];
            }
        }
        for(int i=0;i<=res;i++){
            System.out.println("["+arr[i].s+","+arr[i].e+"]");
        }
    }
}

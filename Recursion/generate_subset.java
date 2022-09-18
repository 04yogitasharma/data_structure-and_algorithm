package Recursion;

public class generate_subset {
    static void printsub(String str, String current, int index){
        if(index==str.length()){
            System.out.print("'"+current+"' ,"+" ");
            return;
        }
        printsub(str, current, index+1);
        printsub(str, current+str.charAt(index), index+1);
    }
    public static void main(String[] args) {
        String str="ABC";
        printsub(str,"",0);  //string,default substring,index
    }
}

package LinkedList;

public class searchelementrecursively {
    public static void main(String[] args) {
        Node head=new Node(40);
        Node temp1=new Node(30);
        Node temp2=new Node(20);
        Node temp3=new Node(10);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        printLinkedList(head);
        System.out.println(searchRecursively(head,20));
    }
    public static void printLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static int searchRecursively(Node head,int x){
        if(head==null){return -1;}
        if(head.data==x){return 1;}
        else{
            int res=searchRecursively(head.next, x);
            if(res==-1){return -1;}
            else{
                return res+1;
            }
        }
    }
}

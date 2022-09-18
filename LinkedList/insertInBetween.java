package LinkedList;

public class insertInBetween {
    public static void main(String[] args) {
        Node head=null;
        head=insertbegin(head,40);
        head=insertbegin(head,30);
        head=insertbegin(head,20);
        head=insertbegin(head,10);
        printLinkedList(head);
        head=insertbetween(head,2,15);
        System.out.println();
        printLinkedList(head);
    }
    public static Node insertbegin(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    public static void printLinkedList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node insertbetween(Node head,int pos,int x){
        Node temp=new Node(x);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=1;i<=pos-2&&curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
}

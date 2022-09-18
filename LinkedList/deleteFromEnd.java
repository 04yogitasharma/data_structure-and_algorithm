package LinkedList;

public class deleteFromEnd {
    public static void main(String[] args) {
        Node head=null;
        head=insertAtBegin(head,10);
        head=insertAtBegin(head,20);
        head=insertAtBegin(head,30);
        head=insertAtBegin(head,40);
        printLinkedList(head);
        head=deleteend( head);
        System.out.println();
        printLinkedList(head);

    }
    public static Node insertAtBegin(Node head,int x){
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
    public static Node deleteend(Node head){
        if(head==null){return null;}
        if(head.next==null){return null;}
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
}

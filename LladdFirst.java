public class LladdFirst {
    public static void main(String args[]){
        Node head = new Node(1);
        Node temp =    addFirst(head, 0);

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node addFirst(Node head,int value){
        Node newNode = new Node(value);
        
        if(head == null){
              
            return newNode;

        }
        newNode.next = head;
        
        return newNode;
    }
}
class Node{
    int data ;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;

    }
   
}
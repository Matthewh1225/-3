public class LList {
    Node head;
    int size;
    Node last;

    public void add(Object info){
        Node nodeToAdd = new Node();
        nodeToAdd.setInfo(info);
        nodeToAdd.setNext(null);
        if (head==null){
            nodeToAdd.setPre(null);
            head = nodeToAdd;
        }else{
            Node nextNode = head;
            while (nextNode.getNext()!= null){
                nextNode= nextNode.getNext();
            }
            nodeToAdd.setPre(nextNode);
            nextNode.setNext(nodeToAdd);
        }
        size++;
    }
    public Object getData(int info){
        System.out.println(head.getInfo());

        return head.getInfo();
    }

    public void setHead(Node head){
        this.head=head;
    }

    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.getInfo() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
    public void size(){
        Node current = head;
        int count=1;
        while (current.next!=null){
            current=current.next;
            count+=1; 
        }
        System.out.println("The LinkedList is " + count + " nodes long");
        System.out.println(size);
    }
    
    
}

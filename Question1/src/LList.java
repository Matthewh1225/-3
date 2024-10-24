
public class LList {
    Node head;
    int size;
    Node last;

    public void addEnd(Object info){
        Node nodeToAddEnd = new Node();
        nodeToAddEnd.setInfo(info);
        nodeToAddEnd.setNext(null);
        if (head==null){
            nodeToAddEnd.setPre(null);
            head = nodeToAddEnd;
        }else{
            Node nextNode = head;
            while (nextNode.getNext()!= null){
                nextNode= nextNode.getNext();
            }
            nodeToAddEnd.setPre(nextNode);
            nextNode.setNext(nodeToAddEnd);
        }
        size++;
    }
    public Node AddBegining(Object info){
        Node nodeToAddBegining = new Node();
        nodeToAddBegining.setPre(null);
        nodeToAddBegining.setInfo(info);
        nodeToAddBegining.setNext(null);
        nodeToAddBegining.setNext(head);
        head=nodeToAddBegining;
        return head;
    }
    public void setHead(Node head){
        this.head=head;
    }
    public int search(Object value){
        Node travel = head;
        int countIndex=0;

        while(travel!=null){
            if (travel.getInfo().equals(value)){
                System.out.println(value + " is at position " +countIndex);
                return countIndex;
            }
            travel=travel.getNext();
            countIndex++;
        }
        System.out.println("Not Found");
        return -1;
        }
        
       
   public Object GetValue(int indexToFind){
    Node travel = head;
        int countIndex=0;

        while(travel!=null){
            if (countIndex==indexToFind){
                return travel.getInfo() ;
            }
            countIndex++;
        }
        System.out.println("value at position "+ countIndex+ " is "+travel.getInfo());
        return countIndex; 

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

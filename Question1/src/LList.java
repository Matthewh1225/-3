
public class LList {
    Node head;
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
    }
    public Node addBegining(Object info){
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
        System.out.println(value+" Not Found");
        return -1;
        }
   public Object get(int indexToFind){
    Node travel = head;
        int countIndex=0;
        while(travel!=null){
            if (countIndex==indexToFind){
                //System.out.println("value at position "+ indexToFind+ " is "+travel.getInfo());
                return travel.getInfo() ;
            }
            travel=travel.getNext();
            countIndex++;  
        }
        //System.out.println("index "+ indexToFind+ " out of bounds for list size "+countIndex );
        return null; 
   }
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.getInfo() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
    public int size(){
        Node current = head;
        int count=1;
        while (current.next!=null){
            current=current.next;
            count+=1; 
        }
        System.out.println("The LinkedList is " + count + " nodes long");
      return count;
    }
    public void set(int nodeIndex, Object replace){
        Node travel = head;
        int countIndex=0;
        while(travel!=null){
            if (countIndex == nodeIndex){
                if(travel.info!=null){
                    System.out.println(travel.getInfo() + " was replaced with " + replace);
                travel.info = replace;
                return; 
                }
                else{
                    System.out.println("node "+nodeIndex +" set to "+replace);
                }
            }
            travel=travel.getNext();
            countIndex++;
        }
        if(countIndex>nodeIndex){
            System.out.println("Index out of bounds");
        }
        
    }
}

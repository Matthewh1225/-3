

public class LList<T> {

    Node<T> head;
    Node<T> tail;
    int size=0;

    public void addEnd(T info){
        Node<T> nodeToAddEnd = new Node<>();
        nodeToAddEnd.setInfo(info);
        nodeToAddEnd.setNext(null);
        if (head==null){
            nodeToAddEnd.setPre(null);
            head = nodeToAddEnd;
           
        }else{
            nodeToAddEnd.setPre(tail);
            tail.setNext(nodeToAddEnd);  
        } 
        tail = nodeToAddEnd;
        this.size++;
    }
    public Node<T> addBegining(T info){
        Node<T> nodeToAddBegining = new Node<>();
        nodeToAddBegining.setPre(null);
        nodeToAddBegining.setInfo(info);
        nodeToAddBegining.setNext(head);
        if(head!=null){
            head.setPre(nodeToAddBegining);

        }
        head=nodeToAddBegining;
        this.size++;

        return head;
    }
    public void removeByIndex(int index){
        Node<T> current = head;
        int count = 0;
        this.size--;
        while(current!=null){
            if(count==index){
                if( current==head){
                    head=current.getNext();
                }
                if(current.pre!=null){
                    current.pre.next=current.next;
                }
                if (current.next!=null){
                    current.next.pre=current.pre;
                }
            }
            current=current.getNext();
            count++; 
        }
    } 
    public void removeByValue(T value){
        Node<T> current = head;
        this.size--;
        while(current!=null){
            if(current.getInfo().equals(value)){
                if( current==head){
                    head=current.getNext();
                }
                if(current.pre!=null){
                    current.pre.next=current.next;
                }
                if (current.next!=null){
                    current.next.pre=current.pre;
                }
            }
            current=current.getNext();
        }
    }   
    public int search(T value){
        Node<T> travel = head;
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
   public Object get(int indexToGet){
    Node<T> travel = head;
        int countIndex=0;
        while(travel!=null){
            if (countIndex==indexToGet){
                System.out.println(travel.getInfo());
                return travel.getInfo() ;
            }
            travel=travel.getNext();
            countIndex++;  
        }
        System.out.println("index "+ indexToGet+ " out of bounds for list size "+countIndex );
        return null; 
   }

    public void display(){
        Node<T> current = head;
        while (current.getNext() != null) {
            System.out.print(current.getInfo() + " -> ");
            current = current.getNext();
        }
        System.out.print(current.getInfo() + " -> ");
        System.out.println("null");

        // while (current.getPre() != null) {
        //     System.out.print(current.getInfo() + " -> ");
        //     current = current.getPre();
        // }
        // System.out.print(current.getInfo() + " -> ");
        // System.out.println("null");
    }
    public int size(){
        System.out.println("The LinkedList is " + this.size + " nodes long");
      return this.size; 
    }
    public void set(int nodeIndex, T replace){
        Node<T> travel = head;
        int countIndex=0;
        while(travel!=null){
            if (countIndex == nodeIndex){
                System.out.println("index "+nodeIndex + " set to " + replace);
                travel.setInfo(replace);
                return; 
            }
            travel=travel.getNext();
            countIndex++;
        }
        if(countIndex>nodeIndex){
            System.out.println("Index"+nodeIndex+" out of bounds");
        }  
    }
    public void sort()throws Exception{
        
        if(head.info.getClass()!=Integer.class){
            throw new Exception("Can only sort Integers");    
        }
        Node<T> current = head;
        Integer temp;
        for (int i = 0 ; i < this.size-1 ; i++){
            if(current==tail){
                current=head;
            }
            while (current.getNext()!=null){
                if((Integer)current.getInfo() > (Integer)current.next.info){
                    temp = (Integer)current.next.getInfo();
                    current.next.info=current.getInfo();
                    current.info=(T)temp;
                }
                current=current.getNext(); 
            }
        }
    }
}

public class LList<T> {

    Node<T> head;
    Node<T> tail;
    int size=0;

    public void addEnd(T info){
        Node<T> nodeToAddEnd = new Node<>();
        nodeToAddEnd.setInfo(info);
        nodeToAddEnd.setNext(null);
        if (head==null || tail==null){
            nodeToAddEnd.setPre(null);
            head = nodeToAddEnd;
           
        }else{
            nodeToAddEnd.setPre(tail);
            tail.setNext(nodeToAddEnd);  
        } 
        tail = nodeToAddEnd;
        size++;
    }

    public Node<T> addBegining(T info){
        Node<T> nodeToAddBegining = new Node<>();
        nodeToAddBegining.setPre(null);
        nodeToAddBegining.setInfo(info);
        nodeToAddBegining.setNext(head);
        if(head!=null){
            head.setPre(nodeToAddBegining);
        }
        else{
            tail=nodeToAddBegining;
        }
        head=nodeToAddBegining;
        size++;

        return head;
    }
    public void removeByIndex(int index){
        Node<T> current = head;
        int count = 0;
        while(current!=null){
            if(count==index){
                if( current==head){
                    head=current.getNext();
                }
                if( current==tail){
                    tail=current.getPre();
                }
                if(current.getPre()!=null){
                    current.getPre().setNext(current.getNext());
                }
                if (current.getNext()!=null){
                    current.getNext().setPre(current.getPre());
                }
                size--;
            }
            current=current.getNext();
            count++; 
        }
    } 

    public void removeByValue(T value){
        Node<T> current = head;
        
        while(current!=null){
            if(current.getInfo().equals(value)){
                if( current==head){
                    head=current.getNext();
                }
                if( current==tail){
                    tail=current.getPre();
                }

                if(current.getPre()!=null){
                    current.getPre().setNext(current.getNext());
                }
                if (current.getNext()!=null){
                    current.getNext().setPre(current.getPre());
                }
                size--;
                return;
            }
            current=current.getNext(); 
        } 
    }  

    public int search(T value){
        Node<T> travel = head;
        int countIndex=0;
        while(travel!=null){
            if (travel.getInfo().equals(value)){
                return countIndex;
            }
            travel=travel.getNext();
            countIndex++;
        }
        return -1;
    }

    public Object get(int indexToGet){
     Node<T> travel = head;
        int countIndex=0;
        while(travel!=null){
            if (countIndex==indexToGet){
                return travel.getInfo() ;
            }
            travel=travel.getNext();
            countIndex++;  
        }
        return null; 
    }

    public int size(){
      return size; 
    }

    public void set(int nodeIndex, T replace)throws IndexOutOfBoundsException{
        Node<T> travel = head;
        int countIndex=0;
        while(travel!=null){
            if (countIndex == nodeIndex){
                travel.setInfo(replace);
                return; 
            }
            travel=travel.getNext();
            countIndex++;
        }
        if(countIndex>size){
            throw  new IndexOutOfBoundsException();
        }  
    }

    public void sort()throws Exception{
        if(head.getInfo().getClass()!=Integer.class){
            throw new Exception("Can only sort Integers");    
        }
        Node<T> current = head;
        Integer temp;
        for (int i = 0 ; i < size-1 ; i++){
            if(current==tail){
                current=head;
            }
            while (current.getNext()!=null){
                if((Integer)current.getInfo() > (Integer)current.getNext().getInfo()){
                    temp = (Integer)current.getNext().getInfo();
                    current.getNext().setInfo(current.getInfo());
                    current.setInfo((T)temp);
                }
                current=current.getNext(); 
            }
        }
    }
    
}

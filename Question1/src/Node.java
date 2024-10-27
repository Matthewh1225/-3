
public class Node<T> {

    T info;
    Node<T> next;
    Node<T> pre;

    public Node(){

    }
    public Node(T info,Node<T> next){
        this.next=next;
        this.info=info;
    }

    Node<T> getPre(){
        return this.pre;
    }
    T getInfo(){
        return this.info;
    }
    Node<T> getNext(){
        return this.next;
    }
    void setPre(Node<T> pre){
        this.pre=pre;}

    void setNext(Node<T> next){
        this.next=next;
    }
    void setInfo( T info){
         this.info=info;
    }

    public static void main(String[] args) throws Exception {
        LList<Integer> list = new LList<>();

        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.addEnd(4);
        list.addEnd(5);
      
        System.out.println("\n");
        list.display();
        list.size();
        list.sort();
        list.display();
     
    }
}
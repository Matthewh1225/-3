public class LList{
    private Node head;
    private int size;
    private Node last;

    public void add(Object current){
        if (head==null){
            Node nodeToAdd = new Node();
            nodeToAdd.setNext(head);
            head = nodeToAdd;
        }else{
            Node keyNode = head;
            Node nodeToAdd = new Node("cats",null);
            nodeToAdd.setCurrent(current);
            // while (keyNode.getNext()!= null){
            //     keyNode=keyNode.getNext();
            // }
            nodeToAdd.setPre(keyNode);
            nodeToAdd.setNext(null);
            keyNode.setNext(nodeToAdd);
        }
        size++;
    }
}
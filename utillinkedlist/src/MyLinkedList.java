import javax.xml.soap.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp.next.next = null;
        numNodes++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= numNodes) {
            return false;
        } else {
            Node temp = head;
            for (int i = 0; i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next.next;
            numNodes--;
            return true;
        }
    }


}

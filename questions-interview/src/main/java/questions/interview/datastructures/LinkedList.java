package questions.interview.datastructures;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + this.head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + this.tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + this.length);
    }

    public class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
}

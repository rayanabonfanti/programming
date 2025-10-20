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

    public boolean insert(int index, int value){
        if(index < 0 || index > this.length){
            return false;
        }

        if(index == 0){
            prepend(value);
            return true;
        }

        if(index == this.length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
        return true;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public Node get(int index) {
        if(index < 0 || index >= this.length){
            return null;
        }
        Node temp = this.head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node removeFirst(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length--;
        if(this.length == 0){
            this.tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.tail = newNode;
        } else {
            newNode.next = this.head;
        }
        this.head = newNode;
        this.length++;
    }

    public Node removeLast(){
        if (this.length == 0) {
            return null;
        }
        Node temp = this.head;
        Node pre = this.head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        this.length--;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
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
        public int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
}

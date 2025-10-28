package questions.interview;

import questions.interview.datastructures.LinkedList;

public class AppLinkedList {
	public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList(1);
//
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.getLength();
//
//        linkedList.printList();

//        LinkedList linkedList = new LinkedList(1);
//        linkedList.append(2);
//        linkedList.printList();
//
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast());
//
//        linkedList.printList();

//        LinkedList linkedList = new LinkedList(2);
//        linkedList.append(3);
//        linkedList.prepend(1);
//        linkedList.printList();

//        LinkedList linkedList = new LinkedList(2);
//        linkedList.append(1);
//
//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst());

//        LinkedList linkedList = new LinkedList(0);
//        linkedList.append(1);
//        linkedList.append(2);
//        linkedList.append(3);
//
//        System.out.println(linkedList.get(2).value + "\n");
//
//        linkedList.printList();

//        LinkedList linkedList = new LinkedList(0);
//        linkedList.append(1);
//        linkedList.append(2);
//        linkedList.append(3);
//
//        linkedList.printList();
//
//        System.out.println("Set index 1 to 10: " + linkedList.set(1, 10) + "\n");
//        linkedList.printList();

//        LinkedList linkedList = new LinkedList(0);
//        linkedList.append(2);
//
//        linkedList.printList();
//        System.out.println("Insert index 1 to 1: " + linkedList.insert(1,1) + "\n");
//        linkedList.printList();

//        LinkedList linkedList = new LinkedList(11);
//        linkedList.append(3);
//        linkedList.append(23);
//        linkedList.append(7);
//
//        linkedList.printList();
//        linkedList.remove(2);
//        linkedList.printList();

        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.printList();
        linkedList.revert();
        linkedList.printList();
	}
}
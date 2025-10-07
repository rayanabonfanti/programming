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

        LinkedList linkedList = new LinkedList(2);
        linkedList.append(1);

        System.out.println(linkedList.removeFirst().value);
        System.out.println(linkedList.removeFirst().value);
        System.out.println(linkedList.removeFirst());
	}
}
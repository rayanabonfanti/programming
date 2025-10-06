package questions.interview;

import questions.interview.datastructures.LinkedList;

public class AppLinkedList {
	public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.printList();
	}
}
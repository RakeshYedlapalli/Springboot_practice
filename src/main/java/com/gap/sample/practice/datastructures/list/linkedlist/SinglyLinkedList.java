package com.gap.sample.practice.datastructures.list.linkedlist;

public class SinglyLinkedList {

    public ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(18);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(15);

        singlyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        new SinglyLinkedList().printTheSingleListData(singlyLinkedList);
        new SinglyLinkedList().insertAtLast(singlyLinkedList, new ListNode(300));
        //new SinglyLinkedList().insertAtBeginning(singlyLinkedList, new ListNode(234));

        //new SinglyLinkedList().insertValueAtGivenPosition(singlyLinkedList, new ListNode(3003), 6);
        // new SinglyLinkedList().deleteFirstNodeOfSingleList(singlyLinkedList);
        //new SinglyLinkedList().deleteLastNode(singlyLinkedList);
        // new SinglyLinkedList().deleteValueAtGivenPosition(singlyLinkedList, 3);
        //boolean isFound = new SinglyLinkedList().searchForAnValue(singlyLinkedList, 10);
       // new SinglyLinkedList().reverseSingleLinkedList(singlyLinkedList);
        //  System.out.println("Search key is ->"+(isFound?"found":"not found"));

       /* System.out.println(singlyLinkedList.head.data);
        System.out.println(second.data);
        System.out.println(second.next);*/
    }

    private int getTheListSize(SinglyLinkedList singlyLinkedList) {

        ListNode currentNode = singlyLinkedList.head;
        int size = 1;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    private int deleteAt(SinglyLinkedList singlyLinkedList, int position) {

        if (singlyLinkedList == null) return 0;
        ListNode currentNode = singlyLinkedList.head;
        int size = 0;
        while (currentNode != null) {
            if (size == position) {
                singlyLinkedList.head.next = currentNode.next;
            }
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    private void insertAtBeginning(SinglyLinkedList singlyLinkedList, ListNode newNode) {

        newNode.next = singlyLinkedList.head;
        singlyLinkedList.head = newNode;

        printTheSingleListData(singlyLinkedList);
        System.out.println("Inserted the data at first position");

    }

    private void insertAtLast(SinglyLinkedList singlyLinkedList, ListNode newNode) {
        if (singlyLinkedList.head == null) {
            singlyLinkedList.head = newNode;
            printTheSingleListData(singlyLinkedList);
            return;
        }

        ListNode currentNode = singlyLinkedList.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        printTheSingleListData(singlyLinkedList);
        System.out.println("Inserted the data at last position");
    }

    private void insertValueAtGivenPosition(SinglyLinkedList singlyLinkedList, ListNode newNode,
                                            int position) {
        if (position < 0 || position > getTheListSize(singlyLinkedList)) {
            System.out.println("Index out of bound exception");
            return;
        }

        if (position == 1) {
            newNode.next = singlyLinkedList.head;
            singlyLinkedList.head = newNode;
            printTheSingleListData(singlyLinkedList);
            return;
        }

        ListNode currentNode = singlyLinkedList.head;
        int index = 2;
        while (currentNode.next != null) {

            if (index == position) {
                ListNode nextNode;
                nextNode = currentNode.next;
                currentNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            index++;
            currentNode = currentNode.next;
        }

        printTheSingleListData(singlyLinkedList);
        System.out.println("Inserted the data at last position");
    }

    private void deleteValueAtGivenPosition(SinglyLinkedList singlyLinkedList,
                                            int position) {
        if (position == 1) {
            singlyLinkedList.head = singlyLinkedList.head.next;
        }

        ListNode previousNode = singlyLinkedList.head;
        int count = 1;
        while (count < position - 1) {
            previousNode = previousNode.next;
            count++;
        }

        ListNode current = previousNode.next;
        previousNode.next = current.next;

        printTheSingleListData(singlyLinkedList);
    }

    public void deleteFirstNodeOfSingleList(SinglyLinkedList singlyLinkedList) {

        if (singlyLinkedList.head == null || getTheListSize(singlyLinkedList) == 1) {
            System.out.println("Can't be delete the first node as a list contains only one value");
            printTheSingleListData(singlyLinkedList);
            return;
        }
        ListNode headNode = singlyLinkedList.head;
        singlyLinkedList.head = headNode.next;
        headNode.next = null;
        printTheSingleListData(singlyLinkedList);
        deleteFirstNodeOfSingleList(singlyLinkedList);

    }

    public void deleteLastNode(SinglyLinkedList singlyLinkedList) {

        ListNode headNode = singlyLinkedList.head;
        ListNode previousNode = null;
        while (headNode.next != null) {
            previousNode = headNode;
            headNode = headNode.next;
        }
        previousNode.next = null;
        printTheSingleListData(singlyLinkedList);

    }

    private void printTheSingleListData(SinglyLinkedList singlyLinkedList) {
        ListNode currentNode = singlyLinkedList.head;
        while (currentNode != null) {
            System.out.println("Data is =>" + currentNode.data);
            currentNode = currentNode.next;
        }
    }

    private void printTheSingleListData(ListNode singlyLinkedList) {
        // ListNode currentNode = singlyLinkedList.head;
        while (singlyLinkedList != null) {
            System.out.println("Data is =>" + singlyLinkedList.data);
            singlyLinkedList = singlyLinkedList.next;
        }
    }

    private boolean searchForAnValue(SinglyLinkedList singlyLinkedList, int searchValue) {
        ListNode currentNode = singlyLinkedList.head;
        while (currentNode != null) {
            if (currentNode.data == searchValue) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    private void reverseSingleLinkedList(SinglyLinkedList singlyLinkedList) {

        ListNode current = singlyLinkedList.head;
        ListNode previous = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        printTheSingleListData(previous);
    }


}

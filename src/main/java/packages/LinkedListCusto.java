package packages;

public class LinkedListCusto {


    class Node {

        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;

        }
    }


    public static void main(String[] args) {
        new LinkedListCusto().nodeMethod(2);


    }

    private void nodeMethod(int k) {
        Node head;
        Node last;
        Node node = new LinkedListCusto().new Node(1, null);
        head = node;
        node.next = new LinkedListCusto().new Node(2, null);
        node = node.next;
        node.next = new LinkedListCusto().new Node(3, null);
        node = node.next;
        node.next = new LinkedListCusto().new Node(4, null);
        node = node.next;
        node.next = new LinkedListCusto().new Node(5, null);

        //  int length = length(head);

        // int numberOfPairs = length/2;


        reverseNode(head, k);

    }


    public Node reverseNode(Node node, int k) {

        int iterationCount = 0;
        while (node.next != null) {

            System.out.println(node.next);
            node.next = node;
        }


        return null;


    }

    public int length(Node node) {

        int length = 0;
        while (node.next != null) {
            length++;
        }
        return length;
    }


    /*
    *
        * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

    k is a positive integer and is less than or equal to the length of the linked list.
    *  If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

    You may not alter the values in the list's nodes, only nodes themselves may be changed.

    https://assets.leetcode.com/uploads/2020/10/03/reverse_ex1.jpg

    Input: head = [1,2,3,4,5], k = 2
    Output: [2,1,4,3,5]

    https://assets.leetcode.com/uploads/2020/10/03/reverse_ex2.jpg

    Input: head = [1,2,3,4,5], k = 3
    Output: [3,2,1,4,5]
    * */


}

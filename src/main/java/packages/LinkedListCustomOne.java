package packages;

public class LinkedListCustomOne {


    class Node {

        int data;
        Node next;
        Node head;


        public Node(int data) {
            this.data = data;
            next = null;
        }

        public Node() {
            //next = new Node();

        }

        public Node add(int data) {

            this.data = data;
            this.next = null;

            return this;
        }

        public int length() {

            int count =-1;

            while(this.next != null) {

                count++;
            }
            return count;

        }

        public Node get (int index) {

                int count = -1;
                Node node = this;
                while(node != null && count == index) {
                   node = this.next;
                }

                return node;
        }

        public void print(Node head) {

            while(head.next != null) {

                System.out.println(head.data);
            }
        }


        public void removeByValue(Node head, int value) {
            Node node = head;
            while(head.next != null) {

                if(head.data == value) {

                }

            }
        }
    }


    public static void main(String[] args) {

        Node node1 = new LinkedListCustomOne().new Node().add(10);
        Node node2 = new LinkedListCustomOne().new Node().add(20);;
        Node node3 = new LinkedListCustomOne().new Node().add(30);;
        Node node4 = new LinkedListCustomOne().new Node().add(40);;

        node1.head = node1;

        node1.next= node2;
        node2.next = node3;
        node3.next = node4;


        node1.length();

    }




}


//add
//removeByValue
//removeByIndex
//get(index)
//size
//print()

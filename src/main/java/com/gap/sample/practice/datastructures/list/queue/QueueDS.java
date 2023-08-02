package com.gap.sample.practice.datastructures.list.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDS {

    public ListNode rear;
    public ListNode front;
    public int length;

    public static class ListNode {

        public int data;
        public ListNode next;

        public ListNode(int data) {

            this.data = data;

        }

    }

    public boolean isEmpty() {
        return length == 0;
    }

    public static void main(String[] args) {
        QueueDS queueDS = new QueueDS();

        Queue que = new ArrayDeque();
        que.add(40);
        que.add(60);
        que.add(70);
        que.add(20);
         System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        //System.out.println(que.poll());
        //System.out.println(que.remove());





        //que.d
        queueDS.add(4);
        queueDS.add(5);
        queueDS.add(6);
        queueDS.add(7);

        //System.out.println(queueDS.peek());
        System.out.println(queueDS.poll());
        System.out.println(queueDS.poll());
        System.out.println(queueDS.poll());
        System.out.println(queueDS.poll());
    }

    public int peek() {
        return front.data;
    }

    public int poll() {
        int data = front.data;
        front = front.next;
        return data;
    }

    public void add(int data) {

        ListNode list = new ListNode(data);
        if (isEmpty()) {
            front = list;
        } else {
            rear.next = list;
        }

        rear = list;
        length++;

    }


}

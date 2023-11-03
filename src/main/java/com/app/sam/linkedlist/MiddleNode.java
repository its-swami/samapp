//package com.app.sam.linkedlist;
//
//public class MiddleNode {
//    public static class LinkedList {
//        public int value;
//        public com.app.sam.linkedlist.LinkedList next;
//
//        public LinkedList(int value) {
//            this.value = value;
//            this.next = null;
//        }
//    }
//
//    public static void removeDuplicateLinkedList(LinkedList head) {
//        LinkedList current = head;
//        while (current != null && current.next !=null) {
//            if (current.value == current.next.value) {
//                current.next = current.next.next;
//            } else {
//                current = current.next;
//            }
//        }
//
//        LinkedList node = head;
//        while (node != null) {
//            System.out.println(node.value);
//            node = node.next;
//        }
//    }
//
//    public static void main(String args[]) {
//        LinkedList list1 = new LinkedList(1);
//        LinkedList list2 = new LinkedList(2);
//        LinkedList list3 = new LinkedList(4);
//        LinkedList list4 = new LinkedList(4);
//        LinkedList list5 = new LinkedList(5);
//        LinkedList list6 = new LinkedList(6);
//        LinkedList list7 = new LinkedList(7);
//
//        list1.next = list2;
//        list2.next = list3;
//        list3.next = list4;
//        list4.next = list5;
//        list5.next = list6;
//        list6.next = list7;
//        removeDuplicateLinkedList(list1);
//
//    }
//
//}
//

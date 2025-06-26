package com.example.logicprogram.datastructure.scaler.sc_M5_Intermediate;

import jdk.internal.net.http.common.Pair;

public class M5L6_LinkedInList {

    static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    static Node unsortedLL(){
        Node n1 = new Node(2); // Head Node
        n1.next = new Node(-2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(1);
        n1.next.next.next.next = new Node(-1);
        n1.next.next.next.next.next = new Node(-3);
        n1.next.next.next.next.next.next = new Node(4);
        n1.next.next.next.next.next.next.next = new Node(-4);
        n1.next.next.next.next.next.next.next.next = new Node(5);
        n1.next.next.next.next.next.next.next.next.next = new Node(-5);
        n1.next.next.next.next.next.next.next.next.next.next = new Node(-6);
        n1.next.next.next.next.next.next.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next.next.next.next.next.next.next = new Node(0);
        return n1;
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // Create LinkedList : 1 -> 2 -> 3 -> 4 -> 5
        /*Node n1 = new Node(1);                // Head Node
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(8);
        n1.next.next.next.next.next = new Node(11);*/

        // Print LinkedList
        //printLinkedList(n1);

        // Insert at position : pos=4, data=6
       /* System.out.println("\n");
        Node head = insertAtPos(n1, 4, 6);
        printLinkedList(head);*/

        // Print in reverse - using recursion
        /*System.out.println("\n");
        printReverse(head);*/

        /*System.out.println("\n");
        Node head = insertInSorted(n1, 6);
        printLinkedList(head);*/

        /*System.out.println("\n");
        printReverseLL(head);*/

        /*System.out.println("\n");
        printLinkedList(reverseUsing2Pointer(head));*/

        /*System.out.println("\n");
        System.out.println("Mid Point : " + findMidPoint(n1).data);*/

        /*Node n2 = n1.next.next.next.next.next;            // Sixth Node
        n2.next = new Node(13);
        n2.next.next = new Node(5);
        n2.next.next.next = new Node(18);
        n2.next.next.next.next = new Node(19);
        n2.next.next.next.next.next = new Node(22);
        n2.next.next.next.next.next.next = new Node(21);
        n2.next.next.next.next.next.next = n2;*/            // Sixth Node Intersection Point
        //printLinkedList(n1);
        //System.out.println("Intersection Circle Point : " + findIntersection(n1).data);


        /*System.out.println("\n");
        Node n11 = new Node(2); // Head Node
        n11.next = new Node(5);
        n11.next.next = new Node(7);
        n11.next.next.next = new Node(9);

        Node n22 = new Node(3); // Head Node
        n22.next = new Node(4);
        n22.next.next = new Node(6);
        n22.next.next.next = new Node(8);
        Node mergedLLHead = merge(n11, n22);
        printLinkedList(mergedLLHead);*/

        Node h = unsortedLL();
        Node sortedLL = mergeSortAlgo(h);
        printLinkedList(sortedLL);
    }

    private static void printReverse(Node head) {
        if(head.next == null) {
            System.out.print(head.data);
            return;
        }
        printReverse(head.next);
        System.out.print(" " + head.data);
    }

    // Insert at position
    static Node insertAtPos(Node head, int pos, int data) {
        Node myNode = new Node(data);
        Node current = head;
        int i = 0;
        while (i <= pos - 1){
            if(i == pos - 1){
                Node temp = current.next;
                current.next = myNode;
                myNode.next = temp;
                break;
            } else {
                current = current.next;
                i++;
            }
        }

        return head;
    }

    static Node insertInSorted(Node head, int data) {
        Node myNode = new Node(data);

        // Check for start index
        if(head == null || data < head.data){
            myNode.next = head;
            head = myNode;
            return head;
        }

        // Find the start point to insert
        // Start(t) ----- Next
        Node t = head;
        while(t.next != null && t.next.data < data) {
            t = t.next;
        }
        // Start(t) ----- Next(t.next)
        myNode.next =  t.next;
        t.next = myNode;

        return head;
    }

    // 1->2->3->null
    // Using recursion
    static void printReverseLL(Node head) {
        if(head.next == null) {
            System.out.println(head.data);
            return;
        }
        printReverseLL(head.next);
        System.out.println(head.data);
    }

    // Using 2 pointer
    static Node reverseUsing2Pointer(Node head) {
        // 1->2->3->4->null : null(prev)<-1<-2<-3<-4(h)
        Node curr = head;
        Node prev = null;
        while (curr.next != null){
            Node nn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nn;
        }
        // Assign new head i.e last(prev) node as head
        // curr.next (last node) = null; so now we can assign curr as head to prev
        curr.next = prev;
        return curr;
    }

    // Using slow-fast algorithm find mid point in LinkedList
    static Node findMidPoint(Node head) {
        // 1->2->3->4->5->6->-7->null

        Node s = head;
        Node f = head;

        while (s.next != null && f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    // Using floyd algorithm find intersection point of circle in LinkedList
    static Node findIntersection(Node head) {

        Node s = head;
        Node f = head;

        while (s.next != null && f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
            if(s.data == f.data)
                break;
        }

        f = head;

        while (s.next != null && f.next != null){
            s = s.next;
            f = f.next;
            if(s.data == f.data)
                break;
        }
        return s;
    }

    // Merge 2 sorted LinkedList of same size
    // This method we have to use in MergeSort Algo also
    static Node merge(Node h1, Node h2) {

        // Step 1 : Take initial small value Node and assign that to ans
        Node ans = null;
        Node t = null;
        if(h1.data < h2.data) {
            ans = h1; t = h1; h1 = h1.next;
        } else {
            ans = h2; t = h2; h2 = h2.next;
        }

        // Step 2 : Iterate on both LinkedList and make t.next connected to next bigger number node
        while (h1 != null && h2 != null) {
            if(h1.data < h2.data) {
                t.next = h1; t = t.next; h1 = h1.next;
            } else {
                t.next = h2; t = t.next; h2 = h2.next;
            }
        }

        // Step 3 : Add remaining elements of h1 or h2
        if(h1 != null)
            t.next = h1;
        if(h2 != null)
            t.next = h2;

        return ans;
    }

    /**
     *  Implement MergeSort Algo in LinkedList - Given Unsorted LinkedList
     *  Step 1 : Find mid point using Slow & Fast approach and break LL into two parts.
     *  Step 2 : Use recursion approach to sort both parts.
     *  Step 3 : Merge both parts using merge() method.
     */
    static Node mergeSortAlgo(Node h) {

        if(h.next == null)
            return h;

        // Step 1
        Node h1 = h;
        Node mid = findMidPoint(h1);
        Node h2 = mid.next;
        mid.next = null;  // break into two parts

        // Step 2
        Node t1 = mergeSortAlgo(h1);
        Node t2 = mergeSortAlgo(h2);

        // Step 3
        return merge(t1, t2);
    }


    // Find Intersection Point of 2 LinkedList


    /*
    * Level 3
    * */
    // Delete a Node
    // Add a Node
    // Implement LRU Cache
    // Clone a LL with Random Pointer
}




















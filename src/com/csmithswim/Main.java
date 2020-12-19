package com.csmithswim;

import java.io.*;
import java.util.*;

/*
Today we will work with a Linked List. Check out the Tutorial tab for learning materials and an instructional video.

A Node class is provided for you in the editor. A Node object has an integer data field,
, and a Node instance pointer,

, pointing to another node (i.e.: the next node in the list).

A Node insert function is also declared in your editor. It has two parameters: a pointer,
, pointing to the first node of a linked list, and an integer, , that must be added to the end of the list as a new Node object.
 */

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Main {

    public static  Node insert(Node head,int data) {
        {
//Complete this method
            if(head == null)
                return new Node( data);
            else if(head.next == null){
                head.next = new Node(data);
            }
            else{
                insert(head.next,data);
            }


            return head;

        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
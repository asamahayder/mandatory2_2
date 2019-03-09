package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MiddleQueue {
    Node head;
    Node tail;
    int size = 0;

    public MiddleQueue() {
    }

    public String[] getOperations(String[] inputs) {
        String[] operations = new String[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            String operation = input.substring(0, 1);
            operations[i] = operation;
        }
        return operations;
    }

    public int[] getValues(String[] inputs) {
        int[] values = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            if (!input.equals("E")) {
                int value = Integer.parseInt(input.substring(2));
                values[i] = value;
            }
        }
        return values;
    }

    public void handleOperations(String[] operations, int[] values){
        boolean firstValue = true;
        for (int i = 0; i < operations.length; i++) {
            if (firstValue){
                if (!operations[i].equals("E")){
                    Node newNode = new Node(values[i]);
                    tail = newNode;
                    head = newNode;
                    firstValue = false;
                    size++;
                }
            }else if (operations[i].equals("L")){
                Node newNode = new Node(values[i]);
                newNode.next = head;
                head = newNode;
                size++;
            }else if (operations[i].equals("R")){
                Node newNode = new Node(values[i]);
                tail.next=newNode;
                tail = newNode;
                size++;
            }else if (operations[i].equals("E")){
                if (head != null){
                    deleteMiddle();
                    size--;
                }
            }
        }
    }

    /*public void printList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }*/

    public void deleteMiddle(){
        int position = 0;
        Node fast = head;
        Node slow = head;
        Node temp = head;

        if (isEven(size)) {
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                position++;
            }
        }else{
            while (fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                position++;
            }
        }

        //System.out.println("position = " + position);
        //System.out.println("Value = " + slow.value);
        System.out.println(slow.value);

        if (position == 0){
            head = temp.next;
            return;
        }
        for (int i = 0; i < position-1; i++) {
            temp = temp.next;
        }

        Node next = temp.next.next;
        temp.next = next;
        return;
    }

    public boolean isEven(int size){
        boolean isEven = false;
        if (size%2 == 0){
            isEven = true;
        }
        return isEven;
    }

}
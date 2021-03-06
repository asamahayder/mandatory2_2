package com.company;

public class MiddleQueue {
    Node head;
    Node tail;
    int size = 0;
    String[] operations;
    int[] values;

    public MiddleQueue() {
    }

    public void splitInput(String[] inputs) {
        operations = new String[inputs.length];
        values = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            String operation = input.substring(0, 1);
            operations[i] = operation;
            if (!input.equals("E")) {
                int value = Integer.parseInt(input.substring(2));
                values[i] = value;
            }
        }
        return;
    }

    public void handleOperations(String[] operations, int[] values){
        for (int i = 0; i < operations.length; i++) {
            if (head == null){
                if (!operations[i].equals("E")){
                    Node newNode = new Node(values[i]);
                    tail = newNode;
                    head = newNode;
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

    public void deleteMiddle(){
        int position = 0;
        Node fast = head;
        Node slow = head;
        Node temp = head;

        if (isEven(size)) {
            while (fast.next.next != null) {
                temp = slow;
                slow = slow.next;
                fast = fast.next.next;
                position++;
            }
        }else{
            while (fast.next != null){
                temp = slow;
                slow = slow.next;
                fast = fast.next.next;
                position++;
            }
        }

        if (position == 0){
            head = head.next;
            System.out.println(slow.value);
            return;
        }

        temp.next = slow.next;

        System.out.println(slow.value);
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
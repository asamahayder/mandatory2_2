package com.company;

import java.util.ArrayList;
import java.util.Queue;

public class MiddleQueue {
    ArrayList<Integer> queue;

    public MiddleQueue() {
        ArrayList<Integer> queue = new ArrayList<>();
        this.queue=queue;
    }

    public String[] getOperations(String[]inputs){
        String[]operations = new String[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            String operation = input.substring(0,1);
            operations[i] = operation;
        }
        return operations;
    }

    public int[] getValues(String[]inputs){
        int[]values = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            if (!input.equals("E")){
                int value = Integer.parseInt(input.substring(2));
                values[i] = value;
            }

        }
        return values;
    }

    public void addValues(int[]values, String[]operations){

        boolean firstValue = true;
        int head = 0;
        int tail = 0;
        if (isEven()){
            //head = queue.length/2;
            tail = head+1;
        }else if (!isEven()){
            //head = (int)(Math.round(queue.length/2.0));
            tail = head;
        }
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("L")){
                //queue[head] = values[i];
                if (!isEven() && firstValue){
                    head--;
                    tail++;
                    firstValue = false;
                }else{
                    head--;
                }
            }
            if (operations[i].equals("R")){
               // queue[tail] = values[i];
                if (!isEven() && firstValue){
                    head--;
                    tail++;
                    firstValue=false;
                }else{
                    tail++;
                }
            }
        }
    }

    public boolean isEven(){
        int size = queue.size();
        boolean isEven = true;
        if (size%2!=0){
            isEven=false;
        }
        return isEven;
    }

}

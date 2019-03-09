package com.company;

import java.util.ArrayList;

public class MiddleQueue_AL {

    String[] operations;
    int[] values;
    ArrayList<Integer> list = new ArrayList();

    public MiddleQueue_AL() {
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

    public void handleOperations(String[]operations, int[]values){
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("L")){
                list.add(0,values[i]);

            }else if (operations[i].equals("R")){
                list.add(values[i]);
            }else if (operations[i].equals("E")){
                if (list.size()!=0){
                int middleIndex;
                if (list.size()%2 == 0){
                    middleIndex = (list.size()/2)-1;
                }else{
                    middleIndex = list.size()/2;
                }
                System.out.println(list.get(middleIndex));
                list.remove(middleIndex);
                }
            }
        }
    }
}

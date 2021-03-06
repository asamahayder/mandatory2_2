package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOperations = scanner.nextInt();
        scanner.nextLine();

        String[] inputs = new String[numberOfOperations];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i]=scanner.nextLine();
        }

        MiddleQueue_AL middleQueue = new MiddleQueue_AL();
        middleQueue.splitInput(inputs);
        String[]operations = middleQueue.operations;
        int[]values = middleQueue.values;
        middleQueue.handleOperations(operations,values);

    }
}

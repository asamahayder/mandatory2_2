package com.company;

import java.util.ArrayList;
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

        MiddleQueue middleQueue= new MiddleQueue();
        String[]operations = middleQueue.getOperations(inputs);
        int[]values = middleQueue.getValues(inputs);

        middleQueue.handleOperations(operations,values);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int numberOfOperations = scanner.nextInt();
        scanner.nextLine();

        String[] inputs = new String[numberOfOperations];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i]=scanner.nextLine();
        }

        MiddleQueue middleQueue= new MiddleQueue(numberOfOperations);
        String[]operations = middleQueue.getOperations(inputs);
        int[]values = middleQueue.getValues(inputs);*/


        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);

        System.out.println(newList.get(0));
        System.out.println(newList.get(1));
        System.out.println(newList.get(2));

        newList.remove(1);

        System.out.println(newList.get(0));
        System.out.println(newList.get(1));



    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList testArray = new MyArrayList();
        System.out.println("At the very beginning, is the test array empty? \n" +testArray.isEmpty());
        testArray.add(2);
        testArray.add("Hello");
        System.out.println("Now that I've added two elements, is the test array empty? \n" + testArray.isEmpty());
        System.out.println("Test array size: " +testArray.size());
        System.out.println("Does the test array contain 2? \n" +testArray.contains(2));
        System.out.println("Now let's delete the first element");
        testArray.remove(0);
        System.out.println("Does the test array contain 2? \n" +testArray.contains(2));
        System.out.println("The first element is " +testArray.get(0));
        System.out.println("Clearing the array...");
        testArray.clear();
        System.out.println("Test array size: " +testArray.size());
        System.out.println("Increasing the number of elements at the array");
        for (int i = 0; i < 30; i++)
            testArray.add(i);
        System.out.println("Test array size: " +testArray.size());
        System.out.println("The last element is " +testArray.get(29));
    }
}
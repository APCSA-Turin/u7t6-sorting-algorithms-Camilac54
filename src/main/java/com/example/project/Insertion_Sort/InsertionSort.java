package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i ++) {
            int current = elements[i];
            int loopIdx = i - 1;

            while (loopIdx >= 0 && elements[loopIdx] > current) {
                elements[loopIdx + 1] = elements[loopIdx];

                loopIdx --;
                count ++;
            }

            elements[loopIdx + 1] = current;
        }

        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        // For testing
        // for (int i = 0 ; i < elements.length - 1; i ++) {
        //     System.out.print(elements[i] + " ");
        // }
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        int length = elements.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i; // Track the index of the minimum element
           

            for (int j = i + 1; j < length; j++) { // Start searching from i+1
                count ++;

                if (elements[j] < elements[minIndex]) { // Find the new minimum
                    minIndex = j;
                }
            }
   
            // Swap the found minimum element with the first element of the unsorted part
            int temp = elements[minIndex];
            elements[minIndex] = elements[i];
            elements[i] = temp;
        }
        
        System.out.println("SELECTON SORT: Number of loop iterations: " + count);
        // Print sorted array for testing
        // for (int i = 0; i < length; i++) {
        //     System.out.println(elements[i]);
        // }
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;

        for (int i = 1; i < words.size(); i ++) {
            String current = words.get(i).toString();
            int loopIdx = i - 1;
            
            while (loopIdx >= 0 && words.get(loopIdx).toString().compareTo(current) > 0) {
                words.set(loopIdx + 1, words.get(loopIdx));
                loopIdx --;
                count ++;
            }
            words.set(loopIdx + 1, current);
        }
        for (int i = 0; i < words.size() - 1; i ++) {
            System.out.print(words.get(i) + " ");
        }
        
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        int length = words.size();
        int count = 0;

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i; // Track the index of the minimum element
           
            for (int j = i + 1; j < length; j++) { // Start searching from i+1
                count ++;
                if (words.get(j).compareTo(words.get(minIndex)) < 0) { // Find the new minimum
                    minIndex = j;
                }
            }
   
            // Swap the found minimum element with the first element of the unsorted part
            String temp = words.get(minIndex);
            words.set(minIndex, words.get(i));
            words.set(i, temp);
        }

        System.out.println("SELECTON SORT: Number of loop iterations: " + count);
        // Print sorted array for testing
        // for (int i = 0; i < length; i++) {
        //     System.out.println(words.get(i));
        // }

    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
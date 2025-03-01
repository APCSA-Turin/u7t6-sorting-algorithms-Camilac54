package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int length = elements.length;
   
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i; // Track the index of the minimum element
           
            for (int j = i + 1; j < length; j++) { // Start searching from i+1
                if (elements[j] < elements[minIndex]) { // Find the new minimum
                    minIndex = j;
                }
            }
   
            // Swap the found minimum element with the first element of the unsorted part
            int temp = elements[minIndex];
            elements[minIndex] = elements[i];
            elements[i] = temp;
        }
   
        // Print sorted array for testing
        // for (int i = 0; i < length; i++) {
        //     System.out.println(elements[i]);
        // }
   
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int length = words.size();
   
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i; // Track the index of the minimum element
           
            for (int j = i + 1; j < length; j++) { // Start searching from i+1
                if (words.get(j).compareTo(words.get(minIndex)) < 0) { // Find the new minimum
                    minIndex = j;
                }
            }
   
            // Swap the found minimum element with the first element of the unsorted part
            String temp = words.get(minIndex);
            words.set(minIndex, words.get(i));
            words.set(i, temp);
        }
   
        // Print sorted array for testing
        // for (int i = 0; i < length; i++) {
        //     System.out.println(words.get(i));
        // }
   
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
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

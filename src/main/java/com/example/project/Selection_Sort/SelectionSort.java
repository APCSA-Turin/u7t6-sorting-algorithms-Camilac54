package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int length = elements.length;

        for (int i = 0; i < length - 1; i ++) {
            int min = i;

            for (int j = i + 1; j < length; j ++) {
                if (min < elements[j]) { // checks for new min value;
                    min = j;
                }
            }
            int temp = elements[min];
            elements[min] = elements[i];
            elements[i] = temp;
        }

        for (int i = 0; i < length; i ++) { // for testing
            System.out.println(elements[i]); 
        }

        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
       
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

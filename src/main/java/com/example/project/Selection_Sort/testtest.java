package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class testtest {
    public static void main(String[] args) {
        int[] arr = {1, 10, 7, 3, 5, 2, 4, 9, 6, 8};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr = SelectionSort.selectionSort(arr);
    }
}
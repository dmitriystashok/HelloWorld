package com.Arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AddArrays {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> list1 = new ArrayList<>(); // create list
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);  // fill in the list

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(list1);
        result.addAll(list2);

        for (Integer x : result)
        {
            System.out.println(x);
        }
    }
}
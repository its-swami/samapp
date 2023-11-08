package com.app.sam.array;

import javax.servlet.ServletOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(ArrayList<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            while (i < j && array.get(j) == toMove) {
                j--;
            }
            if (array.get(i) == toMove) {
                swap(i, j, array);
            }
            i++;
        }
        return array;
    }

    public static List<Integer> moveElementToEndWork(List<Integer> array, int toMove) {
        int leftPointer = 0;
        int rightPointer = array.size() -1;
        int temp;
        while (leftPointer < rightPointer){
            if (toMove != array.get(leftPointer)){
                leftPointer++;
                continue;
            }
            if (toMove == array.get(rightPointer)){
                rightPointer--;
                continue;
            }
            temp = array.get(rightPointer);
            array.set(rightPointer,array.get(leftPointer));
            array.set(leftPointer,temp);
            leftPointer++;
            rightPointer--;
        }
        return array;
    }

    public static void swap(int i, int j, ArrayList<Integer> array) {
        int temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(1);

        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(2);
        int toMove = 2;
        System.out.println(moveElementToEnd(array, 2));

        System.out.println(moveElementToEndWork(array, 2));
    }
}

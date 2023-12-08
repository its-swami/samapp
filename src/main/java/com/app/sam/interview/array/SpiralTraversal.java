package com.app.sam.interview.array;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1,2,3,4,5},
                {16,17,18,19,6},
                {15,24,25,20,7},
                {14,23,22,21,8},
                {13,12,11,10,9}
        };
        int[] result = spiralTraverse(array);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }



    public static int[] spiralTraverse(int[][] array) {
        int[] result = new int[array.length*array[0].length];
        int startRow = 0;
        int endRow = array.length-1;
        int startCol = 0;
        int endCol = array[0].length-1;
        int index = 0;
        while (startRow <= endRow && startCol <= endCol){
            for (int col=startCol;col<=endCol;col++){
                result[index++] = array[startRow][col];
            }
            for (int row=startRow+1;row<=endRow;row++){
                result[index++] = array[row][endCol];
            }
            for (int col=endCol-1;col>=startCol;col--){
                if (startRow == endRow){
                    break;
                }
                result[index++] = array[endRow][col];
            }
            for (int row=endRow-1;row>startRow;row--){
                if (startCol == endCol){
                    break;
                }
                result[index++] = array[row][startCol];
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }
}

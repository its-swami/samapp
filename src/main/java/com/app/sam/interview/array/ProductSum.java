package com.app.sam.interview.array;

public class ProductSum {
    public static int productSum(Object[] array) {
        return productSum(array, 1);
    }

    public static int productSum(Object[] array, int multiplier) {
        int sum = 0;
        for (Object element : array) {
            if (element instanceof Object[]) {
                sum += productSum((Object[]) element, multiplier + 1);
            } else {
                sum += (int) element;
            }
        }
        return sum * multiplier;
    }

    public static void main(String args[]) {
        Object[] array = new Object[]{5, 2, new Object[]{7, -1}, 3, new Object[]{6, new Object[]{-13, 8}, 4}};
        System.out.println(productSum(array));
    }
}

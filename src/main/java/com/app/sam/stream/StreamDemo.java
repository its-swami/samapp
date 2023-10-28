package com.app.sam.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String args[]) {
        // Create a stream from a list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        list.stream().forEach(System.out::print);
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::print);
//        list.stream().map(i -> i * i).forEach(System.out::println);
//        list.stream().map(i -> i * i).filter(i -> i % 2 == 0).forEach(System.out::println);
//        list.stream().map(i -> i * i).filter(i -> i % 2 == 0).reduce((a, b) -> a + b).ifPresent(System.out::println);
//        list.stream().map(i -> i * i).filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b);
//        list.stream().map(i -> i * i).filter(i -> i % 2 == 0).reduce(0, Integer::sum);
//        list.stream().map(i -> i * i).filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println("Stream Demo");
    }
}

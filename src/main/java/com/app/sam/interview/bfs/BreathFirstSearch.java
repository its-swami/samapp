package com.app.sam.interview.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BreathFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();
        public Node(String name) {
            this.name = name;
        }
    }
    public static List<String> breathFirstSearch(Node parent) {
        LinkedList<Node> linkedList = new LinkedList<>();
        linkedList.add(parent);
        return processNode(parent, linkedList);
    }

    public static List<String> processNode(Node parent, LinkedList<Node> linkedList) {
        List<String> output = new ArrayList<>();

        while (!linkedList.isEmpty()) {
            Node inProcess = linkedList.removeFirst();
            output.add(inProcess.name);
            linkedList.addAll(inProcess.children);
        }
        return output;
    }

    public static void main(String[] args) {
        Node i = new Node("I");
        Node j = new Node("J");
        Node f = new Node("F");
        f.children = Arrays.asList(i,j);
        Node e = new Node("E");
        Node b = new Node("B");
        b.children = Arrays.asList(e,f);
        Node a = new Node("A");
        Node c = new Node("C");
        Node d = new Node("D");
        a.children = Arrays.asList(b,c,d);
        Node k = new Node("K");
        Node g = new Node("G");
        Node h = new Node("H");
        g.children = Arrays.asList(k);
        d.children = Arrays.asList(g,h);
        List<String> strings = breathFirstSearch(a);
        System.out.println("Out:"+strings);
    }
}
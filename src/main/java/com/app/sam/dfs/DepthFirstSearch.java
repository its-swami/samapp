package com.app.sam.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();
        public Node(String name) {
            this.name = name;
        }
    }
    public static List<String> depthFirstSearch(Node array) {
        List<String> output = new ArrayList<>();
        recursiveFn(array,output);
        return output;
    }
    public static void recursiveFn (Node node, List<String> output){
        //Self Processing
        output.add(node.name);
        //Loop Thru Children
        for(Node child:node.children){
            recursiveFn(child,output);
        }
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
        List<String> strings = depthFirstSearch(a);
        System.out.println("Out:"+strings);
    }
}
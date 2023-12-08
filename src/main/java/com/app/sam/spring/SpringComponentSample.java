package com.app.sam.spring;

import org.springframework.stereotype.Component;

@Component
public class SpringComponentSample {

    public String print() {
        return "Hello World";
    }

    public static void main(String args[]) {
        SpringComponentSample springComponentSample = new SpringComponentSample();
        springComponentSample.print();
    }
}

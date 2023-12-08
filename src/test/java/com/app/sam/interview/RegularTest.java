package com.app.sam.interview;

import com.app.sam.spring.SpringComponentSample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

// @ExtendWith(MockitoExtension.class)
public class RegularTest {

    @Mock
    SpringComponentSample springComponentSample;

    @BeforeEach
    public void setup() {
        // You can use this or @ExtendWith(MockitoExtension)
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test() {
        when(springComponentSample.print()).thenCallRealMethod();
        assert(springComponentSample.print().equals("Hello World"));

        when(springComponentSample.print()).thenReturn("Hello World, Spring Boot!");
        assert(springComponentSample.print()).equals("Hello World, Spring Boot!");

        when(springComponentSample.print()).thenReturn("Hello World");
        assert(springComponentSample.print().equals("Hello World"));

        when(springComponentSample.print()).thenReturn("Hello World, Spring Boot is Best!");
        assert(springComponentSample.print().equals("Hello World, Spring Boot is Best!"));
    }
}

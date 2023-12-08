package com.app.sam.interview;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.sam.spring.SpringComponentSample;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

@SpringBootTest
public class SpringTest {


    @MockBean
    private SpringComponentSample springComponentSample;

    @Test
    public void test() {
        when(springComponentSample.print()).thenReturn("Hello World");
        assert(springComponentSample.print().equals("Hello World"));

        when(springComponentSample.print()).thenReturn("Hello World, Spring Boot!");
        assert(springComponentSample.print().equals("Hello World, Spring Boot!"));
    }
}

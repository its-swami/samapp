//package com.app.sam.interview;
//
//import com.app.sam.spring.SpringComponentSample;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.mockito.Mockito.when;
//
///**
// * Using @RunWith(SpringRunner.class) instead of @ExtendWith(MockitoExtension.class)
// * @RunWith(SpringRunner.class) is a JUnit 4 annotation that tells JUnit to run using Spring’s testing support.
// * SpringRunner is the new name for SpringJUnit4ClassRunner, it’s just a bit easier on the eye.
// * @RunWith(SpringRunner.class) is used to provide a bridge between Spring Boot test features and JUnit.
// * Whenever we are using any Spring Boot testing features in out JUnit tests, this annotation will be required.
// * @RunWith(SpringRunner.class) tells JUnit to run using Spring’s testing support.
// */
//
//@RunWith(SpringRunner.class)
//public class RegularTest {
//
//    @Mock
//    SpringComponentSample springComponentSample;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void test() {
//        when(springComponentSample.print()).thenReturn("Hello World");
//        assert(springComponentSample.print().equals("Hello World"));
//
//        when(springComponentSample.print()).thenReturn("Hello World, Spring Boot!");
//        assert(springComponentSample.print().equals("Hello World, Spring Boot!"));
//
//        when(springComponentSample.print()).thenReturn("Hello World");
//        assert(springComponentSample.print().equals("Hello World"));
//
//        when(springComponentSample.print()).thenReturn("Hello World, Spring Boot is Best!");
//        assert(springComponentSample.print().equals("Hello World, Spring Boot is Best!"));
//    }
//}
package ru.desnol;

import org.junit.jupiter.api.*;

class DemoQATest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all test!\n");
        }
    @AfterAll
    static void afterAll(){
        System.out.println("After all test!\n");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before test!\n");
    }
    @AfterEach
    void afterEach(){
        System.out.println("After test!\n");
    }
    @Test
    void firstTest(){
        System.out.println("i love you QA.GURU");
    }
    @Test
    void secondTest(){
        System.out.println("i love you QA.GURU,second test\n");
    }
}

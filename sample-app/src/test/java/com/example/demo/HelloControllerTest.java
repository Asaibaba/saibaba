package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {
    @Test
    public void testHello() {
        HelloController hc = new HelloController();
        assertEquals("Hello, Jenkins!", hc.hello());
    }
}

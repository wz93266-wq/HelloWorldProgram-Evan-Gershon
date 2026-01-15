package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class AppTest {
    @Test
    void printingTheGreeting() {
        HelloWorld world = new HelloWorld(); 
        assertNotNull(world.stringGreeting());
    }
}
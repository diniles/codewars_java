package DebugSayHello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebugSayHelloTest {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                DebugSayHello.sayHello("Mr. Spock"));
    }

    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                DebugSayHello.sayHello("Captain Kirk"));
    }

    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                DebugSayHello.sayHello("Liutenant Uhura"));
    }

    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                DebugSayHello.sayHello("Dr. McCoy"));
    }
}

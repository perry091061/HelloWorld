package demo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class DoSomeStuffTest {

    @Test
    void doSomeStuff() {
        DoSomeStuff doSomeStuff = new DoSomeStuff();
        String s = doSomeStuff.doSomeStuff();
        assertEquals("ESSAGE",s );
    }
}
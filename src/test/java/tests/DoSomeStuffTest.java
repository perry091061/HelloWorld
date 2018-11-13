package tests;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoSomeStuffTest {

    @Test
    void doSomeStuff() {
        DoSomeStuff doSomeStuff = new DoSomeStuff();

         assertEquals("ESSAGE",doSomeStuff.doSomeStuff());
    }
}
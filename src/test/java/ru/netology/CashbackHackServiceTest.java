package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amout = 900;
        int expected = 100;
        int actual = service.remain(amout);

        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void equalAmoutRemain() {
        CashbackHackService service = new CashbackHackService();
        int amout = 1000;
        int expected = 0;
        int actual = service.remain(amout);

        assertEquals(actual,expected);
    }

    @Test
    public void moreAmoutRemain() {
        CashbackHackService service = new CashbackHackService();
        int amout = 1100;
        int expected = 900;
        int actual = service.remain(amout);

        assertEquals(actual,expected);
    }
}
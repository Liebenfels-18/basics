package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void calculateCashbackWhenBuyFor500() {
        CashbackHackService service = new CashbackHackService();

        int amount = 600;

        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(expected, actual);
    }

    @Test
    public void calculateCashbackWhenBuyFor1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }


}

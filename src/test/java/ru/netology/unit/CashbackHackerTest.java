package ru.netology.unit;

import static org.testng.Assert.assertEquals;

public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();

    @org.testng.annotations.Test
    public void shouldGetAmountUnder1000(){
        int amount = 850;

        int actual = service.remain(amount);
        int expected = 250;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldGetAmountOver1000(){
        int amount = 1020;

        int actual = service.remain(amount);
        int expected =980;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldGetAmountEqually1000(){
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

        //при проверке на граничные значения не проходит. неверно описана логика
    }

}
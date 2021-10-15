package ru.netology.unit;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest{
    CashbackHacker service = new CashbackHacker();

    @org.junit.Test
    public void shouldGetAmountUnder1000() {
        int amount = 850;

        int actual = service.remain(amount);
        int expected = 150;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldGetAmountOver1000() {
        int amount = 1850;

        int actual = service.remain(amount);
        int expected = 150;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldGetAmountEqually1000(){
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

        //при проверке на граничные значения не проходит. неверно описана логика
    }

}
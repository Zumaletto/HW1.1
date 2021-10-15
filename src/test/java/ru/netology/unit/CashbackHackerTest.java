package ru.netology.unit;

import org.junit.Test;

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

    @Test
    public void shouldGetAmountUnder() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldGetAmountOver1000() {
        int amount = 1850;

        int actual = service.remain(amount);
        int expected = 150;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAmountOver() {
        int amount = 1005;

        int actual = service.remain(amount);
        int expected = 995;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldGetAmountEqually1000(){
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

        //при проверке на граничные значения не проходит. неверно описана логика
    }

    @Test
    public void shouldGetAmountEqually(){
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

        //при проверке на граничные значения не проходит. неверно описана логика
    }

}
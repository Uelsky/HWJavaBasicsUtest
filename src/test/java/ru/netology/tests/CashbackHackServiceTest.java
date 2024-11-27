package ru.netology.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void firstCustomTest() {
        int actual = service.remain(1);

        Assert.assertEquals(actual, 999);
    }

    @Test
    public void secondCustomTest() {
        int actual = service.remain(500);

        Assert.assertEquals(actual, 500);
    }

    @Test
    public void thirdCustomTest() {
        int actual = service.remain(999);

        Assert.assertEquals(actual, 1);
    }

    @Test
    public void forthCustomTest() {
        int actual = service.remain(1000);

        Assert.assertEquals(actual, 0);
    }
}

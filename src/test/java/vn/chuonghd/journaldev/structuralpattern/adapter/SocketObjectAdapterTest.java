package vn.chuonghd.journaldev.structuralpattern.adapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class SocketObjectAdapterTest {

    private SocketAdapter socketAdapter;

    @Before
    public void init() {
        socketAdapter = new SocketObjectAdapterImpl();
    }

    @Test
    public void shouldReturn3VoltWhenCallgetVolt3() {
        int expectedVolt = 3;
        Volt volt3 = socketAdapter.get3Volt();
        Assert.assertEquals(expectedVolt, volt3.getVolts());
    }

    @Test
    public void shouldReturn12VoltWhenCallgetVolt12() {
        int expectedVolt = 12;
        Volt volt12 = socketAdapter.get12Volt();
        Assert.assertEquals(expectedVolt, volt12.getVolts());
    }

    @Test
    public void shouldReturn120VoltWhenCallgetVolt120() {
        int expectedVolt = 120;
        Volt volt120 = socketAdapter.get120Volt();
        Assert.assertEquals(expectedVolt, volt120.getVolts());
    }
}

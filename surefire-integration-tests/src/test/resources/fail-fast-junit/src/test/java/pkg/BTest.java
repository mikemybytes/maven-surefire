package pkg;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class BTest
{
    @Test
    public void test()
        throws InterruptedException
    {
        TimeUnit.SECONDS.sleep( 1 );
        throw new RuntimeException();
    }

}

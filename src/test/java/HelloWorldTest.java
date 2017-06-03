import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Daniel on 03/06/2017.
 */
public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        int result = helloWorld.multiply(20, 10);
        Assert.assertEquals(result, 2000);
    }
}

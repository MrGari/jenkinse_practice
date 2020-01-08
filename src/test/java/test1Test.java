import org.testng.Assert;
import org.testng.annotations.Test;

public class test1Test {
    @Test
    public void testTest(){
        System.out.println("****************true********************");
        Assert.assertEquals(true, true);
    }

    @Test
    public void testTest2(){
        System.out.println("*******************false*****************");
        Assert.assertEquals(true, true);
    }
}

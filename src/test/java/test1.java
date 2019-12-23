import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void testtest(){
        System.out.println("****************true********************");
        Assert.assertEquals(true, true);
    }

    @Test
    public void testtest2(){
        System.out.println("*******************false*****************");
        Assert.assertEquals(true, false);
    }
}

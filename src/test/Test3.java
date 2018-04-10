import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class Test3 {
    @Test
    public void DT3() throws Exception {
        Dance dance = new Dance();
        int arr1[]={4,4,4,8,3,3,3};
        assertEquals(24,dance.leGo(arr1));
    }

}
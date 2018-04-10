import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class Test5 {
    @Test
    public void DT5() throws Exception {
        Dance dance = new Dance();
        int arr1[]={4,0,2};
        assertEquals(0,dance.leGo(arr1));
    }

}
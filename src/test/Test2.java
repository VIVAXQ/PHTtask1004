import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class Test2 {
    @Test
    public void DT2() throws Exception {
        Dance dance = new Dance();
        int arr1[]={2,1,1};
        assertEquals(-1,dance.leGo(arr1));
    }

}
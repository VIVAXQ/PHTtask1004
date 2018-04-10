import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class Test4 {
    @Test
    public void DT4() throws Exception {
        Dance dance = new Dance();
        int arr1[]={1,0,0,0,0,1};
        assertEquals(0,dance.leGo(arr1));
    }

}
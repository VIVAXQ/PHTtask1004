import static junit.framework.Assert.*;

public class Test1 {
    @org.junit.Test
    public void DT1() throws Exception
    {
        Dance dance = new Dance();
        int arr1[]={2,0,7};
        assertEquals(4,dance.leGo(arr1));
    }
}
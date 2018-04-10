public class ZeMa {
    private int IntArrMain[];

    ZeMa(int IntArrBck[])
    {
       // for (int i=1;i<=IntArrBck.length;i++)
       // {
       //     IntArrMain[i]=IntArrBck[i];
       // }
        IntArrMain=IntArrBck;
    }

    public int getV(int k)
    {
        return IntArrMain[k];
    }
    public int getL()
    {
        return IntArrMain.length;
    }
}
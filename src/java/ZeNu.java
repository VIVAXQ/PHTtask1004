public class ZeNu {

    private boolean BoolArrMain[]=new boolean[50];

    ZeNu(int ArrTi[])
    {
        for (int i=0; i<=ArrTi.length;i++)
        {
            BoolArrMain[i]=false;
        }
    }

    public void closeP(int Place)
    {
        BoolArrMain[Place]=true;
    }

    public boolean getV(int i) {
        return BoolArrMain[i];
    }
}
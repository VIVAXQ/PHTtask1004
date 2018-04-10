public class Dance {
    public int leGo(int IntArrMain[])
    {
        ZeMa zeMa = new ZeMa(IntArrMain);
        ZeNu zeNu = new ZeNu(IntArrMain);
        Dancer dancer = new Dancer();
        int wag=0;
        boolean flag1=true;
        while ((wag<2147483647))
        {
            if (flag1)
            {
                if ((zeMa.getV(dancer.getPos()) % 2 ==1)||(zeMa.getV(dancer.getPos())>zeMa.getL()))
                {return 0;}
                else
                {flag1=false;}
            }
            if (zeNu.getV(dancer.getPos()))
            {return -1;}
            if (zeMa.getV(dancer.getPos()) % 2 ==0)
                if (zeMa.getV(dancer.getPos())+dancer.getPos()<=zeMa.getL())
                {
                    wag=zeMa.getV(dancer.getPos())+wag;
                    zeNu.closeP(dancer.getPos());
                    dancer.mFront(zeMa.getV(dancer.getPos()));
                }
                else
                {
                    wag=dancer.getPos()+wag;
                    return wag;
                }
            if (zeMa.getV(dancer.getPos()) % 2 ==1)
                if (dancer.getPos()-zeMa.getV(dancer.getPos())>=0)
                {
                    wag=zeMa.getV(dancer.getPos())+wag;
                    zeNu.closeP(dancer.getPos());
                    dancer.mBack(zeMa.getV(dancer.getPos()));
                }
                else
                {
                    wag=dancer.getPos()+wag;
                    return wag;
                }
        }
        return wag;
    }
}
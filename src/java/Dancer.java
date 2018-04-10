public class Dancer {
    private int Pos;

    public int getPos() {
        return Pos;
    }

    Dancer()
    {
        Pos=0;
    }

    public void mFront(int k)
    {
        for (int i=1; i<=k; i++)
        {
            Pos++;
        }
    }

    public void mBack(int k)
    {
        for (int i=1; i<=k; i++)
        {
            Pos--;
        }
    }
}
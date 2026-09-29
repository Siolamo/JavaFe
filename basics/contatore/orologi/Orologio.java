package orologi;
public class Orologio
{
    private Counter ore,minuti;
    public Orologio()
    {
        ore = new Counter();
        minuti = new Counter();
        ore.reset();
        minuti.reset();
    }

    public void reset()
    {
        minuti.reset();
        ore.reset();
    }

    public void tic()
    {
        minuti.inc();
        if(minuti.getValue()==60)
        {
            ore.inc();
            minuti.reset();
        }
        if(ore.getValue()==24)
        {
            ore.reset();
        }
    }

    public int getMin()
    {
        return minuti.getValue();
    }

    public int getOre()
    {
        return ore.getValue();
    }
    
}

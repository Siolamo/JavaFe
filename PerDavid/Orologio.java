public class Orologio 
{
    private Counter ore;
    private Counter minuti;

    public Orologio()
    {
        ore = new Counter();
        minuti = new Counter();
    }

    public void reset()
    {
        ore.reset();
        minuti.reset();

    }
    public void stampa()
    {
        System.out.println("ore: " + ore.getNumero() + " minuti:" + minuti.getNumero());
    }

    public void tic()
    {
        minuti.inc();
        if (minuti.getNumero()== 60)
        {
            ore.inc();
            minuti.reset();
        }
        if(ore.getNumero()== 24)
            ore.reset();
        
    }
    public int getOre()
    {
        return ore.getNumero();
        
    }
    public int getMinuti()
    {
        return minuti.getNumero();
    }
    
}
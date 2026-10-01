public class Counter 
{
    private int numero;
    public Counter()
    {
        numero=0;
    }
    
    public Counter(int i)
    {
        numero=i;
    }
   
    

    public void inc()
    {
        numero++;
    }

    public int getNumero()
    {
        return numero;
    }

    public void reset()
    {
        numero = 0;
    }


    
}

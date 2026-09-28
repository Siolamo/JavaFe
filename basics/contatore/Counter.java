public class Counter 
{
    private int val; //attributo privato della classe val

    public Counter() //primo costruttore della classe val
    {
        val=0;
    }

    public Counter(int val) //secondo costruttore della classe val
    {
        this.val=val;
    }

    /*
        le classi possono avere per convenzione più costruttori
        in questo caso
        l'utente puo scegliere se fare un Counter "vuoto"
        Counter n1 = new Counter();

        oppure fare un counter modificando "val"

        Counter n2 = new Counter(5);
     */

    public void reset()
    {
        val=0;
    }
    public void inc()
    {
        val++;
    }

    public void dec()
    {
        val--;
    }

    public int getValue()
    {
        return val;
    }

    public void copy(Counter c)
    {
        this.val = c.val;
    }
    
    public boolean equals(Counter c1 )
    {
        return c1.val == this.val;
    }
}

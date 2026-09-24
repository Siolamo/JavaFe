public class Counter {
    private int val;

    public Counter()
    {
        val=0;
    }
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

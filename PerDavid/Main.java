public class Main
{

    public static void main(String[] args)
    {
        
        Counter c;
        c = new Counter(4);
        c.inc();

        System.out.println(c.getNumero());

        Orologio a;
        a= new Orologio();
        a.tic();
        for(int i = 0; i < 60; i++)
        {
            a.tic();
        }
        a.stampa();
    }

}
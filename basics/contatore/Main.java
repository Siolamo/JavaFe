public class Main 
{

    public static void main(String[] args) 
    {
        Counter c1 = new Counter();
        c1.reset();
        c1.inc();
        System.out.println("Cont:" + Integer.toString(c1.getValue()));

        
    }
        

}

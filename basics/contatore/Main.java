public class Main 
{

    public static void main(String[] args) 
    {
        Counter c1 = new Counter();
        c1.reset();
        c1.inc();
        System.out.println("Cont: " + Integer.toString(c1.getValue()));

        Counter c2 = new Counter();
        c2.copy(c1);
        System.out.println("cont2: " + Integer.toString(c2.getValue()));

        System.out.println("is c2 equal to c1? " + c2.equals(c1));
        c2.inc();
        System.out.println("what about now? " + c2.equals(c1));   
        c2.dec();
        System.out.println("Back to normal? " + c2.equals(c1));
    }
        

}

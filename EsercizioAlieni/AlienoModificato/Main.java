public class Main
{

    public static void main(String[] args)
    {
        GruppoAlieni ga=new GruppoAlieni(4);
        ga.aggiungiAlieno(new AlienoOrco(39, "Il fu Mattia Pascal"));
        ga.aggiungiAlieno(new AlienoSerpente(100, "HELL NAH"));
        ga.aggiungiAlieno(new AlienoUomoMarshmallow(100,"NOT HIM"));
        ga.aggiungiAlieno(new AlienoOrco(70, "proprio lui"));
        
        int[] danni = ga.calcolaDanno();

        System.out.println("danni orco: " + danni[2]);
        

        System.out.println("danni serpente: " + danni[1]);
        

        System.out.println("danni marshmallow: " + danni[0]);
        
        
        System.out.println("danni totali: " + danni[3]);
            
            
        
    }

}
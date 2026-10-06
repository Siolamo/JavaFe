public class Main
{

    public static void main(String[] args)
    {
        GruppoAlieni ga=new GruppoAlieni(3);
        ga.aggiungiAlieno(new AlienoOrco(39, "Il fu Mattia Pascal"));
        ga.aggiungiAlieno(new AlienoSerpente(100, "HELL NAH"));
        ga.aggiungiAlieno(new AlienoUomoMarshmallow(100,"the girl sitting near the pole while it isn't raining"));
        
        System.out.println("Danno: "+ga.calcolaDanno());
    }

}
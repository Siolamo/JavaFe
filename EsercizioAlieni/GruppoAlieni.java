public class GruppoAlieni 
{
    private Alieno[] alieni;
    private int indice;
    private final int max;
    public GruppoAlieni(int alieniNum) 
    {
        alieni = new Alieno[alieniNum];
        indice = 0;
        max = alieniNum;
    }

    public void aggiungiAlieno(Alieno nuovoAlieno) 
    {
       if(this.indice!=this.max)
       {
            alieni[indice] = nuovoAlieno;
            this.indice++; 
       }
       else
       {
            System.out.println("spazio nel gruppo finito"); 
       }

    }

    public Alieno[] getAlieni() 
    {
        return alieni; 
    }

    public int calcolaDanno() 
    {
        int danno = 0;
        for(int i = 0; i < indice; i++) 
        {
           danno+= alieni[i].getDanno();
        }
        return danno;
    }
}
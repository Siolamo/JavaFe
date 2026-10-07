public class GruppoAlieni 
{
    private Alieno[] alieni;
    private int indice;
    private final int max;
    private int[] danni;
    public GruppoAlieni(int alieniNum) 
    {
        alieni = new Alieno[alieniNum];
        indice = 0;
        max = alieniNum;
        danni = new int[4];
        for(int i=0;i<4;i++) danni[i] = 0;
        
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

    public int[] calcolaDanno() 
    {
        
        for(int i = 0; i < indice; i++) 
        {
            danni[alieni[i].getIdentificativo()] += alieni[i].getDanno();
            danni[3] += alieni[i].getDanno();
        }

        return danni;
    }
}
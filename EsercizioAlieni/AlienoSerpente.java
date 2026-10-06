public class AlienoSerpente extends Alieno
{
    
    public AlienoSerpente(int vita, String nome)
    {
        super(vita,nome);
        this.danno = 10;
    }

     
    public int getDanno()
    {
        return this.danno;
    }

}
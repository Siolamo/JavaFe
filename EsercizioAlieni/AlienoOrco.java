public class AlienoOrco extends Alieno
{
    
    public AlienoOrco(int vita, String nome)
    {
        super(vita,nome);
        this.danno = 6;
    }

    
    public int getDanno()
    {
        return this.danno;
    }

}

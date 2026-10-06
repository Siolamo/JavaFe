public class AlienoUomoMarshmallow extends Alieno
{
    
    public AlienoUomoMarshmallow(int vita, String nome)
    {
        super(vita,nome);
        this.danno = 1;
    }

    
    public int getDanno()
    {
        return this.danno;
    }

}
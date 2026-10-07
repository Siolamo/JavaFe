public class AlienoUomoMarshmallow extends Alieno
{
    
    public AlienoUomoMarshmallow(int vita, String nome)
    {
        super(vita,nome);
        this.danno = 1;
        this.identificativo = 0;
    }

    
    public int getDanno()
    {
        return this.danno;
    }
    public int getIdentificativo()
    {
        return this.identificativo;
    }

}
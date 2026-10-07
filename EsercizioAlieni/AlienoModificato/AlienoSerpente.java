public class AlienoSerpente extends Alieno
{
    
    public AlienoSerpente(int vita, String nome)
    {
        super(vita,nome);
        this.danno = 10;
        this.identificativo = 1;
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
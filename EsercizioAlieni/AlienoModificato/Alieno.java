public class Alieno 
{

    protected  int salute; // 0=morto, 100=forza piena
    private final String nome;
    protected  int danno;
    protected int identificativo;
    public Alieno(int salute, String nome) 
    {
       
        this.salute = salute;
        this.nome = nome;
    }

    public int getDanno()
    {
        return danno;
    }

    public int getIdentificativo()
    {
        return identificativo;
    }
}
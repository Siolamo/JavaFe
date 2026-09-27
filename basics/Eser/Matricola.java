public class Matricola
{
    private int N_matricola; //attributo
    public int  qualcosa; //attributo 
    private String nome; //
    private int[] voti;
    
    
    public Matricola(String nome) //costtruttore 
    {
        this.nome = nome;
    }

    //getter e setter

    public void CalcoloMediaVoti()
    {
        int TotaleVoti = voti.length;
    }

    public int getN_matricola()
    {
        return N_matricola;
    }

    public boolean setN_matricola(int n)
    {
        if(n>0)
        {
            this.N_matricola= n;
            return true;
        }
        return false;
    }

    


}
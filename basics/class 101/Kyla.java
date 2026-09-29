public class Kyla{
    private int datoPrivato; //datoPrivato utilizzibali solo all'interno di MiaClasse.java
                            // modificabile se esistono appositi metodi setter e getter
    public int datoPubblic; //dato pubblico modificabile anche al di fuori di MiaClasse.java
    protected int datoPerClassiDerivate;

    public Kyla(int x)
    {
        this.datoPrivato = x;
    }

    //metodi setter e getter per dati privati

    public void setDatoPrivato(int x) //metodi pubblicci utilizzabili al di fuori di MiaClasse.java
    {
        this.datoPrivato = x;
    }

    public int getDatoPrivato()
    {
        return this.datoPrivato;
    }
}
public class JoeMama
{
    private int someAssNumber;

    public JoeMama(int n)
    {
        this.someAssNumber = n;
    }
    /*
        ma per qualche motivo, apparte volermi del male, dovrei usare i metodi priati?
        
        semplice, per lo stesso motivo del perchè facciamo gli attributi privati!
        Non vogliamo che nessuno li tocchi o li usi per i loro interessi!

        esempio sotto:
    */


    public void magiK()
    {
        this.myVeryVerySecretCalculationMethod();
        System.out.println("La mia magia di calcolo ultra segreta ha fatto si che il tuo numero si trasformasse in: " + this.someAssNumber);
        
    }

    private int myVeryVerySecretCalculationMethod()
    {
        return ++someAssNumber;
    }
}
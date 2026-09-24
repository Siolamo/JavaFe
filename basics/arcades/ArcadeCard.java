public class ArcadeCard //! in java NOME.java = public class NOME 
{
    private int credits; //numero di crediti della carta
    private final int CardNumber; //numero identificativo della carta

    public ArcadeCard(int CardNumber, int credits) //creo il metodo costruttore che servirà nel main per creare gli oggetti 'ArcadeCard'
    {
        this.credits = credits;  //ho usato gli stessi nomi per gli attributi della classe sia che per i parametri passati dal costruttore
        this.CardNumber = CardNumber; //per non fare confusione tra quale è quale uso 'this' per indicare che sto parlando dell'attributo 
                                      // di questa (this) classe
    }

    public int addCredits(int amount) //metodo per aggiungere crediti (sto cazzo che ve lo spiego se vi ricordate un minimo di C lo sapete leggere benissimo)
    {
        if(amount<=0){ System.err.println("Zero or Negative ammount was given (bozo)"); return 0;}
        this.credits+=amount;
        System.out.println("Amount added succesfully!");
        return 1;
        
    }
    /*
        Metodi getter e setter.
        quando ho un attributo 'private', questo non puo essere ne modificato ne letto da altre classi.
        ma se ho bisogno di, per esempio, dover vedere questo attributo in un altra classe?
        allora si creano dei metodi di tipo getter, un metodo che semplicemente restituisce il valore di quel attributo

        perchè avere sia getter che setter e non rendere semplicemente l'attributo pubblico?

        con un metodo setter abbiamo la possibilità di verificare e di mettere condizioni in caso vogliamo che quel attributo
        prenda solo dei certi valori, se lo rendiamo pubblico, un utente che da un altra classe potrebbe modificare quel valore
        a suo piacimento mettendo la qualsiasi.

        per esempio avendo una classe "Persona", se questa ha l'attributo "età" ed è pubblico, tutti potrebbero fare:
        Persona p1 = new Persona();
        p1.età = -69;

        che non ha un cazzo di senso

        invece con un metodo setter diventa:

        private int eta;

        public setEta(int x)
        {
            if(eta>=0&&<100) this.eta=x;
            else System.out.println("età invalida!");
        }

        quindi in una evventuale altra classe dove si ha
        Persona p1 = new Persona();
        il comando
        p1.età = -69;
        non funzionerà più
        e l'utente sarà costretto (se vuole settare l'età) ad usare il metodo "sicuro" da noi fornito
     */

    public int getCredits()  //metodo getter per credits
    {
        return credits;
    
    }

    public int RemoveCredits(int amount) //figa raga se vi devo spiegare questo mi amputo le palle piuttosto
    {
        if(amount<=0){ System.err.println("Put a positive value you moron"); return 0;}
        this.credits-=amount;
        //System.out.println("Amount removed succesfully!");
        return 1;
        
    }


    public int getCardNumber() //getter per cardNumber
    {
        return CardNumber;
    }
}
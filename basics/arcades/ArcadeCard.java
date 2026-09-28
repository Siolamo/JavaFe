public class ArcadeCard //! in java NOME.java = public class NOME 
{
    private int credits; //numero di crediti della carta
    private final int cardNumber; //numero identificativo della carta

    public ArcadeCard(int cardNumber, int credits) //creo il metodo costruttore che servirà nel main per creare gli oggetti 'ArcadeCard'
    {
        this.credits = credits;  //ho usato gli stessi nomi per gli attributi della classe sia che per i parametri passati dal costruttore
        this.cardNumber = cardNumber; //per non fare confusione tra quale è quale uso 'this' per indicare che sto parlando dell'attributo 
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

        public void setEta(int x)
        {
            if(x>=0&&x<100) this.eta=x;
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

    public boolean  removeCredits(int amount) //figa raga se vi devo spiegare questo mi amputo le palle piuttosto
    {
        if(amount<=0){ System.err.println("Put a positive value you moron"); return false;}
        if(this.credits<amount) {System.out.println("not enough credits"); return false; }
        this.credits-=amount;
        //System.out.println("Amount removed succesfully!");
        return true;
        
    }


    public int getCardNumber() //getter per cardNumber
    {
        return cardNumber;
    }

    
}


/*


public class ArcadeCard //! in java NAME.java = public class NAME 
{
    private int credits; // number of credits on the card
    private final int cardNumber; // identification number of the card

    public ArcadeCard(int cardNumber, int credits) // creating the constructor method that will be used in main to create 'ArcadeCard' objects
    {
        this.credits = credits;  // I used the same names for the class attributes and the parameters passed to the constructor
        this.cardNumber = cardNumber; // to avoid confusion between which is which, I use 'this' to indicate that I'm talking about the attribute 
                                      // of this (this) class
    }

    public int addCredits(int amount) // method to add credits (like hell I'm explaining this to you—if you remember even a little bit of C, you can read this just fine)
    {
        if(amount<=0){ System.err.println("Zero or Negative ammount was given (bozo)"); return 0;}
        this.credits+=amount;
        System.out.println("Amount added succesfully!");
        return 1;
        
    }
    /*
        Getter and Setter methods.
        When I have a 'private' attribute, it can neither be modified nor read by other classes.
        But what if I need to, for example, see this attribute in another class?
        Then you create getter-type methods: a method that simply returns the value of that attribute.

        Why have both getters and setters instead of just making the attribute public?

        With a setter method, we have the ability to verify and set conditions in case we want that attribute
        to only take certain values. If we make it public, a user from another class could modify that value
        however they want, putting whatever garbage in it.

        For example, given a "Person" class, if it has an "age" attribute and it's public, anyone could do:
        Person p1 = new Person();
        p1.age = -69;

        Which makes zero fucking sense.

        Instead, with a setter method it becomes:

        private int age;

        public void setAge(int x)
        {
            if(x>=0&&x<100) this.age=x;
            else System.out.println("invalid age!");
        }

        So in another class where you have:
        Person p1 = new Person();
        the command:
        p1.age = -69;
        will no longer work,
        and the user will be forced (if they want to set the age) to use the "safe" method we provided.
     

    public int getCredits()  // getter method for credits
    {
        return credits;
    
    }

    public boolean removeCredits(int amount) // holy shit guys, if I have to explain this to you I'd rather chop my own balls off
    {
        if(amount<=0){ System.err.println("Put a positive value you moron"); return false;}
        if(this.credits<amount) {System.out.println("not enough credits"); return false; }
        this.credits-=amount;
        //System.out.println("Amount removed succesfully!");
        return true;
        
    }


    public int getCardNumber() // getter for cardNumber
    {
        return cardNumber;
    }

    
}


*/
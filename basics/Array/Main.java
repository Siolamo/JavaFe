public class Main
{

    public static void main(String[] args)
    {

        /*
            Cos'è String[] args?
            Well well my friends

            args, è un array di stringhe (il primo che dice o che solo pensa "grazie al cazzo" lo smonto) in cui vanno tutti gli argomenti della linea di comando.

            Cosa sono gli argomenti della linea di comando? (you should know this but i know at least one of you don't)

            Noi per eseguire il programma facciamo 2 passaggi

            1) compilazione: usando javac (javac(ompiler)) ex: javac *.java //compila tutti i file che finiscono per .java
            2) esecuzione: usando java ex: java Main (se col comiler abbiamo compilato una classe Main.java)

            ora immaginiamo di voler fare un programma
            per esempio 
            Un programma che semplicemente, ci chiede di isn<erire una frase come input, e la stampa

            quindi si avra un programma del tipo:
            public class Main{
            
                public static void main(String[] args)
                {
                    String s;
                    System.out.println("Inserisci Stringa: ");
                    StandartInput(s): //vediamo più avanti come si fa davvero, per ora immaginate che questa funzione funzioni tipo come una scanf
                    System.out,println("La frase inserita è: " + S);
                }

            }


            Molto bene,questo progarmma è corretto, e funziona, è "comodo"? 
            No, manco per il cazzo, perchè?
            Immaginate di essere un povero cristo che sta eseguendo sto programma dal terminale
            
            sto cristo deve
            eseguire il programma, quindi scrivere
            java Main
            
            aspettare che il programma arrivi all'input
            Inserisci Stringa: 

            inserire la stringa
            ed alla fine di tutto gli viene stampata.


            si puo fare in maniera più "comoda"?
            assolutamente si, usando "args".

            se noi invece che far aspettare l'utente che gli esca il dialogo di input gli volessimo far scrivere qualcosa tipo

            java Main "la mia frase"

            possiamo farli saltare un enrome step e
            possiamo farlo grazie ad args.


            args è l'array degli "argomenti" della riga di comando (come abbiam detto prima), nell'esempio sopra  ' java Main "La mia frase" ' c'è 1 Argomento, la stringa "La mia frase"

            quindi gli "argomenti da linea di comando", sono tutto quello che noi mettiamo dopo il nome dell'eseguibile quando andiamo ad eseguire il programma.

            "eh ma allora è uguale a C"
            Si dio maial.

            servono solo a rendere il programma più "comodo", nah, file stuff, boh si fa sempre roba estremamente figa con gli argomenti da linea di comando, però per quanto riguarda il nostro corso
            Si, servono solo per comodità all'utilizzo.

            "eh ma io in C avevo anche argc che era il numero degli argomenti passati via linea di comando!!"

            vuoi argc? createlo.

            args è un array

            TUTTI gli array in java (a differenza di C) possiedono l'attributo "length"

            vuoi sapere quanti argomenti l'utente a messo?

            int argc = args.length;

            ecco, niente di più niente di meno

            !!ATTENZIONE PERÒ NON È ESATTAMENTE COME IN C

            IN C come argomento da linea di comando veniva contato anche il nome dell'eseguibile
            in java si inizia a contare dal primo argomento che sia chiaro!!


            to be continued...


        */



       int argc = args.length; 
        
    }

}
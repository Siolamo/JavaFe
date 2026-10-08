import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Quanti alieni vuoi inserire?");
        
        int nalieni = Integer.parseInt(n.nextLine());


        GruppoAlieni ga=new GruppoAlieni(nalieni);

        for (int i = 0; i < nalieni; i++) // a Ilaria non piace "gogogogog"
        {   
            System.out.println("Inserisci i dati dell'alieno:");
            System.out.println("nome: ");
            
            String nome = n.nextLine();

            System.out.println("Vita: ");
            int vita = Integer.parseInt(n.nextLine());
            boolean notvalid=true;
            while(notvalid)
            {
                    
                System.out.println("Che tipo di alieno è  "+ nome +"\n1)Uomo Marshmallow\n2)Serpente\n3)Orco\n");
                int ch = Integer.parseInt(n.nextLine());
                if(ch>=0||ch<=3) 
                {
                    switch (ch) {
                        case 1 -> {
                            notvalid=false;
                            ga.aggiungiAlieno(new AlienoUomoMarshmallow(vita,nome));
                        }
                        case 2 -> {
                            notvalid=false;
                            ga.aggiungiAlieno(new AlienoSerpente(vita,nome));
                        }
                        case 3 -> {
                            notvalid=false;
                            ga.aggiungiAlieno(new AlienoOrco(vita,nome));
                        }
                        default -> {
                            System.out.println("scelta non valida");
                        }
                    }
                }

            }

                        
        }
        
        int[] danni = ga.calcolaDanno();
        n.close();

        System.out.println("danni orco: " + danni[2]);
        

        System.out.println("danni serpente: " + danni[1]);
        

        System.out.println("danni marshmallow: " + danni[0]);
        
        
        System.out.println("danni totali: " + danni[3]);
        
            
        
    }

}
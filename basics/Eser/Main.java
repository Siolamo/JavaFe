public class Main {
    
    public static void main(String[] args) 
    {
        
        System.out.println("Hello world!");
                
        Matricola n1 = new Matricola("Fabio");
        Matricola n2 = new Matricola("Ilaria");
        Matricola n3 = new Matricola("Giovanni");
        n2.setN_matricola(21251);
        n3.setN_matricola(435435);
        
        if(n1.setN_matricola(8080))
        {
            System.out.println("Nunmerico di matricola inserito correttamente");
        }
        else
        {
            System.out.println("vfat dar in tal cul");
        }



        if(n1.getN_matricola()==432432)
        {
            System.out.println("affaunclo");            
        }
        else
        {
            System.out.println("non sei lui");
        }
        

    }
    /*
        if
        else
        for
        while
        switch
        +,-,* ecc...
    */

}

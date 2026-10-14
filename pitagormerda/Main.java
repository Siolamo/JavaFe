
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main
{

    public static void main(String[] args) throws IOException
    {

        FileWriter f = new FileWriter("fuck.txt");
        PrintWriter pe = new PrintWriter(f); 

        for(int i=1;i<11;i++)
        {
            for (int j = 1; j < 11; j++) 
            {
                pe.printf("%d\t", i*j);                
            }
            pe.println();
            
        }

        pe.close();
        
    }

}
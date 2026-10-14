
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main
{

    public static void main(String[] args)
    {

        String line,name;
        int units;
        float price;
        int counter=0;
        InventoryItem[] items = new InventoryItem[10];
        try
        {
            FileReader f = new FileReader("inventory.dat");
            BufferedReader theFile = new BufferedReader(f);

            line = theFile.readLine();
            while(line!=null)
            {
                StringTokenizer t = new StringTokenizer(line);
                try
                {
                    name=t.nextToken();
                    units=Integer.parseInt(t.nextToken());
                    price = Float.parseFloat(t.nextToken());
                    items[counter] = new InventoryItem(name, units, price);
                    ++counter;
                    line = theFile.readLine();
                }
                catch(NumberFormatException e)
                {
                    System.out.println(e.getMessage());
                    
                }
            }

            for (int i = 0; i < counter; i++) {
                System.out.println(items[i]);
                
            }
            theFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            
        }
        
    }

}
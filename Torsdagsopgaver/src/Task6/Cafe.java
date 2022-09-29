package Task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe
{
    private ArrayList<String> coffeeMenu;

   public Cafe() {
       this.coffeeMenu = new ArrayList<>();
   }

    public void loadMenuDate()
    {


        File file = new File("coffees.txt");
        try
        {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                coffeeMenu.add(scanner.nextLine());
            }


        }
        catch (FileNotFoundException e)
        {
            System.out.println("Can't find file. Check path and filename");
        }
    }

}

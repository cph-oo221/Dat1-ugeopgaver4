package Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{
    ArrayList<String> options;

    public Menu(ArrayList<String> options)
    {
        this.options = options;
    }


    public String showMenu()
    {
        System.out.println("Type a number to choose");
        int i = 0;

        for (String option  : getOptions())
        {

            System.out.println( ++i + ") "+ option);
        }

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        return choice;
    }





    public ArrayList<String> getOptions()
    {
        return options;
    }
}

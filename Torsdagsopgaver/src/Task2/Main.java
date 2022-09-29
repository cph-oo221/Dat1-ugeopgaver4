package Task2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your name");
        String name = scan.nextLine();

        System.out.println("Hallo " + name + "!");
        System.out.println("Please type your age");
        int age = scan.nextInt();
        System.out.println("WOw you're " + age + " old!?!");

        int result = 67 - age;
        if(result<=0)
        {
            System.out.println("you can retire");
        }
        else
        {
            System.out.println("You can retire in " + result + " years");
        }


    }





}

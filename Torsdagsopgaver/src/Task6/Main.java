package Task6;


public class Main
{
    public static void main(String[] args)
    {
        Cafe cafe = new Cafe();

        cafe.loadMenuDate();

        System.out.println(cafe.getCoffeeMenu());
    }
}

import java.lang.Character;

public class Main
{
    public static void main(String[] args)
    {
        Staff staffOfTheKingsCryptOfTheForsaken = new Staff(5, 15, "Nicke");
        Staff magicStick = new Staff(0, 7);

        Wizard gandalf = new Wizard(50, 8, 40, staffOfTheKingsCryptOfTheForsaken);
        Wizard dumboldore = new Wizard(40, 49, true, 70, magicStick);

        System.out.println(gandalf);
        System.out.println(dumboldore);
        System.out.println();

        gandalf.boostedAttack(dumboldore, 12, 12);
        dumboldore.boostedAttack(gandalf, 9, 30);
        System.out.println("Attack");
        System.out.println();

        System.out.println(gandalf);
        System.out.println(dumboldore);
        System.out.println();

        gandalf.boostedAttack(dumboldore, 8, 10);
        System.out.println("Attack");
        System.out.println();

        System.out.println(gandalf);   
        System.out.println(dumboldore);
        System.out.println();

        Bard musicGuy = new Bard(25, 5, 130, 0.1);

        System.out.println(musicGuy);
        System.out.println();

        musicGuy.changeBac(0.9);
        System.out.println("Night out");
        System.out.println();

        System.out.println(musicGuy);
        System.out.println();
    }
}
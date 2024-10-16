import java.lang.Character;

public class Main
{
    public static void main(String[] args)
    {
        Staff staffOfTheKingsCryptOfTheForsaken = new Staff(5, 15, "Adidos");
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

        System.out.println("Gandalf health: " + gandalf.getHealth());
        System.out.println("Dumboldore health: " + dumboldore.getHealth());
        System.out.println("Dumboldore is alive: " + dumboldore.isAlive());
        System.out.println();

        gandalf.boostedAttack(dumboldore, 8, 10);
        System.out.println("Attack");
        System.out.println();

        System.out.println("Gandalf health: " + gandalf.getHealth());
        System.out.println("Dumboldore health: " + dumboldore.getHealth());
        System.out.println();

        Bard musicGuy = new Bard(25, 5, 130, 0.1);

        System.out.println(musicGuy);
        System.out.println();

        musicGuy.changeBac(0.9);
        System.out.println("Night out");
        System.out.println();

        System.out.println("Maximum bac for driving: " + Bard.MAX_LEGAL_BAC);
        System.out.println("Music guy bac: " + musicGuy.getBac());
        System.out.println("Music guy bac: " + musicGuy.canDrive());
        System.out.println();

        Orc bigGuy = new Orc(90, 45, 7, 7);

        System.out.println(bigGuy);
        System.out.println();

        bigGuy.attack(gandalf, 15);
        System.out.println("Attack");
        System.out.println();

        System.out.println("Gandalf health: " + gandalf.getHealth());
        System.out.println();

        Bard fighter1 = new Bard(5, 0, 10, 1.8);
        Orc fighter2 = new Orc(5);
        Wizard fighter3 = new Wizard(20, 0, 20, null);

        fighter1.setHealth(27);
        fighter2.setHealth(40);

        fighter2.setDT(3);
        fighter2.setWeaponBst(5);

        Entity[] fighters = new Entity[3];

        fighters[0] = fighter1;
        fighters[1] = fighter2;
        fighters[2] = fighter3;

        System.out.println("Fighters:");
        for (Entity e : fighters)
        {
            System.out.println(e);
        }

        System.out.println();

        System.out.println("Fight");
        fighters[0].attack(fighters[1], 10);
        fighters[1].attack(fighters[0], 10);
        fighters[2].attack(fighters[1], 10);
        fighters[1].attack(fighters[0], 10);
        fighters[2].attack(fighters[1], 10);
        fighters[1].attack(fighters[2], 10);
        fighters[2].attack(fighters[1], 10);

        System.out.println();

        System.out.println("Fighters:");
        for (Entity e : fighters)
        {
            System.out.println(e);
        }

        System.out.println();

        System.out.println("Number of entities: " + Entity.getNumEntities());

    }
}
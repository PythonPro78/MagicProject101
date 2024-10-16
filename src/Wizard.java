public class Wizard extends Entity
{
    // VARIABLES
    private int mana;
    private Staff staff;

    // CONSTRUCTORS
    public Wizard(int health, int money, boolean alive, int mana, Staff staff)
    {
        super(health, money, alive);

        this.mana = mana;
        this.staff = staff;
    }

    // SETTERS

    // GETTERS

    // BRAIN METHODS
}
